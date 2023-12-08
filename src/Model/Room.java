package Model;

public class Room {
	private int Bid;
	private int RoomNum;
	private int Price;
	private int Floor;
	private int NumberOfRoom;
	private int TotalBill;
	public Room() {
	
		Bid = 0;
		RoomNum = 0;
		Price = 0;
		Floor = 0;
		NumberOfRoom = 0;
		TotalBill = 0;
	}
	public Room(int bid, int roomNum, int price, int floor, int numberOfRoom, int totalBill) {
		super();
		Bid = bid;
		RoomNum = roomNum;
		Price = price;
		Floor = floor;
		NumberOfRoom = numberOfRoom;
		TotalBill = totalBill;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public int getRoomNum() {
		return RoomNum;
	}
	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public int getNumberOfRoom() {
		return NumberOfRoom;
	}
	public void setNumberOfRoom(int numberOfRoom) {
		NumberOfRoom = numberOfRoom;
	}
	public int getTotalBill() {
		return TotalBill;
	}
	public void setTotalBill(int totalBill) {
		TotalBill = totalBill;
	}
	@Override
	public String toString() {
		return "Room [Bid=" + Bid + ", RoomNum=" + RoomNum + ", Price=" + Price + ", Floor=" + Floor + ", NumberOfRoom="
				+ NumberOfRoom + ", TotalBill=" + TotalBill + "]";
	}

}