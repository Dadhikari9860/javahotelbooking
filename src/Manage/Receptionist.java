package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.ReceptionistLogin;


public class Receptionist {
	public ReceptionistLogin login(ReceptionistLogin user) {
		String sql="select*from receptionist where Email=? and password=?";
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/assignment","root","");
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setString(1, user.getEmail());
			pstat.setString(2, user.getPassword());
			//run sql statement
			ResultSet rs=pstat.executeQuery();
				while(rs.next()) {
					user.setRecid(rs.getInt("Recid"));
					user.setIsUser(true);
				}
			
			
		}
			catch(Exception ex) {
				System.out.println("error:"+ex.getMessage());
				
			}
		return user;

	}
	}



