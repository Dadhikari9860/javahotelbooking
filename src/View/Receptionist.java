package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

import Manage.Rec;
import Model.ReceptionistLogin;
public class Receptionist extends JFrame implements ActionListener {
	private static final Component Background = null;
	JFrame frame;
	JLabel lbl1,lbl2,lb;
	JTextField txt1;
	JPasswordField txt2;
	JButton btnLogin;
	JPanel panel;
	
	public  Receptionist() {
	setTitle("Login");
	setBounds(210,90,500,400);
	setResizable(false);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	lbl1=new JLabel("UserName:");
	lbl1.setBounds(20, 30, 80, 30);
	lbl2=new JLabel("Password:");
	lbl2.setBounds(20, 70, 80, 30);
	txt1=new JTextField();
	txt1.setBounds(105, 30, 115, 30);
	
	ImageIcon img=new ImageIcon("C:\\Users\\servi\\Downloads\\pexels-nastyasensei-331107.jpg\\");
	lb=new JLabel("",img,JLabel.CENTER);
	lb.setBounds(0, 0, 400, 400);

	/*ImageIcon icon=new ImageIcon("phot/edvin-johansson-rlwE8f8anOc-unsplash.jpg");
	Image img=icon.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
	ImageIcon img1=new ImageIcon(img);
	lb=new JLabel(img1);
	this.add(lb);
	*/
	
	

	
	txt2=new JPasswordField();
	txt2.setBounds(105, 70, 115, 30);
	btnLogin=new JButton("Login");
	btnLogin.setBounds(20,115,80,30);
	btnLogin.addActionListener(this);
	btnLogin.setBackground(new Color(2, 48, 96));
	btnLogin.setForeground(Color.WHITE);
	btnLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

	
	
	
	

	
	
	add(lbl1);add(txt1);
	add(lbl2);add(txt2);
	add(btnLogin);
	add(lb);
	
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			ReceptionistLogin user=new ReceptionistLogin();
			Rec managerUser=new Rec();
			user.setEmail(txt1.getText());
			user.setPassword(txt2.getText());
			managerUser.setUser(user);
			managerUser.login();
			user=managerUser.getUser();
			if(user.getRecid()>=1) {
				JOptionPane.showMessageDialog(this,"welcome!");
				this.dispose();
				 CheckIn mainWindow=new CheckIn();
			}
			else {
				JOptionPane.showMessageDialog(this, "error:user/password");
			}
		}}
	
public static void main(String args[]) {
	new Receptionist();
		
	}
	

}