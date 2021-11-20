package net.scriptsource;

public class DatabaseData {
    private static final String URL = "jdbc:mysql://localhost:3306/gtc2";
    private static final String USER= "jhonnyd";
    private static final String PASSWORD ="Gniffi1234.";

    public static String getURL() {
        return URL;
    }
    public static String getUSER() {
        return USER;
    }
    public static String getPASSWORD() {
        return PASSWORD;
    }
}
