package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Registrate;
import Model.User;

public class JDBC {
public User login(User user) {
	String sql="select*from customer where UserName=? and UserPassword=?";
	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/assignment","root","");
		PreparedStatement pstat=conn.prepareStatement(sql);
		pstat.setString(1, user.getUserName());
		pstat.setString(2, user.getUserPassword());
		//run sql statement
		ResultSet rs=pstat.executeQuery();
			while(rs.next()) {
				user.setRid(rs.getInt("Rid"));
				user.setUser(true);
			}
		
		
	}
		catch(Exception ex) {
			System.out.println("error:"+ex.getMessage());
			
		}
	return user;

}
}
