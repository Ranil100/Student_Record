package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/College DB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password"; // replace it

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("DB connection failed: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        if(getConnection()!=null){
            System.out.println("Successfully Connected");
        }
        else{
            System.out.println("Check your DB settings again");
        }
    }
}
