package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Model.ViewBook;

public class JDBC3 {
	
	private static Connection conn;

	public boolean Save(ViewBook s1) {
		boolean result = false;
		String url = "jdbc:mysql://localhost/assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "INSERT INTO booking2(Bid,CheckInDate,CheckOutDate,Guest_Name,BookingStatus,RoomType)values(?,?,?,?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, s1.getBid());
			pstat.setString(2,s1.getCheckInDate());
            pstat.setString(3,s1.getCheckOutDate());
            pstat.setString(4,s1.getGuest_Name());
			pstat.setString(5,s1.getBookingStatus());
			pstat.setString(6,s1.getRoomType());
		
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
