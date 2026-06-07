
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demoretrive {
	 public static void main(String[] args) {

	        String url = "jdbc:mysql://localhost:3306/sitj2";
	        String username = "root";
	        String password = "root";

	        try {

	            // Create Connection
	            Connection con = DriverManager.getConnection(
	                    url, username, password);

	            // SQL Query
	            String query = "SELECT * FROM emp";

	            // Create Statement
	            Statement stmt = con.createStatement();

	            // Execute Query
	            ResultSet rs = stmt.executeQuery(query);

	            System.out.println("--------------------------------");
	            System.out.println("ID\tNAME\tSALARY");
	            System.out.println("--------------------------------");

	            // Read Records
	            while (rs.next()) {

	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                double salary = rs.getDouble("salary");

	                System.out.println(
	                        id + "\t" + name + "\t" + salary);
	            }

	            // Close Resources
	            rs.close();
	            stmt.close();
	            con.close();

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
