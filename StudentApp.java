package main;

import add.AddStudent;
import view.viewstudents;
import update.UpdateStudent;
import delete.DeleteStudent;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddStudent add = new AddStudent();
        viewstudents view = new viewstudents();
        UpdateStudent update = new UpdateStudent();
        DeleteStudent delete = new DeleteStudent();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Email");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> add.addStudent();
                case 2 -> view.displayStudents();
                case 3 -> update.updateEmail();
                case 4 -> delete.deleteById();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
