package delete;
    
    import db.DBConnection;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.util.Scanner;
    
    public class DeleteStudent {
        public void deleteById() {
            Scanner sc = new Scanner(System.in);
            try (Connection conn = DBConnection.getConnection()) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();
                String query = "DELETE FROM students WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                int rows = ps.executeUpdate();
                System.out.println(rows > 0 ? "Student deleted successfully!" : " No record found with that ID.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
