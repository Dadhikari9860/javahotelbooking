package Model;

public class CheckIn {
private int Bid;
private String CheckInDate;
public String CheckOutDate;
private String BookingStatus;
private String Guest_Name;
private String RoomType;
private int RoomNum;
private String Price;
private String Floor;
public CheckIn() {
	
	Bid = 0;
	CheckInDate = "";
	CheckOutDate = "";
	BookingStatus = "";
	Guest_Name = "";
	RoomType = "";
	RoomNum = 0;
	Price = "";
	Floor = "";
}

public CheckIn(int bid, String checkInDate, String checkOutDate, String bookingStatus, String guest_Name,
		String roomType, int roomNum, String price, String floor) {
	super();
	Bid = bid;
	CheckInDate = checkInDate;
	CheckOutDate = checkOutDate;
	BookingStatus = bookingStatus;
	Guest_Name = guest_Name;
	RoomType = roomType;
	RoomNum = roomNum;
	Price = price;
	Floor = floor;
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

public int getRoomNum() {
	return RoomNum;
}

public void setRoomNum(int roomNum) {
	RoomNum = roomNum;
}

public String getPrice() {
	return Price;
}

public void setPrice(String price) {
	Price = price;
}

public String getFloor() {
	return Floor;
}

public void setFloor(String floor) {
	Floor = floor;
}

@Override
public String toString() {
	return "CheckIn [Bid=" + Bid + ", CheckInDate=" + CheckInDate + ", CheckOutDate=" + CheckOutDate
			+ ", BookingStatus=" + BookingStatus + ", Guest_Name=" + Guest_Name + ", RoomType=" + RoomType
			+ ", RoomNum=" + RoomNum + ", Price=" + Price + ", Floor=" + Floor + "]";
}


}
