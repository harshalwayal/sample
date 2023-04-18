package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Staff;

public class Dao {
	public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException {
		System.out.println("Step 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk", "root", "root");
		System.out.println("Step 3");
		Statement stmt = con.createStatement();
		String sql = "select * from staff";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("step 4");
		ArrayList<Staff> al = new ArrayList<Staff>();
		
		 while (rs.next()) {
			 String id = rs.getString(1);
			 String name = rs.getString(2);
			 String salary = rs.getString(3);
			 String designation = rs.getString(4);
			Staff s = new Staff();
			s.setId(id);
			s.setName(name);
			s.setSalary(salary);
			s.setDesignation(designation);
			
			al.add(s);
			 
			 
			 System.out.println(id+ " "+name+" "+salary+" "+designation);
		 }
		 return al;
	}


}
