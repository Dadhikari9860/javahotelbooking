package Model;

public class ReceptionistLogin {
	private int Recid;
	private boolean IsUser;
	private String Email;
	private String password;
	public ReceptionistLogin() {
		Recid = 0;
		IsUser = false;
		Email = "";
		this.password = "";
	}
	public ReceptionistLogin(int recid, boolean isUser, String email, String password) {
		super();
		Recid = recid;
		IsUser = isUser;
		Email = email;
		this.password = password;
	}
	public int getRecid() {
		return Recid;
	}
	public void setRecid(int recid) {
		Recid = recid;
	}
	public boolean isIsUser() {
		return IsUser;
	}
	public void setIsUser(boolean isUser) {
		IsUser = isUser;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ReceptionistLogin [Recid=" + Recid + ", IsUser=" + IsUser + ", Email=" + Email + ", password="
				+ password + "]";
	}
	

}
