package update;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {
    public void updateEmail() {
        Scanner sc = new Scanner(System.in);
        try (Connection conn = DBConnection.getConnection()) {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("Enter new email: ");
            String newEmail = sc.nextLine();

            String query = "UPDATE students SET email = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, newEmail);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Student updated successfully!" : "No record found with that ID.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
