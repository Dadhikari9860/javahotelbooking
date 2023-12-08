package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {
	
	JMenu menu1,menu2;//declare menu
	JMenuBar menubar1;
	JMenuItem menuItem1,menuItem2,menuItem3,menuItem4,menuItem5,mn5;
	JDesktopPane desktopPane;
	JButton jbtn;
	public MainWindow() {
		this.setTitle("Hotel Booking System");
		this.setExtendedState(this.MAXIMIZED_BOTH);

		menubar1 = new JMenuBar();//initializing menubar
		menu1 = new JMenu("Home");
		menuItem1 = new JMenuItem("Booking");//initiallizing menuItem
		menuItem1.addActionListener(this);
		
		
		
		
		
		menuItem2=new JMenuItem("View Booking");
		menuItem2.addActionListener(this);
		
		menuItem3=new JMenuItem("Resturant");
		menuItem3.addActionListener(this);
		
		menuItem4=new JMenuItem("Bar");
		menuItem4.addActionListener(this);
		
		menuItem5=new JMenuItem("Services");
		menuItem5.addActionListener(this);
		
		jbtn=new JButton("LogOut");
		jbtn.setBounds(1450, 22, 80, 30);
		jbtn.addActionListener(this);
		jbtn.setBorder(BorderFactory.createLineBorder(new Color(0,250, 252), 6));
		jbtn.setForeground(Color.blue);
		jbtn.setBorder(BorderFactory.createLineBorder(Color.pink, 2));

		
		
		
	menu1.add(menuItem1);
		menubar1.add(menu1);
		menu1.add(menuItem2);
		menu1.add(menuItem3);
		menu1.add(menuItem4);
		menu1.add(menuItem5);
		add(jbtn);
		
		desktopPane = new JDesktopPane();
	
		this.add(menubar1, BorderLayout.NORTH);
		this.add(desktopPane, BorderLayout.CENTER);
		

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
		Booking booking = new Booking();
		desktopPane.add(booking);
		}
		else if(e.getSource() == menuItem2) {
			ViewBooking Viewbooking = new ViewBooking();
			desktopPane.add(Viewbooking);
			}
		if(e.getSource()==jbtn) {
			this.dispose();
			new Login();
			
		}
		else if(e.getSource() == menuItem3) {
			Resturant resturant = new Resturant();
			desktopPane.add(resturant);
			}
		else if(e.getSource() == menuItem4) {
			Bar bar = new Bar();
			desktopPane.add(bar);
			}
		else if(e.getSource() == menuItem5) {
			Services service = new Services();
			desktopPane.add(service);
			}
	}
}
