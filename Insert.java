package in.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
	public static void main(String args[]) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the City Name");
		String city;
		city=s.nextLine();
		System.out.println("Enter the  Name");
		String name;
		name=s.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yashtech","root","root");
		PreparedStatement ps=con.prepareStatement("update student set city=? where name=?");
		ps.setString(1, city);
		ps.setString(2, name);
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
