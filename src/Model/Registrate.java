package Model;

public class Registrate {
private int Rid;
private String fullName;
private String Address;
private String PhoneNum;
private String CreditCardInfo;
private String Email;
private String UserPassword;
private String UserName;
private String TypeOfCustomer;
public Registrate() {
	
	Rid = 0;
	this.fullName = "";
	Address = "";
	PhoneNum = "";
	CreditCardInfo = "";
	Email ="";
	UserPassword="";
	UserName="";
	TypeOfCustomer="";

}

public Registrate(int rid, String fullName, String address, String phoneNum, String creditCardInfo, String email,
		String userPassword, String userName, String typeOfCustomer) {
	super();
	Rid = rid;
	this.fullName = fullName;
	Address = address;
	PhoneNum = phoneNum;
	CreditCardInfo = creditCardInfo;
	Email = email;
	UserPassword = userPassword;
	UserName = userName;
	TypeOfCustomer = typeOfCustomer;
}

public int getRid() {
	return Rid;
}
public void setRid(int rid) {
	Rid = rid;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPhoneNum() {
	return PhoneNum;
}
public void setPhoneNum(String phoneNum) {
	PhoneNum = phoneNum;
}
public String getCreditCardInfo() {
	return CreditCardInfo;
}
public void setCreditCardInfo(String creditCardInfo) {
	CreditCardInfo = creditCardInfo;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getUserPassword() {
	return UserPassword;
}
public void setUserPassword(String userPassword) {
	UserPassword = userPassword;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getTypeOfCustomer() {
	return TypeOfCustomer;
}
public void setTypeOfCustomer(String typeOfCustomer) {
	TypeOfCustomer = typeOfCustomer;
}
@Override
public String toString() {
	return "Registrate [Rid=" + Rid + ", fullName=" + fullName + ", Address=" + Address + ", PhoneNum=" + PhoneNum
			+ ", CreditCardInfo=" + CreditCardInfo + ", Email=" + Email + ", UserPassword=" + UserPassword
			+ ", UserName=" + UserName + ", TypeOfCustomer=" + TypeOfCustomer + "]";
}

}

