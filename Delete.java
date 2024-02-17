package in.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
 
	public static void main(String args[])throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the city");
		String city;
		city=s.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yashtech","root","root");
		PreparedStatement ps=con.prepareStatement("DELETE FROM student WHERE city=?");
		ps.setString(1, city);
      int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Successfully Done");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}
}
