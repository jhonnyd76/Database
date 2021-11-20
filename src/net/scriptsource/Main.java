package net.scriptsource;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DatabaseData conData = new DatabaseData();
            try(Connection con = DriverManager.getConnection(
                    conData.getURL(),
                    conData.getUSER(),
                    conData.getPASSWORD());
                ){
                System.out.println("Connection OK");
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM city_list");
                while (resultSet.next()){
                    System.out.printf("%d: City Name: %s%n",
                            resultSet.getInt("city_list_id"),
                            resultSet.getString("city_list_name"));
                }
                Statement insertStatement = con.createStatement();
                /*
                int result = insertStatement.executeUpdate("INSERT INTO city_list (city_list_name) VALUES ('Chur');");
                System.out.println(result);
                 */
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("Connection NOK");
            }
    }
}
