package View;

import java.awt.Color;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.*;

import com.toedter.calendar.*;

import Model.Book;
import Model.ViewBook;
import Manage.JDBC;
import Manage.JDBC3;

public class Booking extends JInternalFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	JPanel panel;
	JTextField txt1, txt2;
	JComboBox bookingStatus, roomType;
	JButton btn3, btn2;
	private JDateChooser jdate1, jdate2;

	public Booking() {
		
		panel=new JPanel();
		panel.setBounds(0,0,450,450);
		panel.setBackground(new Color(0, 250, 252));
		panel.setLayout(null);
		
		this.setTitle("Booking");
		this.setSize(450, 450); // Pixel
		this.setResizable(false);

		lbl1 = new JLabel();
		lbl1.setBounds(20, 50, 90, 30);
		lbl1.setText("Booking Id:");
		 lbl1.setForeground(Color.white);

		txt1 = new JTextField();
		txt1.setText("");
		txt1.setBounds(120, 50, 90, 30);
		 txt1.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		lbl2 = new JLabel();
		lbl2.setText("CheckInDate:");
		lbl2.setBounds(20, 90, 90, 30);
		 lbl2.setForeground(Color.white);

		jdate1 = new JDateChooser();
		jdate1.setBounds(120, 90, 90, 30);
		 jdate1.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		lbl3 = new JLabel();
		lbl3.setText("CheckOutDate:");
		lbl3.setBounds(20, 130, 90, 30);
		 lbl3.setForeground(Color.white);

		jdate2 = new JDateChooser();
		jdate2.setBounds(120, 130, 90, 30);
		 jdate2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		lbl4 = new JLabel();
		lbl4.setText("Guest Name:");
		lbl4.setBounds(20, 170, 90, 30);
		 lbl4.setForeground(Color.white);

		txt2 = new JTextField();
		txt2.setText("");
		txt2.setBounds(120, 170, 90, 30);
		 txt2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		lbl5 = new JLabel();
		lbl5.setText("Booking Status:");
		lbl5.setBounds(20, 250, 90, 30);
		 lbl5.setForeground(Color.white);
		bookingStatus = new JComboBox();
		bookingStatus.setBounds(120, 250, 90, 30);

		bookingStatus.addItem("Confirmed");
		bookingStatus.addItem("Cancelled");

		lbl6 = new JLabel();
		lbl6.setText("Room Type:");
		lbl6.setBounds(20, 210, 90, 30);
		 lbl6.setForeground(Color.white);

		roomType = new JComboBox();
		roomType.setBounds(120, 210, 90, 30);
		roomType.addItem("SINGLE");
		roomType.addItem("DOUBLE");
		 roomType.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 roomType.setBackground(Color.GREEN);
		 
		btn3 = new JButton();
		btn3.setText("CLOSE");
		btn3.setBounds(20, 350, 100, 30);
		btn3.addActionListener(this);
		btn3.setBackground(new Color(2, 48, 96));
		btn3.setForeground(Color.WHITE);
		btn3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));



		btn2 = new JButton();
		btn2.setText("BOOK");
		btn2.addActionListener(this);
		btn2.setBounds(130, 350, 100, 30);
		btn2.setBackground(new Color(2, 48, 96));
		btn2.setForeground(Color.WHITE);
		btn2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));


		this.setLayout(null);
		add(panel);
		panel.add(lbl1);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(lbl2);
		panel.add(lbl3);
		panel.add(lbl4);
		panel.add(lbl5);
		panel.add(lbl6);
		panel.add(roomType);
		panel.add(bookingStatus);
		panel.add(jdate1);
		panel.add(jdate2);
		panel.add(btn3);
		panel.add(btn2);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn3) {// close
			this.dispose();// exit
		}

		else if (e.getSource() == btn2) {
			// read values from textBox
			int Bid = Integer.parseInt(txt1.getText());


			String CheckInDate = ((JTextField)jdate1.getDateEditor().getUiComponent()).getText();

			String CheckOutDate = ((JTextField)jdate2.getDateEditor().getUiComponent()).getText();
			String Guest_Name = txt2.getText();

			String RoomType = roomType.getSelectedItem().toString();
			String BookingStatus = bookingStatus.getSelectedItem().toString();
			ViewBook s1 = new ViewBook(Bid, CheckInDate, CheckOutDate, BookingStatus, Guest_Name, RoomType);
			JDBC3 sc=new JDBC3();
			boolean result = sc.Save(s1);

			if (result == true) {

				JOptionPane.showMessageDialog(this, "your room has been requested");
			}

			else {
				JOptionPane.showMessageDialog(this, "Error to save record");

			}

		}
	}
}
