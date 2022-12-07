package src.bdextra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StoreProcedure {

    public static String create() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pcbang-chain", "javapp", "azerty123&é\"");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE PROCEDURE " +
                    "GetEmployeeByName(IN employeeName VARCHAR(255))"
                    +"LANGUAGE SQL "
                    +"DETERMINISTIC "
                    +"SQL SECURITY DEFINER "
                    +"BEGIN "
                    +"SELECT * FROM employee WHERE name = employeeName;"
                +"END");
            con.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Store procedure created!";
    }
}