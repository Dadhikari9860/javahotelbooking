package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Model.ResturantModel;

public class ResturantJDBC {
	private static Connection conn;

	public boolean add(ResturantModel reg) {
		boolean result = false;
		String url = "jdbc:mysql://localhost/Assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "INSERT INTO resturant values(?,?,?,?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, reg.getFid());
			pstat.setString(2, reg.getFoodItem());
			pstat.setInt(3, reg.getPerPrice());
			pstat.setInt(4,reg.getQuantity());
			pstat.setString(5,reg.getTotalPrice());
			pstat.setString(6,reg.getCreditCard());
			
			
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
