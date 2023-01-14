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
import java.awt.Component;

public class PenddingLeaveIF extends JInternalFrame {
	Connection con;
    PreparedStatement pspt;
    ResultSet rs;
    private JTable javatablepending;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PenddingLeaveIF frame = new PenddingLeaveIF();
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
	public PenddingLeaveIF() {
		getContentPane().setFont(new Font("Arial Black", Font.BOLD, 16));
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
		
		JLabel lblNewLabel = new JLabel("Leave Pending Status");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(287, 10, 588, 53);
		panel1Registration.add(lblNewLabel);
		
		javatablepending = new JTable();
		javatablepending.setAlignmentY(Component.TOP_ALIGNMENT);
		javatablepending.setAlignmentX(Component.RIGHT_ALIGNMENT);
		javatablepending.setRowHeight(30);
		javatablepending.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		javatablepending.setFont(new Font("Arial", Font.PLAIN, 16));
		
		javatablepending.setBounds(64, 191, 1031, 240);
		getContentPane().add(javatablepending);

		javatablepending.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column"
				}
			));
			
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Sid");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(169, 159, 100, 22);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Max Leave");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(527, 159, 100, 22);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Taken Leave");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(847, 159, 145, 22);
		getContentPane().add(lblNewLabel_1_2);
		int x=Session.id;
		String q;
		try {
			q="select * from tbl_leavecapacity where Sid=?";
			pspt=con.prepareStatement(q);
			pspt.setInt(1, x);
			rs=pspt.executeQuery();
			javatablepending.setModel(DbUtils.resultSetToTableModel(rs));
  
			
			
		} catch (Exception e) {
           System.out.println(e.getMessage());
		}
		
	}

}
