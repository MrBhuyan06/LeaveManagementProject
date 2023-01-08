package lms_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class StudentZone extends JFrame {

	private JPanel contentPane;
	private final JDesktopPane DP = new JDesktopPane();
	private final JMenu mnNewMenu = new JMenu("Leave Process Management");
	private final JMenuItem mntmNewMenuItem = new JMenuItem("Leave Request");
	private final JMenuItem mntmNewMenuItem_1 = new JMenuItem("Leave Approval status");
	private final JMenuItem mntmNewMenuItem_2 = new JMenuItem("Leave Pending");
	private final JPanel panel = new JPanel();
	private final JLabel lblNewLabel_2 = new JLabel("Dash Board");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("");
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Home");
	private final JPanel panel_1_1 = new JPanel();
	private final JLabel lblLogOut = new JLabel("Log out");
	private final JLabel lblNewLabel_3_1 = new JLabel("");
	private final JLabel txtcurrent = new JLabel("");
	private final JLabel sessionname = new JLabel("");
	private final JLabel lblNewLabel_6 = new JLabel("Welcome");
	LeaveRequestIF objlr=new LeaveRequestIF();
	LeaveApprovalstatusIF objlas=new LeaveApprovalstatusIF();
	PenddingLeaveIF objpl=new PenddingLeaveIF();
	private final JLabel lblNewLabel_5 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	private final JLabel lblNewLabel_7 = new JLabel("Gate pass");
	private final JLabel lblNewLabel_8 = new JLabel("Name");
	private final JLabel labeelid = new JLabel("Id");
	private final JLabel lblNewLabel_8_2 = new JLabel("Batch");
	private final JLabel labl = new JLabel("Campus");
	private final JLabel lblNewLabel_8_4 = new JLabel("Hostel no ");
	private final JLabel lblNewLabel_8_5 = new JLabel("Warden Review");
	private final JLabel lblNewLabel_8_6 = new JLabel("Faculty Review");
	private final JTextField pname = new JTextField();
	private final JTextField pid = new JTextField();
	private final JTextField pbatch = new JTextField();
	private final JTextField pcampus = new JTextField();
	private final JTextField phostel = new JTextField();
	private final JTextField pwardenr = new JTextField();
	private final JTextField pfacultyr = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentZone frame = new StudentZone();
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
	public  StudentZone() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
			public void actionPerformed(ActionEvent e) {
//				LeaveRequestIF obj=new LeaveRequestIF();
				DP.add(objlr);
				objlr.setVisible(true);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.BOLD, 16));
		
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				LeaveApprovalstatusIF obj1=new LeaveApprovalstatusIF();
				DP.add(objlas);
				objlas.setVisible(true);
			}
		});
		
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.BOLD, 16));
		
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				PenddingLeaveIF obj=new PenddingLeaveIF();
				DP.add(objpl);
				objpl.show();
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.BOLD, 15));
		
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu close = new JMenu("Closing Session");
		close.setFont(new Font("Arial", Font.BOLD, 25));
		menuBar.add(close);
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentZone frame = new StudentZone();
				frame.setVisible(true);
	              
			}
		});
		close.add(exit);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(new Color(0, 0, 139));
		panel.setBounds(0, 139, 373, 551);
		
		DP.add(panel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Elephant", Font.ITALIC, 34));
		lblNewLabel_2.setBounds(10, 0, 353, 59);
		
		panel.add(lblNewLabel_2);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 0, 199, 92);
		
		panel.add(lblNewLabel_1);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\MCA\\SEM2\\Java Project\\Java Project slms\\Image Folder\\cutmlogo.jpg"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(89, 234, 207, 164);
		
		panel.add(lblNewLabel_3);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 setVisible(false);
				 LoginFrame obj=new LoginFrame();
				 obj.setVisible(true);
				
				
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(10, 400, 353, 49);
		
		panel.add(panel_1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 35));
		lblNewLabel.setBounds(101, 10, 143, 29);
		
		panel_1.add(lblNewLabel);
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING",JOptionPane.YES_NO_OPTION);
				if(dialogButton == JOptionPane.YES_OPTION)
				{
					System.exit(0);
					}
				else {
					remove(dialogButton);
					}
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(230, 230, 250));
		panel_1_1.setBounds(10, 472, 353, 49);
		
		panel.add(panel_1_1);
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginFrame log=new LoginFrame();
				log.setVisible(true);
			}
		});
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setFont(new Font("Georgia", Font.BOLD, 35));
		lblLogOut.setBounds(105, 0, 143, 49);
		
		panel_1_1.add(lblLogOut);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(79, 245, 193, 118);
		
		panel.add(lblNewLabel_3_1);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 82, 353, 42);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 31));
		txtcurrent.setBounds(10, 192, 305, 32);
		panel.add(txtcurrent);
		txtcurrent.setFont(new Font("Arial", Font.BOLD, 18));
		txtcurrent.setText("The Current  user id "+Session.id);
		txtcurrent.setEnabled(false);
		sessionname.setHorizontalAlignment(SwingConstants.CENTER);
		sessionname.setBounds(10, 134, 353, 32);
		panel.add(sessionname);
		sessionname.setFont(new Font("Arial", Font.BOLD, 20));
		sessionname.setText(Session.name);
		sessionname.setEnabled(false);
		
//		JButton print = new JButton("New button");
//		print.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				panelbill.setVisible(true);
//			}
//		});
//		print.setBounds(979, 669, 160, 21);
//		DP.add(print);
		
		JPanel panelbill = new JPanel();
		panelbill.setBackground(Color.WHITE);
		panelbill.setForeground(Color.WHITE);
		panelbill.setBounds(671, 62, 694, 575);
		DP.add(panelbill);
		panelbill.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\MCA\\SEM2\\Java Project\\Java Project slms\\Image Folder\\cutmlogo.jpg"));
		lblNewLabel_4.setBounds(10, 10, 674, 184);
		panelbill.add(lblNewLabel_4);
		lblNewLabel_5.setBounds(20, 195, 674, 13);
		
		panelbill.add(lblNewLabel_5);
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 218, 684, 29);
		
		panelbill.add(lblNewLabel_7);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8.setBounds(10, 295, 131, 29);
		
		panelbill.add(lblNewLabel_8);
		labeelid.setFont(new Font("Arial", Font.BOLD, 20));
		labeelid.setBounds(10, 344, 131, 29);
		
		panelbill.add(labeelid);
		lblNewLabel_8_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8_2.setBounds(10, 401, 131, 29);
		
		panelbill.add(lblNewLabel_8_2);
		labl.setFont(new Font("Arial", Font.BOLD, 20));
		labl.setBounds(10, 459, 131, 29);
		
		panelbill.add(labl);
		panelbill.setVisible(false);
		lblNewLabel_8_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8_4.setBounds(10, 514, 131, 29);
		
		panelbill.add(lblNewLabel_8_4);
		lblNewLabel_8_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8_5.setBounds(427, 295, 166, 29);
		
		panelbill.add(lblNewLabel_8_5);
		lblNewLabel_8_6.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8_6.setBounds(427, 412, 186, 29);
		
		panelbill.add(lblNewLabel_8_6);
		pname.setHorizontalAlignment(SwingConstants.CENTER);
		pname.setFont(new Font("Arial", Font.BOLD, 16));
		pname.setColumns(10);
		pname.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pname.setBounds(102, 296, 269, 29);
		
		panelbill.add(pname);
		pid.setHorizontalAlignment(SwingConstants.CENTER);
		pid.setFont(new Font("Arial", Font.BOLD, 16));
		pid.setColumns(10);
		pid.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pid.setBounds(102, 345, 269, 29);
		
		panelbill.add(pid);
		pbatch.setHorizontalAlignment(SwingConstants.CENTER);
		pbatch.setFont(new Font("Arial", Font.BOLD, 16));
		pbatch.setColumns(10);
		pbatch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pbatch.setBounds(102, 402, 269, 29);
		
		panelbill.add(pbatch);
		pcampus.setHorizontalAlignment(SwingConstants.CENTER);
		pcampus.setFont(new Font("Arial", Font.BOLD, 16));
		pcampus.setColumns(10);
		pcampus.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pcampus.setBounds(102, 459, 269, 29);
		
		panelbill.add(pcampus);
		phostel.setHorizontalAlignment(SwingConstants.CENTER);
		phostel.setFont(new Font("Arial", Font.BOLD, 16));
		phostel.setColumns(10);
		phostel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		phostel.setBounds(102, 514, 269, 29);
		
		panelbill.add(phostel);
		pwardenr.setHorizontalAlignment(SwingConstants.CENTER);
		pwardenr.setFont(new Font("Arial", Font.BOLD, 16));
		pwardenr.setColumns(10);
		pwardenr.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pwardenr.setBounds(404, 344, 269, 29);
		
		panelbill.add(pwardenr);
		pfacultyr.setHorizontalAlignment(SwingConstants.CENTER);
		pfacultyr.setFont(new Font("Arial", Font.BOLD, 16));
		pfacultyr.setColumns(10);
		pfacultyr.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		pfacultyr.setBounds(392, 467, 269, 29);
		
		panelbill.add(pfacultyr);
		JButton print = new JButton("Gate Pass");
		print.setFont(new Font("Arial", Font.BOLD, 18));
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelbill.setVisible(true);
				pname.setText(Session.name);
				pid.setText(""+Session.id);
				
				pbatch.setText(Session.Batch_id);
				pcampus.setText(Session.campus);
				phostel.setText(Session.Hostel);
			   pwardenr.setText(SessionBil.Warden);
			   pfacultyr.setText(SessionBil.faculty);
  			  
			}
		});
		print.setBounds(979, 669, 160, 21);
		DP.add(print);
		
		JButton printgate = new JButton("Gate Pass");
		printgate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrinterJob job = PrinterJob.getPrinterJob();
	            job.setJobName("Print Data");
	            
	            job.setPrintable(new Printable(){
	            public int print(Graphics pg,PageFormat pf, int pageNum){
	                    pf.setOrientation(PageFormat.LANDSCAPE);
	                 if(pageNum > 0){
	                    return Printable.NO_SUCH_PAGE;
	                }
	                
	                Graphics2D g2 = (Graphics2D)pg;
	                g2.translate(pf.getImageableX(), pf.getImageableY());
	                g2.scale(0.47,0.47);
	                
	                panelbill.print(g2);
	         
	               
	                return Printable.PAGE_EXISTS;
	                         
	                
	            }
	    });
	            boolean ok = job.printDialog();
	        if(ok){
	        try{
	            
	        job.print();
	        }
	        catch (PrinterException ex){
		ex.printStackTrace();
	}
	        }
			}
		});
		printgate.setFont(new Font("Arial", Font.BOLD, 18));
		printgate.setBounds(1171, 671, 160, 21);
		DP.add(printgate);
	}
}
