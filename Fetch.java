package in.fetech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch {

	public static void main(String args[])throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yashtech","root","root");
		PreparedStatement ps=con.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		String name1;
		String email1;
		String password1;
		String gender1,city1;
		while(rs.next())
		{
		    name1=rs.getString("name");
		    System.out.println("Name = "+name1);
		    
	        email1=rs.getString("email");
	        System.out.println("Email = "+email1);
	        
		    password1=rs.getString("password");
		    System.out.println("Password = "+password1);
		    
		    gender1=rs.getString("gender");
		    System.out.println("Gender = "+gender1);
		    
		    city1=rs.getString("city");	
		   	System.out.println("City = "+city1);
		   	System.out.println("________________________________________________");
	
		}
		
		
	}
}
