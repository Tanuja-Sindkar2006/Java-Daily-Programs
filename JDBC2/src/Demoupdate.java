
import java.sql.*;
import java.util.Scanner;

public class Demoupdate {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 try
		 {

	            // Database Connection Details
	            String url = "jdbc:mysql://localhost:3306/sitj2";
	            String username = "root";
	            String password = "root";

	            // Establish Connection
	            Connection con = DriverManager.getConnection(
	                    url, username, password);

	            // Take Input from User
	            System.out.print("Enter Employee ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Salary: ");
	            double salary = sc.nextDouble();
	            
	            //SQL Query
	            
	           String query="UPDATE emp SET salary=? WHERE id=?";
	           
	           //create prepared statement for executing the query 
	           
	           PreparedStatement ps =
	                    con.prepareStatement(query);

	            // Set Values
	           	ps.setDouble(1, salary);
	            ps.setInt(2, id);

	            // Execute Query
	            int rows = ps.executeUpdate();

	            if (rows > 0) {
	                System.out.println("Salary Updated Successfully");
	            } else {
	                System.out.println("Employee ID Not Found");
	            }
	            
	            ps.close();
	            con.close();
	            sc.close();
		    }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	

}

