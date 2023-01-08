package lms_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WardenZone extends JFrame {

	private JPanel contentPane;
	private final JDesktopPane DP = new JDesktopPane();
	private final JMenu mnNewMenu = new JMenu("Leave Approval Segment");
	private final JMenuItem mntmNewMenuItem = new JMenuItem("All Leave Request");
	private final JMenuItem mntmNewMenuItem_2 = new JMenuItem("Particular Student Approval\r\n");
	private final JPanel panel = new JPanel();
	private final JLabel lblNewLabel_2 = new JLabel("Dash Board");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("");
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Home");
	private final JPanel panel_1_1 = new JPanel();
	private final JLabel lblLogOut = new JLabel("Log out");
	private final JLabel lblNewLabel_3_1 = new JLabel("");
	private final JLabel lblNewLabel_4 = new JLabel("New label");
	private final JLabel sessionid = new JLabel("");
	private final JLabel lbsuserid = new JLabel("");
	private final JLabel lblNewLabel_6 = new JLabel("Hello Warde");
	AllLeaveRequestIFWar objals=new AllLeaveRequestIFWar();
	ParticularStudentApprovalIFWar objpa= new ParticularStudentApprovalIFWar();
	private final JLabel sessionnane = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WardenZone frame = new WardenZone();
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
	public WardenZone() {
		lbsuserid.setFont(new Font("Arial", Font.BOLD, 16));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
//		contentPane.setLayout(null);
		setUndecorated(true);
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setLayout(null);
		DP.setBackground(new Color(135, 206, 250));
		DP.setBounds(0, 0, 1400, 700);
		contentPane.add(DP);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1400, 32);
		DP.add(menuBar);
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 26));
		
		menuBar.add(mnNewMenu);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
//				AllLeaveRequestIFWar obj=new AllLeaveRequestIFWar();
				DP.add(objals);
				objals.setVisible(true);
				
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.BOLD, 16));
		
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ParticularStudentApprovalIFWar obj= new ParticularStudentApprovalIFWar();
				DP.add(objpa);
				objpa.show();

			}
		});
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.BOLD, 15));
		
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Closing Session");
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 25));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.setFont(new Font("Arial", Font.BOLD, 16));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WardenZone frame = new WardenZone();
				frame.setVisible(true);
		        
		        
				
			}
		});
		mnNewMenu_1.add(exit);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(new Color(0, 0, 139));
		panel.setBounds(0, 139, 373, 551);
		
		DP.add(panel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Elephant", Font.ITALIC, 34));
		lblNewLabel_2.setBounds(10, 10, 353, 59);
		
		panel.add(lblNewLabel_2);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 0, 199, 92);
		
		panel.add(lblNewLabel_1);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\MCA\\SEM2\\Java Project\\Java Project slms\\Image Folder\\cutmlogo.jpg"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(73, 240, 245, 160);
		
		panel.add(lblNewLabel_3);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginFrame obj=new LoginFrame();
				obj.setVisible(true);
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(10, 400, 353, 49);
		
		panel.add(panel_1);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginFrame obj=new LoginFrame();
				obj.setVisible(true);
		  
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 35));
		lblNewLabel.setBounds(101, 10, 143, 29);
		
		panel_1.add(lblNewLabel);
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(230, 230, 250));
		panel_1_1.setBounds(10, 472, 353, 49);
		
		panel.add(panel_1_1);
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setFont(new Font("Georgia", Font.BOLD, 35));
		lblLogOut.setBounds(105, 0, 143, 49);
		
		panel_1_1.add(lblLogOut);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 67, 353, 42);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 31));
		sessionid.setBounds(10, 181, 353, 49);
		panel.add(sessionid);
		sessionid.setFont(new Font("Arial", Font.BOLD, 18));
		sessionid.setText("The Current user id is "+SessionWarden.id);
		sessionid.setEnabled(false);
		
		sessionnane.setForeground(Color.WHITE);
		sessionnane.setHorizontalAlignment(SwingConstants.CENTER);
		sessionnane.setFont(new Font("Tahoma", Font.BOLD, 31));
		sessionnane.setBounds(10, 112, 353, 42);
		sessionnane.setText(SessionWarden.name);
		sessionnane.setEnabled(false);
//		Sessionnane.setT
		
		panel.add(sessionnane);
		lblNewLabel_3_1.setBounds(138, 222, 193, 138);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(637, 19, 45, 13);
		
		DP.add(lblNewLabel_4);
		lbsuserid.setEnabled(false);
		lbsuserid.setBounds(607, 236, 211, 32);
		
		DP.add(lbsuserid);
	}

}
