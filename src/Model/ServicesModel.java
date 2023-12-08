package Model;

public class ServicesModel {
private int Sid;
private String Services;
private int TotalPrice;
public ServicesModel() {
	
	Sid = 0;
	Services = "";
	TotalPrice = 0;
}
public ServicesModel(int sid, String services, int totalPrice) {
	super();
	Sid = sid;
	Services = services;
	TotalPrice = totalPrice;
}
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getServices() {
	return Services;
}
public void setServices(String services) {
	Services = services;
}
public int getTotalPrice() {
	return TotalPrice;
}
public void setTotalPrice(int totalPrice) {
	TotalPrice = totalPrice;
}
@Override
public String toString() {
	return "ServicesModel [Sid=" + Sid + ", Services=" + Services + ", TotalPrice=" + TotalPrice + "]";
}


}
