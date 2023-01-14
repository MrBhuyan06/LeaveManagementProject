package lms_project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class AllLeaveRequestIFFac extends JInternalFrame {
    PreparedStatement pspt;
    Connection con;
    ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllLeaveRequestIFFac frame = new AllLeaveRequestIFFac();
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
	public AllLeaveRequestIFFac() {
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
		panel1Registration.setBounds(0, 0, 1380, 80);
		getContentPane().add(panel1Registration);
		
		JLabel lblNewLabel = new JLabel("All Leave Request");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(287, 10, 588, 53);
		panel1Registration.add(lblNewLabel);
		
		JTable javatable = new JTable();
		javatable.setGridColor(new Color(255, 0, 0));
		javatable.setForeground(new Color(0, 0, 0));
		javatable.setRowHeight(30);
		javatable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		javatable.setFont(new Font("Arial", Font.PLAIN, 16));
		
		javatable.setBounds(10, 191, 1193, 240);
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
			lblNewLabel_1.setBounds(45, 171, 100, 22);
			getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Sname");
			lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(214, 171, 100, 22);
			getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Leave Date");
			lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(361, 171, 145, 22);
			getContentPane().add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_3 = new JLabel("Reason of Leave");
			lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_3.setBounds(703, 171, 158, 22);
			getContentPane().add(lblNewLabel_1_3);
			
			JLabel lblNewLabel_1_4 = new JLabel("Leave Status Warden");
			lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_4.setBounds(871, 171, 155, 22);
			getContentPane().add(lblNewLabel_1_4);
			JLabel lblNewLabel_1_2_1 = new JLabel("Arrival Date");
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setForeground(Color.BLACK);
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(530, 171, 145, 22);
			getContentPane().add(lblNewLabel_1_2_1);
			
			JLabel lblNewLabel_1_2_2 = new JLabel("Leave Status Faculty");
			lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_2.setForeground(Color.BLACK);
			lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel_1_2_2.setBounds(1036, 171, 167, 22);
			getContentPane().add(lblNewLabel_1_2_2);
		

		String a=SessionFaculty.Mentor_Id;
//		System.out.println(x);
		
		String q;
		try {
			q="select * from tbl_leaveapproval where BatchId=?";
			
			pspt=con.prepareStatement(q);
			pspt.setString(1, a);
			
			rs=pspt.executeQuery();
			javatable.setModel(DbUtils.resultSetToTableModel(rs));
			
		
			
			
		} catch (Exception e) {
           System.out.println(e.getMessage());
		}

	}

}
