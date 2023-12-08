package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Registrate;

public class JDBC1 {
	private static Connection conn;

	public boolean save(Registrate reg) {
		boolean result = false;
		String url = "jdbc:mysql://localhost/Assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "INSERT INTO customer values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, reg.getRid());
			pstat.setString(2, reg.getFullName());
			pstat.setString(3, reg.getAddress());
			pstat.setString(4,reg.getPhoneNum());
			pstat.setString(6,reg.getCreditCardInfo());
			pstat.setString(5,reg.getEmail());
			pstat.setString(7,reg.getUserPassword());
			pstat.setString(8,reg.getUserName());
			pstat.setString(9,reg.getTypeOfCustomer());
			
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
