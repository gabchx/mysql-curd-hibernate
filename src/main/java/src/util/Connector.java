package src.util;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Connector {
    private String password;
    private int port;
    private String url;
    private String host;
    protected Connection connection;
    private String name;
    private String username;

    public Connector(String Host,String Name,int Port){
        this.host = Host;
        this.name = Name;
        this.port = Port;
        this.username = "";
        this.password = "";
        this.url = String.format("jdbc:mysql://%s:%s/%s",Host,String.valueOf(Port),Name);
    }

    public String getHost(){ return this.host; }
    public int getPort(){
        return this.port;
    }
    public String getName(){
        return this.name;
    }
    public String getUrl(){
        return this.url;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    public boolean Connect(String Username , String Password){
        this.username = Username;
        this.password = Password;
        boolean connected = false;
        try (Connection testConnection = DriverManager.getConnection(this.url, Username, Password)) {
            this.connection = testConnection;
            System.out.println("Database connected!");
            connected = true;
            this.connection.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!"+e);
        }
        return connected;
    }

    public String Query(String query){
        String toReturn = "";
        try {
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery(query);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) toReturn += ",\t";
                    String columnValue = resultSet.getString(i);
                    toReturn += rsmd.getColumnName(i)+" : "+columnValue;
                }
                toReturn+=";\n";
            }
            this.connection.close();
        } catch (SQLException e) {
            toReturn = "Cannot execute query\n"+e;
        }
        return toReturn;
    }
}
