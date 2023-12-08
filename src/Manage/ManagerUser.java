package Manage;
import Model.User;
public class ManagerUser {
	//receive
	
	private User user;
	public ManagerUser() {
		this.user=new User();
		
	}
	public ManagerUser(User user) {
		this.user=user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user=user;
	}
	public void login() {
		this.user=new JDBC().login(this.user);
	}
	
	
	
}