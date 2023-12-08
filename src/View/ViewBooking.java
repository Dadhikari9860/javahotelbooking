package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Model.Book;
import View.ViewBooking;

public class ViewBooking extends JInternalFrame implements ActionListener {
	private static final long serialVersionUID = 1L; 
	JLabel lbl,lblBID, lbl2, lbl3, lbl4,lbl5,lbl6;
	JTextField txtBID, txt3, txt4;
	JComboBox jbox1,jbox2;
	JDateChooser jdate1,jdate2;
	JButton btnEdit, btnDelete, btnClose,btnSelect;
	JPanel panel;
	
	String[] columnNames = {"Bid","CheckInDate","CheckOutDate", "Guest_Name","BookingStatus","RoomType"};//giving column name for viewBooking table
	
	JTable tblPerson;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	
	public ViewBooking() {
		panel=new JPanel();
		panel.setBounds(0,0,1150,450);
		panel.setBackground(new Color(0, 250, 252));
		panel.setLayout(null);
		

		setTitle("ViewBooking");
		setSize(1150, 450);
		setLayout(null);
		lbl=new JLabel("ViewBooking");
		lbl.setBounds(130,10,100,25);
		 lbl.setForeground(Color.pink);
		lblBID=new JLabel("BookingId : ");
		lblBID.setBounds(20,  40, 100, 25);
		 lblBID.setForeground(Color.white);
		
		lbl2=new JLabel("BookingStatus: ");
		lbl2.setBounds(20,  70, 100, 25);
		 lbl2.setForeground(Color.white);
		 
		lbl3=new JLabel("GUEST_NAME : ");
		lbl3.setBounds(20,  100, 100, 25);
		 lbl3.setForeground(Color.white);
		 
		lbl4=new JLabel("ROOMTYPE : ");
		lbl4.setBounds(20,  130, 100, 25);
		 lbl4.setForeground(Color.white);
		 
		lbl5=new JLabel("CHECKINDATE :");
		lbl5.setBounds(20,  160, 100, 25);
		 lbl5.setForeground(Color.white);
		 
		lbl6=new JLabel("CHECKOUTDATE :");
		lbl6.setBounds(20,  190, 150, 25);
		 lbl6.setForeground(Color.white);
		 
		txtBID=new JTextField();
		txtBID.setBounds(130,  40, 175, 25);
		 txtBID.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 
		jbox1=new JComboBox();
		jbox1.setBounds(130,70,  175, 25);

		jbox1.addItem("Confirmed");
		jbox1.addItem("Cancelled");
		
		
		txt3=new JTextField();
		txt3.setBounds(130,  100, 175, 25);
		 txt3.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 
		jbox2=new JComboBox();
		jbox2.setBounds(130,130,  175, 25);
		jbox2.addItem("SINGLE");
		jbox2.addItem("DOUBLE");
		
		jdate1=new JDateChooser();
		jdate1.setBounds(130,160, 175, 25);
		jdate2=new JDateChooser();
		jdate2.setBounds(130,190, 175, 25);
		 jdate2.setBorder(BorderFactory.createLineBorder(new Color(110,211, 203), 2));
		 
		btnEdit=new JButton("EDIT");
	btnEdit.addActionListener(this);
		btnEdit.setBounds(210,  360, 75, 25);	
		btnEdit.setForeground(Color.BLUE);
		btnEdit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		
		btnDelete=new JButton("DELETE");
		btnDelete.addActionListener(this);
		btnDelete.setBounds(290,  360, 85, 25);
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

				
	
		
		btnClose=new JButton("CLOSE");
		btnClose.addActionListener(this);
		btnClose.setBounds(380,  360, 85, 25);
		btnClose.setForeground(Color.BLUE);
		btnClose.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		btnSelect=new JButton("SELECT");
		btnSelect.addActionListener(this);
		btnSelect.setBounds(470,  360, 85, 25);
		btnSelect.setForeground(Color.BLUE);
		btnSelect.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(columnNames);
		tblPerson=new JTable();
		tblPerson.setModel(tableModel); 
		 tblPerson.setBackground(new Color(0, 250, 252));
		tblPerson.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tblPerson.setFillsViewportHeight(true);
		scroll = new JScrollPane(tblPerson);
		scroll.setBounds(370, 20, 700, 150);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		refreshTable();
		
		add(panel);
		panel.add(lblBID);panel.add(txtBID);
		panel.add(lbl2);panel.add(jbox1);
		panel.add(lbl3);panel.add(txt3);
		panel.add(lbl4);panel.add(jbox2);
		panel.add(btnDelete);panel.add(jdate1);panel.add(jdate2);
		panel.add(btnEdit);
		panel.add(lbl);panel.add(lbl5);
		panel.add(lbl6);
		panel.add(scroll);
		panel.add(btnClose);panel.add(btnSelect);
		setVisible(true);
	}		

	public void refreshTable() {
		List persons = new ViewBok().allPersons();
		tableModel.setNumRows(0);
		for(int i=0; i<persons.size(); i++) {
			//System.out.println(persons.get(i));
			Book tmpPerson = (Book) persons.get(i);
			tableModel.addRow(new Object[]{tmpPerson.getBid(),tmpPerson.getCheckInDate(),tmpPerson.getCheckOutDate(), tmpPerson.getGuest_Name(),tmpPerson.getBookingStatus(),tmpPerson.getRoomType()});
		}		
	}
	

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			this.dispose();
		}
	
		else if(ae.getSource()==btnEdit) { //Edit or Update
			int Bid;
			String BookingStatus,Guest_Name,RoomType,CheckInDate,CheckOutDate;
			Bid=Integer.parseInt(txtBID.getText());
			BookingStatus=jbox1.getSelectedItem().toString();
			Guest_Name=txt3.getText();
			RoomType=jbox2.getSelectedItem().toString();

			

			String checkInDate = ((JTextField)jdate1.getDateEditor().getUiComponent()).getText();

			String checkOutDate = ((JTextField)jdate2.getDateEditor().getUiComponent()).getText();
			boolean result = new ViewBok().update(Bid,checkInDate,checkOutDate,Guest_Name, BookingStatus,RoomType);
			if(result) {
				refreshTable();
				JOptionPane.showMessageDialog(this,"Your booking is updated successfully");
				
			}
			else{
				JOptionPane.showMessageDialog(this,"Error to update record");  
			}
		}
		else if(ae.getSource()==btnDelete) { //Delete
			int Bid;			
			Bid=Integer.parseInt(txtBID.getText());			
			boolean result = new ViewBok().delete(Bid);
			if(result) {
				refreshTable();
				JOptionPane.showMessageDialog(this,"Your booking is deleted successfully");
							
			}
			else{
				JOptionPane.showMessageDialog(this,"Error to delete record");  
			}
		}
		
		  else if(ae.getSource()==btnSelect) {
				int selectedRow =tblPerson.getSelectedRow();			
				String Bid,CheckInDate,CheckOutDate,BookingStatus,Guest_Name,RoomType;
				Bid=tblPerson.getValueAt(0, 0).toString();
				CheckInDate=tblPerson.getValueAt(selectedRow, 1).toString();
				CheckOutDate=tblPerson.getValueAt(selectedRow, 2).toString();
			
				BookingStatus=tblPerson.getValueAt(selectedRow, 5).toString();
				Guest_Name=tblPerson.getValueAt(selectedRow, 3).toString();
				RoomType=tblPerson.getValueAt(selectedRow, 4).toString();
				 switch(RoomType) {
				 case"SINGLE":
				 jbox2.setSelectedIndex(0);
				 break;
				 case"DOUBLE":
					 jbox2.setSelectedIndex(1);
					 break;
				 }
				
				txtBID.setText(Bid);
				jdate1.setToolTipText(CheckInDate);
				jbox2.setToolTipText(RoomType);
				jbox1.setToolTipText(BookingStatus);
				txt3.setText(Guest_Name);
				jdate2.setToolTipText(CheckOutDate);
		  }

	
	}
}



