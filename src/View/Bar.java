package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Manage.BarJDBC;
import Manage.ResturantJDBC;
import Model.Barm;
import Model.ResturantModel;

public class Bar extends JInternalFrame implements ActionListener{
	JPanel panel;
	JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
	JTextField txt1,txt3,txt4,txt5,txt6;
	JButton btn1,btn2,btn22;
	JComboBox jb2;
	public Bar() {
		setTitle("BAR");
		setSize(550,550);
		setResizable(false);
		//form panel
		panel=new JPanel();
		panel.setBounds(0,0,550,550);
		panel.setBackground(new Color(0, 51, 52));
		panel.setLayout(null);
		 lbl=new JLabel("DRINKS ORDER");
		 lbl.setBounds(275, 10, 180, 30);
		 lbl.setForeground(Color.pink);
		 lbl.setFont(new Font("Italic", Font.ITALIC, 20));

		 
		 lbl1=new JLabel("drinks code:");
		 lbl1.setBounds(20, 50, 80, 30);
		 lbl1.setForeground(Color.white);
		 
		 txt1=new JTextField();
		 txt1.setBounds(100, 50, 190, 30);
		 txt1.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));


		 
		 lbl2=new JLabel("Drinks:");
		 lbl2.setBounds(20, 90, 80, 30);
		 lbl2.setForeground(Color.white);
		 
		 String[] drinksItem =new String[] {"8848", "RED LABEL", "BEER", "VODHKA"};
		 jb2 = new JComboBox( drinksItem);
		 
		 jb2.setSelectedItem("8848");
		 jb2.setBounds(100, 90, 190, 30);
		 jb2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 jb2.setBackground(Color.WHITE);
		 jb2.addActionListener(this);

		 
		 
		 lbl3=new JLabel("Per Price:");
		 lbl3.setBounds(20, 130, 80, 30);
		 lbl3.setForeground(Color.white);
		 txt3=new JTextField();
		 txt3.setBounds(100, 130, 190, 30);
		 txt3.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 lbl4=new JLabel("Quantity :");
		 lbl4.setBounds(20, 170, 80, 30);
		 lbl4.setForeground(Color.white);
		 txt4=new JTextField();
		 txt4.setBounds(100, 170, 190, 30);
		 txt4.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 btn1=new JButton("ADD");
		 btn1.setBounds(50, 210, 80, 30);
		 btn1.addActionListener(this);
		btn1.setBorder(BorderFactory.createLineBorder(new Color(0,250, 0), 4));


		 
		 lbl5=new JLabel("Total Price :");
		 lbl5.setBounds(20, 250, 80, 30);	
		 lbl5.setForeground(Color.white);
		 txt5=new JTextField();
		 txt5.setBounds(100, 250, 190, 30);
		 
		 lbl6=new JLabel("Credit Card :");
		 lbl6.setBounds(20, 290, 80, 30);
		 lbl6.setForeground(Color.white);
		 txt6=new JTextField();
		 txt6.setBounds(100, 290, 190, 30);
		 txt6.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 btn2=new JButton("PAY");
		 btn2.setBounds(50, 330, 80, 30);
		 btn2.setBorder(BorderFactory.createLineBorder(new Color(0,250, 0), 4));
		 btn2.addActionListener(this);
		 
		 btn22=new JButton("CLOSE");
		 btn22.setBounds(150, 330, 80, 30);
		 btn22.addActionListener(this);
		 btn22.setBorder(BorderFactory.createLineBorder(new Color(0,250, 0), 4));

		 
		add(panel);panel.add(lbl1);panel.add(lbl2);panel.add(lbl3);
		panel.add(lbl4);panel.add(lbl5);panel.add(lbl);panel.add(lbl6);
		panel.add(btn1);panel.add(txt1);
		panel.add(jb2);panel.add(txt3);panel.add(txt4);panel.add(txt5);
		panel.add(txt6);panel.add(btn2);panel.add(btn22);
		setVisible(true);
        
       
 
	}

public void actionPerformed(ActionEvent e) {
	if (jb2.getSelectedIndex()==0) {
		int price = 1400;
		String Price = price+"";
		txt3.setText(Price);
	
	}
	 if (jb2.getSelectedIndex()==1) {
		int price = 1500;
		String Price = price+"";
		txt3.setText(Price);
		
	}
	 if (jb2.getSelectedIndex()==2) {
		int price = 1800;
		String Price = price+"";
		txt3.setText(Price);
		
	}
	 if (jb2.getSelectedIndex()==3) {
		int price = 500;
		String Price = price+"";
		txt3.setText(Price);
		
	}
	  if(e.getSource()==btn1) {
		 int price = Integer.parseInt(txt3.getText());
			int quantity = Integer.parseInt(txt4.getText());
			int total = price*quantity;
			String totalAmount = total+"";
			txt5.setText(totalAmount);
	 }
	  else if(e.getSource()==btn22) {
		  this.dispose();
	  }
	  else if(e.getSource()==btn2) {
			int lbl1=Integer.parseInt(txt1.getText());
			String lbl2=jb2.getSelectedItem().toString();
			
			int lbl3 = Integer.parseInt(txt3.getText());
			int lbl4 = Integer.parseInt(txt4.getText());
			String lbl5 = txt5.getText();
			String lbl6 = txt6.getText();
			Barm s1 = new Barm(lbl1,lbl2,lbl3,lbl4,lbl5,lbl6);
			BarJDBC sc = new BarJDBC(); 
			boolean result = sc.add(s1);
			if(result==true) {
				
				JOptionPane.showMessageDialog(this, "payment is sucessfully done");
			}
			
				else {
					JOptionPane.showMessageDialog(this, "error in payment");
		
				}

			
}
	  }
	  
}

