package src;

public class GlobalVariable {
    public static int port = 3306;
    public static String host = "localhost";
    public static String db_name = "pcbang-chain";
    public static String username = "javapp";
    public static String password = "azerty123&é\"";
    public static String url = String.format("jdbc:mysql://%s:%s/%s",host,String.valueOf(port),db_name);

}
