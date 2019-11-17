package com.check.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Classjdbc {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
		            "postgres", "pritesh");

			/*PreparedStatement pst=con.prepareStatement
					 ("INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS) "
			            + "VALUES (10, 'From Java', 32, 'California');");*/
			
			/*PreparedStatement pst=con.prepareStatement
					 ("INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS) "
			            + "VALUES (?, ?, ?,?);");*/
			/*pst.setInt(1, 11);
			pst.setString(2, "From ? String");
			pst.setInt(3, 22);
			pst.setString(4, "Java");*/
			String sql="Select * from COMPANY";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				System.out.println("ID:"+ rst.getInt(1) + ":" + rst.getString(2) + ":" + rst.getInt(3) 
				+ ":" + rst.getString(4) );
			}
			rst.close();
			pst.close();
			//con.commit();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
