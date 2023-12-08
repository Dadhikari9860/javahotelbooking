package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.*;

import Manage.RoomJDBC;
import Model.Barm;
import Model.Book;
import Model.Room;


public class CheckIn extends JFrame implements ActionListener {
    private JTable table;
    private DefaultTableModel model;
	JLabel lbl,lblBID, lbl2, lbl3, lbl4,lbl5,lbl6,lbl7,lbl8;
	JTextField txtBID, txt3, txt4,txt5,txt6,txt7,txt8,txt9;
	JComboBox jbox2;
	JFrame frame;
	JButton btnEdit, btnDelete, btnClose,btnAdd,btnLogOut;
    public CheckIn() {
    	this.setSize(1500, 450);
    	setLayout(null);
    	 // Set up the JTable and its model
        model = new DefaultTableModel();
        model.addColumn("Booking ID");
        model.addColumn("Guest Name");
        model.addColumn("Booking Status");
        model.addColumn("Room Type");
        model.addColumn("Check-in Date");
        model.addColumn("Check-out Date");
        model.addColumn("Room Number");
        model.addColumn("Price");
        model.addColumn("Floor");
        model.addColumn("Number of Rooms");
        model.addColumn("TotalBill");
        table = new JTable(model);
        table.setBackground(new Color(0, 250, 252));
        
	
		
		lbl=new JLabel("RECEPTIONIST VIEW");
		lbl.setBounds(130,10,150,25);
		lblBID=new JLabel("RoomNum : ");
		lblBID.setBounds(20,  40, 100, 25);
		 lblBID.setForeground(Color.white);
		
		lbl2=new JLabel("Price : ");
		lbl2.setBounds(20,  70, 100, 25);
		lbl2.setForeground(Color.white);
		 
		lbl3=new JLabel("Floor: ");
		lbl3.setBounds(20,  100, 100, 25);
		lbl3.setForeground(Color.white);
		 
		lbl4=new JLabel("ROOMTYPE : ");
		lbl4.setBounds(20,  130, 100, 25);
		lbl4.setForeground(Color.white);
		 
		
		lbl5=new JLabel("Number Of Room:");
		lbl5.setBounds(20,  160, 120, 25);
		lbl5.setForeground(Color.white);
		
		lbl6=new JLabel("Total Day :");
		lbl6.setBounds(20,  190, 150, 25);
		lbl6.setForeground(Color.white);
		
		lbl7=new JLabel("Total Bill :");
		lbl7.setBounds(20,  220, 150, 25);
		 lbl7.setForeground(Color.white);
		
		lbl8=new JLabel("Booking Id :");
		lbl8.setBounds(20,  250, 150, 25);
		 lbl8.setForeground(Color.white);
		
		
		txtBID=new JTextField();
		txtBID.setBounds(130,  40, 175, 25);
		 txtBID.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		
		txt5=new JTextField();
		txt5.setBounds(130,70,  175, 25);
		 txt5.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

	
		
		
		txt3=new JTextField();
		txt3.setBounds(130,  100, 175, 25);
		 txt3.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		
		jbox2=new JComboBox();
		jbox2.setBounds(130,130,  175, 25);
		jbox2.addActionListener(this);
		jbox2.addItem("SINGLE");
		jbox2.addItem("DOUBLE");
		jbox2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 jbox2.setBackground(Color.PINK);
		 
		
		txt6=new JTextField();
		txt6.setBounds(130,160, 175, 25);
		 txt6.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		txt7=new JTextField();
		txt7.setBounds(130,190, 175, 25);
		 txt7.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		
		txt8=new JTextField();
		txt8.setBounds(130,220, 175, 25);
		 txt8.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		
		txt9=new JTextField();
		txt9.setBounds(130,250, 175, 25);
		 txt9.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));

		
		btnAdd=new JButton("ADD");
		btnAdd.addActionListener(this);
		btnAdd.setBounds(290,  360, 75, 25);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
	
		
		btnEdit=new JButton("ASSIGN");
		btnEdit.addActionListener(this);
		btnEdit.setBounds(390,  360, 105, 25);	
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
	
		
		btnDelete=new JButton("PRINT BILL");
		btnDelete.addActionListener(this);
		btnDelete.setBounds(520,  360, 105, 25);
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
	
	
		
		btnClose=new JButton("SELECT");
		btnClose.setBounds(680,  360, 85, 25);
		btnClose.addActionListener(this);
		btnClose.setForeground(Color.BLACK);
		btnClose.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

		
	

		btnLogOut=new JButton("LogOut");
		btnLogOut.setBounds(780,  360, 150, 25);
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
		btnLogOut.addActionListener(this);
 

 
     
		
        JScrollPane scroll = new JScrollPane(table);
   
   
scroll.setBounds(370, 20, 1100, 150);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
 
 
		
		add(lblBID);add(txtBID);
		add(lbl2);add(txt5);
		add(lbl3);add(txt3);
		add(lbl4);add(jbox2);
		add(btnDelete);add(txt6);add(txt7);
		add(btnEdit);
		add(lbl);add(lbl5);
		add(lbl6);
		add(scroll);
		 add(btnClose);add(lbl7);
		 add(txt8);add(btnAdd);
		 add(lbl8);add(txt9);add(btnLogOut);
		setVisible(true);
		setLayout(null);

        // Set up the frame
        setTitle("Room Booking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        setVisible(true);


        // Execute the SQL query and populate the JTable
        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");

            // Create a statement object with the SQL query
            String query = "SELECT * FROM booking2";
            Statement stmt = conn.createStatement();

            // Execute the SQL query and get the results
            ResultSet rs = stmt.executeQuery(query);

            // Populate the JTable with the results
            while (rs.next()) {
                int bid = rs.getInt("Bid");
                String guestName = rs.getString("Guest_Name");
                String bookingStatus = rs.getString("BookingStatus");
                String roomType = rs.getString("RoomType");
                String checkInDate = rs.getString("CheckInDate");
                String checkOutDate = rs.getString("CheckOutDate");
                int roomNum = rs.getInt("RoomNum");
                int price = rs.getInt("Price");
                int floor = rs.getInt("Floor");
                int numOfRooms = rs.getInt("NumberOfRoom");
                int totalBill = rs.getInt("TotalBill");


                Object[] row = {bid, guestName, bookingStatus, roomType, checkInDate, checkOutDate, roomNum, price, floor, numOfRooms,totalBill};
                model.addRow(row);
            }

            // Close the connection and release resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new CheckIn();
    }

    public void actionPerformed(ActionEvent e) {
		if (jbox2.getSelectedIndex()==0) {
			int price = 500;
			String Price = price+"";
			txt5.setText(Price);
			
		}
		 if (jbox2.getSelectedIndex()==1) {
			int price = 1000;
			String Price = price+"";
			txt5.setText(Price);
			
		}
		  if(e.getSource()==btnAdd) {
				 int price = Integer.parseInt(txt5.getText());
					int TotalRoom = Integer.parseInt(txt7.getText());
					int totalRoom=Integer.parseInt(txt6.getText());
					int total = price*TotalRoom*totalRoom;
					String totalAmount = total+"";
					txt8.setText(totalAmount);
			 }
		  else if(e.getSource()==btnEdit) {
				int Bid;
				int RoomNum;int Price;int Floor;int NumberOfRoom;int TotalDay;
				Bid=Integer.parseInt(txt9.getText());
			   RoomNum=Integer.parseInt(txtBID.getText());
				Price=Integer.parseInt(txt5.getText());
				Floor=Integer.parseInt(txt3.getText());
				NumberOfRoom=Integer.parseInt(txt6.getText());
				TotalDay=Integer.parseInt(txt8.getText());
				
				boolean result = new RoomJDBC().add(Bid,RoomNum,Price,Floor,NumberOfRoom,TotalDay);
				if(result) {
			
					JOptionPane.showMessageDialog(this,"Room Assign successfully");
					this.dispose();
					CheckIn ch=new CheckIn();
					
				}
				else{
					JOptionPane.showMessageDialog(this,"Error to update record");  
				}
			}

		  else if(e.getSource()==btnClose) {
				int selectedRow =table.getSelectedRow();			
				String Bid,RoomNum,RoomType,Price,Floor,NumberOfRoom,TotalDay;
				Bid=table.getValueAt(0, 0).toString();
				RoomNum=table.getValueAt(selectedRow, 6).toString();
				RoomType=table.getValueAt(selectedRow, 3).toString();
			
				Price=table.getValueAt(selectedRow, 7).toString();
				Floor=table.getValueAt(selectedRow, 8).toString();
				NumberOfRoom=table.getValueAt(selectedRow, 9).toString();
				TotalDay=table.getValueAt(selectedRow, 10).toString();
				
				txt9.setText(Bid);
				txtBID.setText(RoomNum);
				jbox2.setToolTipText(RoomType);
				txt5.setText(Price);
				txt3.setText(Floor);
				txt6.setText(NumberOfRoom);
				txt8.setText(TotalDay);
		  }
		  else if(e.getSource()==btnDelete) {
			     int bid = Integer.parseInt(txt9.getText());
			      int roomNum = Integer.parseInt(txtBID.getText());
			      double price = Double.parseDouble(txt5.getText());
			      int floor = Integer.parseInt(txt3.getText());
			      int numberOfRoom = Integer.parseInt(txt6.getText());
			      int totalDay = Integer.parseInt(txt8.getText());
			      
			
			      double subtotal = totalDay ;
			      double tax = subtotal * 0.1;
			      double total = subtotal + tax;

			      String bill = "Bid: " + bid + "\n" +
			                   "Room Number: " + roomNum + "\n" +
			                   "Price per Night: rs " + price + "\n" +
			                   "Floor Number: " + floor + "\n" +
			                   "Number of Rooms: " + numberOfRoom + "\n" +
			                   "Total Number of Days: " + totalDay + "\n" +
			                   "Subtotal: rs " + subtotal + "\n" +
			                   "Tax: rs " + tax + "\n" +
			                   "Total: rs " + total + "\n" +
			      				"----thank you for visit----";

			      JOptionPane.showMessageDialog(frame, bill);
			    }
		
		  else if(e.getSource()==btnLogOut) {
			  this.dispose();
			Login lg=new Login();
		  }
    	
    }
			  

}
      
