package lms_project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParticularStudentApprovalIFWar extends JInternalFrame {
     
     PreparedStatement pspt;
     Connection con;
     ResultSet rs;
     private JTextField txtid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParticularStudentApprovalIFWar frame = new ParticularStudentApprovalIFWar();
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
public ParticularStudentApprovalIFWar()
	{
		getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
	con=DBManager.ConnectDatabase();
	getContentPane().setForeground(Color.WHITE);
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
	panel1Registration.setBounds(30, 0, 1380, 80);
	getContentPane().add(panel1Registration);
	
	JLabel lblNewLabel = new JLabel("Particular Student Approval");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
	lblNewLabel.setForeground(Color.WHITE);
	lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
	lblNewLabel.setBounds(287, 10, 696, 53);
	panel1Registration.add(lblNewLabel);
	
	JTable javatable = new JTable();
	javatable.setGridColor(new Color(255, 0, 0));
	javatable.setForeground(new Color(0, 0, 0));
	javatable.setRowHeight(30);
	javatable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	javatable.setFont(new Font("Arial", Font.PLAIN, 16));
	
	javatable.setBounds(10, 125, 1193, 197);
	getContentPane().add(javatable);
	javatable.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
		},
		new String[] {
			"New column", "New column", "New column", "New column", "New column", "New column", "New column"
		}
	));
		
		JLabel lblNewLabel_1 = new JLabel("Sid");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 104, 100, 22);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sname");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(211, 106, 100, 17);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Leave Date");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(374, 105, 145, 22);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Reason of Leave");
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(704, 104, 158, 22);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Leave Status  warden");
		lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(872, 104, 155, 22);
		getContentPane().add(lblNewLabel_1_4);
		JLabel lblNewLabel_1_2_1 = new JLabel("Arrival Date");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(529, 104, 145, 22);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = 	new JLabel("Leave Status Faculty");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(1036, 104, 167, 22);
		getContentPane().add(lblNewLabel_1_2_2);
	


		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Approal Control", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, new Color(0, 0, 139)));
		panel_1.setBounds(10, 332, 1204, 267);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Sid\r\n");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(226, 35, 159, 34);
		panel_1.add(lblNewLabel_2);
		
		JComboBox<Object> comboapproval = new JComboBox<Object>();
		comboapproval.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		comboapproval.setFont(new Font("Arial", Font.BOLD, 16));
		comboapproval.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select Status", "Approved", "Rejected"}));
		comboapproval.setBounds(419, 75, 214, 42);
		panel_1.add(comboapproval);
		
		txtid = new JTextField();
		txtid.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		txtid.setFont(new Font("Arial", Font.BOLD, 16));
		txtid.setBounds(419, 35, 214, 30);
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		JButton process = new JButton("Process");
		process.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(comboapproval.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(process, "Please Select The status");
				}
				else 
				{
					String s;
					int sid=Integer.parseInt(txtid.getText());
				 if(comboapproval.getSelectedIndex()==1) 
				 {
					 s=(String)comboapproval.getSelectedItem();
					 
				 }
				 
				 else 
				 {
					 s=(String)comboapproval.getSelectedItem();
					
				}
				 try 
				 {
				  String q="update tbl_leaveapproval set RemarkWarden=? where Sid=?";
				  pspt=con.prepareStatement(q);
				  pspt.setString(1, s);
				  pspt.setInt(2, sid);
				  int rs=pspt.executeUpdate();
				  if(rs>0) {
					  JOptionPane.showMessageDialog(process, "Leave Request Approved");
				  }
				  else {
					  JOptionPane.showMessageDialog(process, "DB Error");
					  if(s.equals("Approved"))
					  {
						  
						  
						  
					  }
						  
						  
				  }
				  
					 
					 
				 }
				 catch(Exception ex) 
				 {
					 System.out.println(ex.getMessage());
				 }
				
				}
				
				
				
			}
		});
		process.setFont(new Font("Arial", Font.PLAIN, 17));
		process.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		
		
		process.setBounds(346, 192, 185, 34);
		panel_1.add(process);
		
	
		String x=SessionWarden.hostel_no;
		
		String a=SessionWarden.hostel_no;
//		System.out.println(x);
		
		String q;
		try {
			q="select * from tbl_leaveapproval where Hostelno=?";
			
			pspt=con.prepareStatement(q);
			pspt.setString(1, a);
			
			rs=pspt.executeQuery();
			javatable.setModel(DbUtils.resultSetToTableModel(rs));
			
		
			
			
		} catch (Exception e) {
           System.out.println(e.getMessage());
		}
	



}
}
