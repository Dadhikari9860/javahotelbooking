package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Model.ServicesModel;



public class ServicesJDBC {
	private static Connection conn;

	public boolean add(ServicesModel reg) {
		boolean result = false;
		String url = "jdbc:mysql://localhost/Assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "INSERT INTO services values(?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, reg.getSid());
			pstat.setString(2, reg.getServices());
			pstat.setInt(3, reg.getTotalPrice());
		
			
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("error" + ex.getMessage());
		}
		return result;

	}


}
