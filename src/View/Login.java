package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

import Manage.ManagerUser;
import Model.User;

public class Login extends JFrame implements ActionListener{
	private static final Component Background = null;
	JFrame frame;
	JLabel lbl1,lbl2,lb;
	JTextField txt1;
	JPasswordField txt2;
	JButton btnLogin,btnRegs,btnStaff;
	JPanel panel;
	
	public Login() {
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
	
	ImageIcon img=new ImageIcon("C:\\Users\\servi\\Downloads\\edvin-johansson-rlwE8f8anOc-unsplash.jpg\\");
	lb=new JLabel("",img,JLabel.CENTER);
	lb.setBounds(0, 0, 500, 400);

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
	btnLogin.setBackground(new Color(2, 48, 94));
	btnLogin.setForeground(Color.WHITE);
	btnLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

	btnRegs=new JButton("Registration");
	btnRegs.addActionListener(this);
	btnRegs.setBounds(120,115,110,30);
	btnRegs.setBackground(new Color(2, 48, 94));
	btnRegs.setForeground(Color.WHITE);
	btnRegs.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

	
	btnStaff=new JButton("STAFF");
	btnStaff.setBounds(100,155,240,30);
	btnStaff.addActionListener(this);
	btnStaff.setBackground(new Color(2, 48, 94));
	btnStaff.setForeground(Color.WHITE);
	btnStaff.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


	
	
	add(lbl1);add(txt1);
	add(lbl2);add(txt2);
	add(btnLogin);add(btnRegs);
	add(btnStaff);add(lb);
	
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			User user=new User();
			ManagerUser managerUser=new ManagerUser();
			user.setUserName(txt1.getText());
			user.setUserPassword(txt2.getText());
			managerUser.setUser(user);
			managerUser.login();
			user=managerUser.getUser();
			if(user.getRid()>=1) {
				JOptionPane.showMessageDialog(this,"welcome!");
				this.dispose();
				 MainWindow mainWindow=new MainWindow();
			}
			else {
				JOptionPane.showMessageDialog(this, "Please Enter UserName and Password");
			}
		}
		else if(e.getSource()==btnRegs) {
			Registration reg=new Registration();
			this.dispose();
		}
		else if(e.getSource()==btnStaff) {
			Receptionist reg=new Receptionist();
			this.dispose();
		}
		
	}
	
public static void main(String args[]) {
	new Login();
		
	}
	

}
