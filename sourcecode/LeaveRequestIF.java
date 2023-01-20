package lms_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class LeaveRequestIF extends JInternalFrame  {
	private JTextField txtid;
	private JTextField txtname;
	Connection con;
    PreparedStatement pspt;
    ResultSet rs;
    private JTextField txtBatch;
    private JTextField txthostel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveRequestIF frame = new LeaveRequestIF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeaveRequestIF() {
		con=DBManager.ConnectDatabase();
		
		//Importance
//		int x=Session.id;
//		String q="select * from tbl_registration where Id=?";
////		txtid.setText(""+x);
//	    try {
//	    	pspt=con.prepareStatement(q);
//	    	pspt.setInt(1, x);
//	    	rs=pspt.executeQuery();
//	    	String name=rs.getString(2);
//	    	txtid.setText(""+x);
//	    	txtname.setText(name);
//	    	
//	    	
//	    	
//	    	
//	    }
//	    catch (Exception e) {
//			// TODO: handle exception
//		}
		
		setBackground(new Color(135, 206, 250));
		setBounds(100, 45, 1250, 650);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(407, 657, 983, -522);
		panel.setBackground(new Color(135, 206, 250));
		getContentPane().add(panel);
		
		JPanel panel1Registration = new JPanel();
		panel1Registration.setLayout(null);
		panel1Registration.setBackground(new Color(25, 25, 112));
		panel1Registration.setBounds(0, 0, 1380, 80);
		getContentPane().add(panel1Registration);
		
		JLabel lblNewLabel = new JLabel("Leave Approval Request");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(287, 10, 588, 53);
		panel1Registration.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(30, 96, 919, 515);
		getContentPane().add(panel_2);
		
		JLabel lblEnterId = new JLabel("Enter Id");
		lblEnterId.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId.setBounds(29, 23, 86, 34);
		panel_2.add(lblEnterId);
		
		JLabel lblEnterId_1 = new JLabel("Enter Reason Of Leave");
		lblEnterId_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_1.setBounds(29, 218, 248, 34);
		panel_2.add(lblEnterId_1);
		
		JLabel lblEnterId_2 = new JLabel("Enter Name");
		lblEnterId_2.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_2.setBounds(29, 67, 129, 34);
		panel_2.add(lblEnterId_2);
		
		JLabel lblEnterId_4 = new JLabel("Enter Date Of Leave");
		lblEnterId_4.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_4.setBounds(39, 336, 238, 34);
		panel_2.add(lblEnterId_4);
		
		txtid = new JTextField();
		txtid.setEditable(false);
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setFont(new Font("Arial", Font.BOLD, 16));
		txtid.setColumns(10);
		txtid.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtid.setBounds(375, 10, 269, 34);
		int a=Session.id;
		txtid.setText(""+a);
		panel_2.add(txtid);
		
		txtname = new JTextField();
		txtname.setEditable(false);
		txtname.setHorizontalAlignment(SwingConstants.CENTER);
		txtname.setFont(new Font("Arial", Font.BOLD, 16));
		txtname.setColumns(10);
		txtname.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtname.setBounds(375, 54, 269, 34);
		txtname.setText(Session.name);
		panel_2.add(txtname);
		
		
		JLabel lblEnterId_2_1 = new JLabel("Enter Batch");
		lblEnterId_2_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_2_1.setBounds(29, 111, 129, 34);
		panel_2.add(lblEnterId_2_1);
		
		txtBatch = new JTextField();
		
		txtBatch.setHorizontalAlignment(SwingConstants.CENTER);
		txtBatch.setFont(new Font("Arial", Font.BOLD, 16));
		txtBatch.setEditable(false);
		txtBatch.setColumns(10);
		txtBatch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtBatch.setBounds(375, 98, 269, 34);
		txtBatch.setText(Session.Batch_id);
		panel_2.add(txtBatch);
		
		txthostel = new JTextField();
		txthostel.setText((String) null);
		txthostel.setHorizontalAlignment(SwingConstants.CENTER);
		txthostel.setFont(new Font("Arial", Font.BOLD, 16));
		txthostel.setEditable(false);
		txthostel.setColumns(10);
		txthostel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txthostel.setBounds(375, 143, 269, 34);
		txthostel.setText(Session.Hostel);
		panel_2.add(txthostel);
		
		JTextArea txtreason = new JTextArea();
		txtreason.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(165, 42, 42)));
		txtreason.setFont(new Font("Arial", Font.BOLD, 16));
		txtreason.setBounds(377, 201, 332, 125);
		panel_2.add(txtreason);
		
		JComboBox<Object> combod = new JComboBox<Object>();
		combod.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		combod.setFont(new Font("Arial", Font.BOLD, 15));
		combod.setModel(new DefaultComboBoxModel(new String[] {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combod.setBounds(375, 336, 107, 31);
		panel_2.add(combod);
		
		JComboBox<String> combom = new JComboBox<String>();
		combom.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		combom.setFont(new Font("Arial", Font.BOLD, 15));
		combom.setModel(new DefaultComboBoxModel(new String[] {"Select month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		combom.setBounds(510, 336, 125, 31);
		panel_2.add(combom);
		
		JComboBox<String> comboy = new JComboBox<String>();
		comboy.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		comboy.setFont(new Font("Arial", Font.BOLD, 15));
		comboy.setModel(new DefaultComboBoxModel(new String[] {"Select Year", "2022", "2023", "2024", "2025", "2026"}));
		comboy.setBounds(667, 336, 110, 31);
		panel_2.add(comboy);
		
		
		
		JComboBox<Object> combod_1 = new JComboBox<Object>();
		combod_1.setModel(new DefaultComboBoxModel(new String[] {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combod_1.setFont(new Font("Arial", Font.BOLD, 15));
		combod_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		combod_1.setBounds(377, 410, 107, 31);
		panel_2.add(combod_1);
		
		JComboBox<Object> comboy_3 = new JComboBox<Object>();
		comboy_3.setModel(new DefaultComboBoxModel(new String[] {"Select Year", "2022", "2023", "2024", "2025", "2026"}));
		comboy_3.setFont(new Font("Arial", Font.BOLD, 15));
		comboy_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		comboy_3.setBounds(670, 410, 107, 31);
		panel_2.add(comboy_3);
		
		JComboBox<Object> combom_2 = new JComboBox<Object>();
		combom_2.setModel(new DefaultComboBoxModel(new String[] {"Select month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		combom_2.setFont(new Font("Arial", Font.BOLD, 15));
		combom_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		combom_2.setBounds(510, 410, 136, 31);
		panel_2.add(combom_2);
         
		/// fatch automatically when leave request load
//		int a=Session.id;
//		String nam="";
//		String batch="";
//		String q1="select * from tbl_registration where Id=?";
////		txtid.setText(""+x);
//	    try {
//	    	pspt=con.prepareStatement(q1);
//	    	pspt.setInt(1, a);
//	    	rs=pspt.executeQuery();
//	    	
//	    	txtid.setText(""+a);
//	    	rs.next();
//	    	 nam=rs.getString(2);
//	    	txtname.setText(nam);
//	    	
//	    	batch=rs.getString(5);
//	    	System.out.println(batch);
//	    	txtBatch.setText(batch);
//	    	
//	    }
//	    catch (Exception e) {
//			// TODO: handle exception
//	    	System.out.println("Error msg"+e.getMessage());
//		}
	    String name=txtname.getText();
	    String batch1=txtBatch.getText();
	    String hostel=txthostel.getText();
		JButton btnrequest = new JButton("Request For Leave");
		btnrequest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String qu;
				
				String d,m,y,dt="",d1,m1,y1,dt1="";
				d=(String) combod.getSelectedItem();
				m=(String) combom.getSelectedItem();
				y=(String) comboy.getSelectedItem();
				d1=(String) combod_1.getSelectedItem();
				m1=(String) combom_2.getSelectedItem();
				y1=(String) comboy_3.getSelectedItem();
				dt=y+"-"+m+"-"+d;
				dt1=y1+"-"+m1+"-"+d1;
				String wait="Waiting for approval";
				String wait2="Waiting for approval";
			   qu="insert into tbl_leaveapproval values('"+a+"','"+name+"','"+batch1+"','"+dt+"','"+dt1+"','"+txtreason.getText()+"','"+wait+"','"+wait2+"','"+hostel+"')";
			
			  try {
				  pspt=con.prepareStatement(qu);
				  int a=pspt.executeUpdate();
				  if(a>0) {
					  JOptionPane.showMessageDialog(btnrequest, "Leave Request Generated");
				  }
				  else {
					  JOptionPane.showMessageDialog(btnrequest, "Leave Request Generated");
				  }
				  
			  }
			
			catch(Exception exp) {
			   System.out.println(exp.getMessage());
			}
			
			
		}
		});
		btnrequest.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		btnrequest.setFont(new Font("Arial", Font.BOLD, 14));
		btnrequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnrequest.setBounds(29, 457, 150, 34);
		panel_2.add(btnrequest);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearAll.setFont(new Font("Arial", Font.BOLD, 14));
		btnClearAll.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), null));
		btnClearAll.setBounds(612, 457, 150, 34);
		panel_2.add(btnClearAll);
		
		JLabel lblEnterId_4_1 = new JLabel(" Enetr Date Of Arrival");
		lblEnterId_4_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_4_1.setBounds(29, 410, 238, 34);
		panel_2.add(lblEnterId_4_1);
		
		JLabel lblEnterId_2_1_1 = new JLabel("Enter Hostel No");
		lblEnterId_2_1_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_2_1_1.setBounds(29, 155, 173, 34);
		panel_2.add(lblEnterId_2_1_1);
		
		
		
		
		
		
		

	}
}
