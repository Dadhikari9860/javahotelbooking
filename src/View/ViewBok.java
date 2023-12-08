package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Book;

public class ViewBok {
	public List allPersons() {
		List persons = new ArrayList<Book>();
		String url = "jdbc:mysql://localhost/assignment";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
	
			String sql = "SELECT * FROM booking2";
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				int Bid = rs.getInt("Bid");
				String CheckInDate = rs.getString("CheckInDate");
				String  CheckOutDate = rs.getString("CheckOutDate");
				String Guest_Name = rs.getString("Guest_Name");
				String BookingStatus=rs.getString("BookingStatus");
				String RoomType=rs.getString("RoomType");
				persons.add(new Book(Bid,CheckInDate,CheckOutDate,Guest_Name,BookingStatus,RoomType));
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return persons;
	}
	public boolean update(int Bid, String CheckInDate, String CheckOutDate, String Guest_Name,String BookingStatus,String RoomType) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
			String sql = "UPDATE booking2 set CheckInDate=?, CheckOutDate=?,Guest_Name=?,BookingStatus=?,RoomType=? WHERE Bid=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, CheckInDate);
			pstat.setString(2,CheckOutDate );
			pstat.setString(3, Guest_Name);
			pstat.setString(4,BookingStatus);
			pstat.setString(5,RoomType);
			pstat.setInt(6,Bid);

			pstat.executeUpdate();
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
		
}
	public boolean delete(int Bid) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
			String sql = "DELETE FROM booking2 WHERE Bid=?"; 
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, Bid);
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
		}}
