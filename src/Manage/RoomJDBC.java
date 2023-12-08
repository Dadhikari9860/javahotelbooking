package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Book;
import Model.Room;
import Model.ViewBook;



public class RoomJDBC {
	private static Connection conn;
	
	public boolean add(int Bid,int RoomNum,int Price,int Floor,int NumberOfRoom,int TotalBill) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
			String sql = "UPDATE booking2 set RoomNum=?,Price=?,Floor=?,NumberOfRoom=?,TotalBill=? WHERE Bid=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1,RoomNum);
			pstat.setInt(2, Price);
			pstat.setInt(3,Floor);
			pstat.setInt(4,NumberOfRoom);
			pstat.setInt(5, TotalBill);
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

	public boolean add(Room s1) {
		// TODO Auto-generated method stub
		return false;
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
		}
}
