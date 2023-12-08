package Model;

public class ViewBook {
	private int Bid;
	private String CheckInDate;
	public String CheckOutDate;
	private String BookingStatus;
	private String Guest_Name;
	private String RoomType;
	public ViewBook() {
		
		Bid = 0;
		CheckInDate = "";
		CheckOutDate = "";
		BookingStatus = "";
		Guest_Name = "";
		RoomType = "";

	}
	public ViewBook(int bid, String checkInDate, String checkOutDate, String bookingStatus, String guest_Name,
			String roomType) {
		super();
		Bid = bid;
		CheckInDate = checkInDate;
		CheckOutDate = checkOutDate;
		BookingStatus = bookingStatus;
		Guest_Name = guest_Name;
		RoomType = roomType;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return CheckOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		CheckOutDate = checkOutDate;
	}
	public String getBookingStatus() {
		return BookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		BookingStatus = bookingStatus;
	}
	public String getGuest_Name() {
		return Guest_Name;
	}
	public void setGuest_Name(String guest_Name) {
		Guest_Name = guest_Name;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	@Override
	public String toString() {
		return "ViewBook [Bid=" + Bid + ", CheckInDate=" + CheckInDate + ", CheckOutDate=" + CheckOutDate
				+ ", BookingStatus=" + BookingStatus + ", Guest_Name=" + Guest_Name + ", RoomType=" + RoomType + "]";
	}
	
	
}