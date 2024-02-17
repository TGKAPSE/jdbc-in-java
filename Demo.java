package in.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name;
		name=s.nextLine();
		System.out.println("Enter the email");
		String email;
		email=s.nextLine();
		System.out.println("Enter the Password");
		String pass;
		pass=s.nextLine();
		System.out.println("Enter the gender");
		String gender;
		gender=s.nextLine();
		System.out.println("Enter the City");
		String city;
		city=s.nextLine();
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yashtech","root","root");
		PreparedStatement ps= con.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,pass);
		ps.setString(4,gender);
		ps.setString(5,city);
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
