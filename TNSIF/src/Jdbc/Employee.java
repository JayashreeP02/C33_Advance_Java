package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws Exception {
		//Give the method Which you want(Read,update,insert,delete)
		Read();

	}
	
	//Read
		public static void Read()throws Exception{
	     String query="select * from Employee_details";
			
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","1234");
			Statement st=con.createStatement();
			ResultSet rs =st.executeQuery(query);
			while(rs.next()) {
				 System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getLong(4)+","+rs.getLong(5));
			}
						con.close();
			
		}
		
	
	//insert
	public static void insertRecord()throws Exception{
		String query="insert into employee_details values (2,'dharshina','Ece',915025677,600000),(3,'muni','cse',918725677,550000)";
		
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","1234");
		Statement st=con.createStatement();
		int rows =st.executeUpdate(query);
		System.out.println("Number of rows affected:"+rows);
		con.close();

	}

	
	//delete
	public static void delete()throws Exception{
     String query="delete from employee_details where EmpId=2";
		
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","1234");
		Statement st=con.createStatement();
		int rows =st.executeUpdate(query);
		System.out.println("Number of rows affected:"+rows);
		con.close();
		
	}
	
	
	//update
		public static void update()throws Exception{
	     String query="update employee_details set salary=700000 where EmpId=1";
			
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","1234");
			Statement st=con.createStatement();
			int rows =st.executeUpdate(query);
			System.out.println("Number of rows affected:"+rows);
			con.close();
			
		}
}
