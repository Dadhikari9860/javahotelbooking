package Model;

public class User {
	private int Rid;
	private boolean isUser;
	private String UserName;
	private String UserPassword;
	public User() {
		
		Rid = 0;
		isUser = false;
		UserName = "";
		UserPassword = "";
	}
	public User(int rid, boolean isUser, String userName, String userPassword) {
		super();
		Rid = rid;
		this.isUser = isUser;
		UserName = userName;
		UserPassword = userPassword;
	}
	public int getRid() {
		return Rid;
	}
	public void setRid(int rid) {
		Rid = rid;
	}
	public boolean isUser() {
		return isUser;
	}
	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [Rid=" + Rid + ", isUser=" + isUser + ", UserName=" + UserName + ", UserPassword=" + UserPassword
				+ "]";
	}
	
	

}
