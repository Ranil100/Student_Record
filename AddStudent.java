package add;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddStudent {
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        try (Connection conn = DBConnection.getConnection()) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt(); sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter phonenumber: ");
            String phone = sc.nextLine();

            String query = "INSERT INTO students (name, age, department, email, phonenumber) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, dept);
            ps.setString(4, email);
            ps.setString(5, phone);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Student added successfully!" : " Failed to add student.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
