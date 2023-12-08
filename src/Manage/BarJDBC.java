package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Model.Barm;

public class BarJDBC {
	private static Connection conn;

	public boolean add(Barm bar) {
		boolean result = false;
		String url = "jdbc:mysql://localhost/Assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "INSERT INTO resturant values(?,?,?,?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, bar.getBarId());
			pstat.setString(2, bar.getDrinks());
			pstat.setInt(3, bar.getPerPrice());
			pstat.setInt(4,bar.getQuantity());
			pstat.setString(5,bar.getTotalPrice());
			pstat.setString(6,bar.getCreditCard());
			
			
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