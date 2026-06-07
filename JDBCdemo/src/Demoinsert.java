import java.sql.*;
import java.util.Scanner;

public class Demoinsert {
	
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
	            
	            System.out.print("Enter Employee Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Salary: ");
	            double salary = sc.nextDouble();
	            
	            //SQL Query
	            
	           String query="InSERT INTO emp(id,name,salary)values(?,?,?)";
	           
	           //create prepared statement 
	           
	           PreparedStatement ps =
	                    con.prepareStatement(query);

	            // Set Values
	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setDouble(3, salary);

	            // Execute Query
	            int rows = ps.executeUpdate();

	            if (rows > 0) {
	                System.out.println("Employee Inserted Successfully");
	            } else {
	                System.out.println("Insertion Failed");
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
