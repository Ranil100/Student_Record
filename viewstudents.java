package view;

import db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class viewstudents {
    public void displayStudents() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("\nID | Name | Age | Department | Email | Phonenumber");
            System.out.println("--------------------------------------------");
            while (rs.next()) {
                System.out.printf("%d | %s | %d | %s | %s | %s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("department"),
                        rs.getString("email"),
                        rs.getString("phonenumber"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

