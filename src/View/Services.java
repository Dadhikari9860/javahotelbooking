package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Manage.ServicesJDBC;

import Model.ServicesModel;

public class Services extends JInternalFrame implements ActionListener{
	JPanel panel1;
	JLabel lbl8,lbl9,lbl10,lbl11;
	JTextField txt9,txt11;
	JComboBox jb21;
	JButton btnPay,btn1;
	
	
	public Services() {
		setTitle("Services");
		setSize(400,400);
		setResizable(false);
		//form panel
		panel1=new JPanel();
		panel1.setBounds(0,0,400,400);
		panel1.setBackground(new Color(0, 150, 152));
		panel1.setLayout(null);
		 lbl8=new JLabel("Extra Services");
		 lbl8.setBounds(150, 10, 180, 30);
		 lbl8.setForeground(Color.pink);
		 lbl8.setFont(new Font("Italic", Font.ITALIC, 20));

		 
		 lbl9=new JLabel("Services Code :");
		 lbl9.setBounds(20, 50, 120, 30);
		 lbl9.setForeground(Color.white);
		 
		 txt9=new JTextField();
		 txt9.setBounds(150, 50, 190, 30);
		 txt9.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 
		 lbl10=new JLabel("Services :");
		 lbl10.setBounds(20, 90, 80, 30);
		 lbl10.setForeground(Color.white);
		 
		 String[] services =new String[] {"Laundary", "Dry Cleaning", "Stripping", "Scrubbing"};
		 jb21 = new JComboBox(services);
		 
		 jb21.setSelectedItem("Laundary");
		 jb21.setBounds(150, 90, 190, 30);
		 jb21.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 jb21.setBackground(Color.WHITE);
		 jb21.addActionListener(this);
		 
		 lbl11=new JLabel("Price :");
		 lbl11.setBounds(20, 130, 80, 30);
		 lbl11.setForeground(Color.white);
		 
		 txt11=new JTextField();
		 txt11.setBounds(150, 130, 190, 30);
		 txt11.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 
		 btnPay=new JButton("Pay");
		 btnPay.setBounds(130, 170, 80, 30);
		 btnPay.setBorder(BorderFactory.createLineBorder(new Color(0,250, 252), 4));
		 btnPay.addActionListener(this);
		 
		 btn1=new JButton("Close");
		 btn1.setBounds(220, 170, 80, 30);
		 btn1.setBorder(BorderFactory.createLineBorder(new Color(0,250, 252), 4));
		 btn1.addActionListener(this);
		 
		 add(panel1);panel1.add(lbl8);panel1.add(lbl9);
		 panel1.add(lbl11);panel1.add(lbl10);panel1.add(txt9);
		 panel1.add(txt11);panel1.add(jb21);panel1.add(btnPay);
		 panel1.add(btn1);
		 setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (jb21.getSelectedIndex()==0) {
			int price = 140;
			String Price = price+"";
			txt11.setText(Price);
			
		}
		 if (jb21.getSelectedIndex()==1) {
			int price = 250;
			String Price = price+"";
			txt11.setText(Price);
			
		}
		 if (jb21.getSelectedIndex()==2) {
			int price = 350;
			String Price = price+"";
			txt11.setText(Price);
			
		}
		 if (jb21.getSelectedIndex()==3) {
			int price = 150;
			String Price = price+"";
			txt11.setText(Price);
			
		}
		 else if(e.getSource()==btn1) {
			 this.dispose();
		 }
		 else if(e.getSource()==btnPay) {
				int lbl1=Integer.parseInt(txt9.getText());
				String lbl2=jb21.getSelectedItem().toString();
				
				int lbl3=Integer.parseInt(txt11.getText());
				
				ServicesModel s1 = new ServicesModel(lbl1,lbl2,lbl3);
				ServicesJDBC sc = new ServicesJDBC(); 
				boolean result = sc.add(s1);
				if(result==true) {
					
					JOptionPane.showMessageDialog(this, "payment is sucessfully done");
				}
				
					else {
						JOptionPane.showMessageDialog(this, "error in payment");
			
					}

				
		 }

}}
