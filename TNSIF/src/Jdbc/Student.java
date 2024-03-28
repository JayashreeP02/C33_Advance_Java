package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
  public static void main(String[]args) throws Exception {
	  try {
		  //driver(connection establish)
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //connection=getConnection(url,username,password)
		  
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif","root","1234");
		  System.out.println("Connection Established");
		  
		  //statement
		  
		  Statement s=con.createStatement();
		  
		  //sendQuery
		  
		  String sql="insert into student" + "( id,Name,Mark1,Mark2,Total )" + "value(104,'dharshina',80,90,170)";
		  s.executeUpdate(sql);
		  System.out.println("Insertion Completed");
		  
		  //Result Set
		  
		  ResultSet rs = s.executeQuery("select * from student");
		  
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"/t"+rs.getInt(5));
			  
		  }
		  
		  
	  } 
	  
	  catch(Exception e) {
		  System.out.println(e);
		  
	  }
	  
	
	  
  }

}

//CRUD
//Create,Retrive,Update,Delete
