package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Manage.JDBC1;
import Model.Registrate;
import Manage.ManagerUser;
import Model.Registrate;




public class Registration extends JFrame implements ActionListener{
	JLabel lbl,lblTitle,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;//declaration
	JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
	JComboBox typeOfCustomer;
	JPanel panel;
	
	JButton btnSubmit,btnClear;
	public Registration() {
		setTitle("Registration");
		setSize(550,550);
		setResizable(false);
		//form panel
		panel=new JPanel();
		panel.setBounds(0,0,550,550);
		panel.setBackground(new Color(0, 150, 152));
		panel.setLayout(null);
		
		
		//initialization
		lbl=new JLabel("REGISTER");
		lbl.setBounds(150, 50, 90, 30);
		
		Font fontRegister = new Font("Segoe Script", Font.BOLD, 13);

		lbl.setFont(fontRegister);

		//Font Style

		Font font = new Font("Latin", Font.BOLD, 13);
		//Title Label

		lblTitle = new JLabel("");

		lblTitle.setBounds(50,130, 30, 20);

		lblTitle.setFont(font);
		
		lbl1=new JLabel("CustomerId:");
		lbl1.setBounds(20, 50, 80, 30);
		lbl1.setForeground(Color.green);
		lbl2=new JLabel("FullName:");
		lbl2.setBounds(20, 90, 80, 30);
		lbl2.setForeground(Color.green);
		lbl3=new JLabel("Address:");
		lbl3.setBounds(20, 130, 80, 30);
		lbl3.setForeground(Color.green);
		lbl4=new JLabel("PhoneNum:");
		lbl4.setBounds(20, 170, 80, 30);
		lbl4.setForeground(Color.green);
		lbl5=new JLabel("Email:");
		lbl5.setBounds(20, 200, 80, 30);
		lbl5.setForeground(Color.green);
		lbl6=new JLabel("CreditCardNum:");
		lbl6.setBounds(20, 240, 120, 30);
		lbl6.setForeground(Color.green);
		lbl7=new JLabel("UserPassword:");
		lbl7.setBounds(20, 280, 90, 30);
		lbl7.setForeground(Color.green);
		lbl8=new JLabel("UserName:");
		lbl8.setBounds(20, 320, 80, 30);
		lbl8.setForeground(Color.green);
		lbl9=new JLabel("TypeOfCustomer:");
		lbl9.setBounds(20, 360, 120, 30);
		lbl9.setForeground(Color.green);
		
		txt1=new JTextField();
		txt1.setBounds(150, 50, 160, 30);
		 txt1.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt2=new JTextField();
		txt2.setBounds(150, 90, 160, 30);
		 txt2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt3=new JTextField();
		txt3.setBounds(150, 130, 160, 30);
		 txt3.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt4=new JTextField();
		txt4.setBounds(150, 170, 160, 30);
		 txt4.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt5=new JTextField();
		txt5.setBounds(150, 210, 160, 30);
		 txt5.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt6=new JTextField();
		txt6.setBounds(150, 250, 160, 30);
		 txt6.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt7=new JTextField();
		txt7.setBounds(150, 290, 160, 30);
		 txt7.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		txt8=new JTextField();
		txt8.setBounds(150, 330, 160, 30);
		 txt8.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		
		typeOfCustomer=new JComboBox();
		typeOfCustomer.setBounds(150, 370, 160, 30);
		typeOfCustomer.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		typeOfCustomer.addItem("select");
		typeOfCustomer.addItem("Individual");
		typeOfCustomer.addItem("Corporate");
		btnSubmit=new JButton("Register");
		btnSubmit.setBounds(20, 410, 120, 30);
		btnSubmit.setBorder(BorderFactory.createLineBorder(new Color(0,250, 252), 4));

		btnClear=new JButton("Clear");
		btnClear.setBounds(150, 410, 120, 30);
		btnClear.setBorder(BorderFactory.createLineBorder(new Color(0,250, 252), 6));

		btnClear.addActionListener(this);
		
		btnSubmit.addActionListener(this);

		setLayout(null);
		//adding to frame
		panel.add(lbl1);add(txt1);
		add(lbl2);add(txt2);
		add(lbl3);add(txt3);
		add(lbl4);add(txt4);
		add(lbl5);add(txt5);
		add(lbl6);add(txt6);
		add(lbl7);add(txt7);
		add(lbl8);add(txt8);
		add(lbl9);add(typeOfCustomer);
		add(btnSubmit);add(btnClear);
		add(panel);panel.add(lbl);panel.add(lblTitle);
		
		setVisible(true);
	}
	public static void main(String []args) {
		new Registration();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSubmit) {
			//save
			//read values from textBox
			int Rid=Integer.parseInt(txt1.getText());
			String FullName = txt2.getText();
			String Address = txt3.getText();
			String PhoneNum = txt4.getText();
			String Email = txt5.getText();
			String CreditCardInfo = txt6.getText();
			String UserName = txt7.getText();
			String UserPassword = txt8.getText();
			String TypeOfCustomer=typeOfCustomer.getSelectedItem().toString();
		
			
		
			
			if(PhoneNum.matches("^[0-9]*$")&&PhoneNum.length()==10) {
				
				Registrate s1 = new Registrate(Rid, FullName, Address,PhoneNum,Email,CreditCardInfo,UserName,UserPassword,TypeOfCustomer);
				JDBC1 sc = new JDBC1(); 
				boolean result = sc.save(s1);
				
				if(result==true) {
					
					JOptionPane.showMessageDialog(this, "Save record");
					this.dispose();//dispose the current gui
					Login login=new Login();//return to login page after registration 
					
				}
				
					else {
						JOptionPane.showMessageDialog(this, "Error to save record");
			
					}
			
			}
			else {
				JOptionPane.showMessageDialog(this,"invalide Number");
			}
		
		}
		txt1.setText(null);
		txt2.setText(null);
		txt3.setText(null);
		txt4.setText(null);
		txt5.setText(null);
		txt6.setText(null);
		txt7.setText(null);
		txt8.setText(null);
		typeOfCustomer.setSelectedItem(null);
		
	}}

		
