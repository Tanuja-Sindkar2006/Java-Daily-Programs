import java.sql.*;
import java.util.Scanner;

public class Demodelete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Database Connection Details
            String url = "jdbc:mysql://localhost:3306/sitj2";
            String username = "root";
            String password = "root";

            // Establish Connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Take Employee ID Input
            System.out.print("Enter Employee ID to Delete: ");
            int id = sc.nextInt();

            // SQL Delete Query
            String query = "DELETE FROM emp WHERE id=?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // Set Value
            ps.setInt(1, id);

            // Execute Delete
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee ID Not Found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}