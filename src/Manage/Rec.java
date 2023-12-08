package Manage;

import Model.ReceptionistLogin;

public class Rec {
	//receive
	
	private ReceptionistLogin user;
	public Rec() {
		this.user=new ReceptionistLogin();
		
	}
	public Rec(ReceptionistLogin user) {
		this.user=user;
	}
	public ReceptionistLogin getUser() {
		return user;
	}
	public void setUser(ReceptionistLogin user) {
		this.user=user;
	}
	public void login() {
		this.user=new Receptionist().login(this.user);
	}
	
	
	
}

