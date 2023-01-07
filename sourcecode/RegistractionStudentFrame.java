package lms_project;

import java.awt.BorderLayout;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.border.TitledBorder;



import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistractionStudentFrame extends JFrame {
    Connection con;
    PreparedStatement pspt;
	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtcontact;
	private JTextField txtemail;
	private JPasswordField txtpass;
	private JTextField txtcaptcha;
	private JTextField txttypecaptcha;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField txtEnterCaptcha;
	private JLabel lblEnterId_3;
	
	
	public static String captcha() 
	{
		
		char a,b,c,d;
		a=(char)(((int)(Math.random()* (90-65)))+65);
		b=(char)(((int)(Math.random()* (122-97)))+97) ;
		c=(char)(((int)(Math.random()* (57-48)))+48) ;
		d=(char)(((int)(Math.random()* (57-48)))+48) ;
		String code=a+" "+b+" "+c+" "+" "+d;
		return code;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistractionStudentFrame frame = new RegistractionStudentFrame();
					
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
	public RegistractionStudentFrame() {
		
		//connnection established
		con=DBManager.ConnectDatabase();
//		System.out.println(con);
		setBackground(new Color(135, 206, 250));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1400, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(245, 255, 250));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, new Color(135, 206, 250), new Color(135, 206, 250), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel1Registration = new JPanel();
		panel1Registration.setBackground(new Color(25, 25, 112));
		panel1Registration.setBounds(10, 10, 1380, 80);
		contentPane.add(panel1Registration);
		panel1Registration.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(484, 10, 303, 53);
		panel1Registration.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setForeground(new Color(0, 0, 128));
		panel.setBounds(76, 10, 84, 70);
		panel1Registration.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\MCA\\SEM2\\Java Project\\Java Project slms\\Image Folder\\login2.png"));
		lblNewLabel_1.setBounds(10, 0, 80, 75);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(139, 0, 0));
		panel_1.setBounds(1319, 24, 51, 39);
		panel1Registration.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblcross = new JLabel("New label");
		lblcross.setBounds(0, 0, 51, 39);
		panel_1.add(lblcross);
		lblcross.addMouseListener(new MouseAdapter() {
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
			@Override
			public void mouseEntered(MouseEvent e) {
				lblcross.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblcross.setForeground(Color.white);
			}
		});
		lblcross.setIcon(new ImageIcon("D:\\MCA\\SEM2\\Java Project\\Java Project slms\\Image Folder\\cross.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(10, 118, 698, 525);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEnterId = new JLabel("Enter Id");
		lblEnterId.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId.setBounds(31, 10, 86, 34);
		panel_2.add(lblEnterId);
		
		JLabel lblEnterId_1 = new JLabel("Enter Campus");
		lblEnterId_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_1.setBounds(31, 118, 150, 34);
		panel_2.add(lblEnterId_1);
		
		JLabel lblEnterId_2 = new JLabel("Enter Name");
		lblEnterId_2.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_2.setBounds(31, 64, 129, 34);
		panel_2.add(lblEnterId_2);
		
		lblEnterId_3 = new JLabel("Enter Batch Id\r\n");
		lblEnterId_3.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_3.setBounds(31, 235, 214, 34);
		panel_2.add(lblEnterId_3);
		
		JLabel lblEnterId_4 = new JLabel("Enter ContactNumber");
		lblEnterId_4.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_4.setBounds(31, 178, 238, 34);
		panel_2.add(lblEnterId_4);
		
		JLabel lblEnterId_5 = new JLabel("Enter Gender");
		lblEnterId_5.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_5.setBounds(31, 371, 155, 34);
		panel_2.add(lblEnterId_5);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Arial", Font.BOLD, 16));
		txtid.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtid.setBounds(377, 7, 269, 44);
		panel_2.add(txtid);
		txtid.setColumns(10);
		
		JComboBox<String> combocampus = new JComboBox<String>();
		combocampus.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		combocampus.setFont(new Font("Arial", Font.BOLD, 16));
		combocampus.setEditable(true);
		
		panel_2.add(combocampus);
		combocampus.setBounds(377, 118, 269, 49);
		combocampus.addItem("Select Campus");
		combocampus.addItem("BHUBANESWAR");
		combocampus.addItem("PARALAKHEMUNDI");
		combocampus.addItem("BALANGIR");
		combocampus.addItem("RAYAGADA");
//		combocampus.setSelectedItem("Select Campus");
	
		txtname = new JTextField();
		txtname.setFont(new Font("Arial", Font.BOLD, 16));
		txtname.setBounds(377, 61, 269, 44);
		panel_2.add(txtname);
		txtname.setColumns(10);
		txtname.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		
		txtcontact = new JTextField();
		txtcontact.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
//				String value= 
				if((e.getKeyChar()>='0' && e.getKeyChar()<='9') || e.getKeyChar()==8)
				{
					txtcontact.setEditable(true);
				}
				else {
					txtcontact.setEditable(false);
					
				   }
			}
				
		});
		txtcontact.setFont(new Font("Arial", Font.BOLD, 16));
		txtcontact.setColumns(10);
		txtcontact.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtcontact.setBounds(377, 175, 269, 44);
		panel_2.add(txtcontact);
		
		JComboBox<String> combob = new JComboBox<String>();
		combob.setModel(new DefaultComboBoxModel(new String[] {"Select BatchId", "MCA-01", "B.Tech-02", "MBA-03"}));
		combob.setFont(new Font("Arial", Font.BOLD, 16));
		combob.setEditable(true);
		combob.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		combob.setBounds(377, 229, 269, 49);
		panel_2.add(combob);
//		combod.setSelectedItem("Select Designation");
		
		JComboBox<String> combog = new JComboBox<String>();
		combog.setModel(new DefaultComboBoxModel<String>(new String[] {"Select Gender","MALE", "FEMALE"}));
		combog.setFont(new Font("Arial", Font.BOLD, 16));
		combog.setEditable(true);
		combog.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		combog.setBounds(377, 356, 269, 49);
		panel_2.add(combog);
		
		JLabel lblEnterId_3_1 = new JLabel("Enter Hoster Number");
		lblEnterId_3_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_3_1.setBounds(31, 303, 214, 34);
		panel_2.add(lblEnterId_3_1);
		
		JComboBox<String> comboh = new JComboBox<String>();
		comboh.setModel(new DefaultComboBoxModel(new String[] {"Select Hostel", "No 1", "No 2", "No 3"}));
		comboh.setFont(new Font("Arial", Font.BOLD, 16));
		comboh.setEditable(true);
		comboh.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		comboh.setBounds(377, 288, 269, 49);
		panel_2.add(comboh);
		
		JButton btnNewButton = new JButton("Back To Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(164, 474, 222, 41);
		panel_2.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginFrame obj=new LoginFrame();
				obj.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
//		combog.setSelectedItem("Select ");
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2_1.setBackground(new Color(135, 206, 250));
		panel_2_1.setBounds(730, 119, 599, 169);
		contentPane.add(panel_2_1);
		
		JLabel lblEnterUserId = new JLabel("Enter Email");
		lblEnterUserId.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterUserId.setBounds(44, 13, 129, 34);
		panel_2_1.add(lblEnterUserId);
		
		JLabel lblEnterId_2_1 = new JLabel("Enter Password");
		lblEnterId_2_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_2_1.setBounds(44, 67, 168, 34);
		panel_2_1.add(lblEnterId_2_1);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Arial", Font.BOLD, 16));
		txtemail.setColumns(10);
		txtemail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtemail.setBounds(250, 10, 269, 44);
		panel_2_1.add(txtemail);
		
		txtpass = new JPasswordField();
		txtpass.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtpass.setFont(new Font("Arial", Font.BOLD, 16));
		txtpass.setBounds(250, 64, 269, 44);
		panel_2_1.add(txtpass);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2_1_1.setBackground(new Color(135, 206, 250));
		panel_2_1_1.setBounds(730, 316, 599, 169);
		contentPane.add(panel_2_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 235));
		panel_4.setBounds(103, 24, 361, 52);
		panel_2_1_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnInsert = new JButton("Insert Records");
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(combocampus.getSelectedIndex()==0 ||combob.getSelectedIndex()==0||combog.getSelectedIndex()==0 || comboh.getSelectedIndex()==0) 
				{
					JOptionPane.showMessageDialog(btnInsert, "Select All ComboBox");
				}
				
				  else 
				        {
					
					String a=txtcaptcha.getText();
					String b=txttypecaptcha.getText();
					if(a.equals(b)) 
					{
						// INSERT RECORD
//						JOptionPane.showMessageDialog(txtcaptcha, "");
						try {
						String q1,q2,campus,batch,hostel,gender,psw;
						campus=(String)combocampus.getSelectedItem();
						batch=(String)combob.getSelectedItem();
						hostel=(String)comboh.getSelectedItem();
						gender=(String)combog.getSelectedItem();
						

						psw=String.valueOf(txtpass.getPassword());
						q1="insert into tbl_registration values('"+txtid.getText()+"','"+txtname.getText()+"','"+campus+"','"+txtcontact.getText()+"','"+batch+"','"+hostel+"','"+gender+"','"+txtemail.getText()+"','"+psw+"')";
//						q2="insert into tbl_user values('"+txtemail.getText()+"','"+psw+"','"+txtid.getText()+"','"+usertype+"')";
						pspt=con.prepareStatement(q1);
						int r1=pspt.executeUpdate();
						
//						pspt=con.prepareStatement(q2);
//						int r2=pspt.executeUpdate();
						if(r1>0 )
						  {
							JOptionPane.showMessageDialog(btnInsert, "Records Inserted Succesfully");
						   }
						
						else   {
						
							
							JOptionPane.showMessageDialog(btnInsert,"User alredy exits");
						       }
						 }
						catch (Exception ex) {
							// TODO: handle exception
							JOptionPane.showMessageDialog(btnInsert, "Sql Related Error");
							ex.printStackTrace();
						}
					}
					
				else {
					JOptionPane.showMessageDialog(txtcaptcha, "CAPTCHA CODE MISSMATCH");
				}
					
					
				}
				
				
				
		}
			}
			);
		
	
		
		
		
		
		
		
		btnInsert.setBackground(new Color(72, 209, 204));
		btnInsert.setFont(new Font("Arial", Font.BOLD, 21));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsert.setBounds(28, 10, 307, 32);
		panel_4.add(btnInsert);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(135, 206, 235));
		panel_4_1.setBounds(103, 107, 361, 52);
		panel_2_1_1.add(panel_4_1);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtid.setText("");
				txtname.setText("");
				combocampus.setSelectedIndex(0);
				txtcontact.setText("");
				combob.setSelectedIndex(0);
				combog.setSelectedIndex(0);
				txtemail.setText("");
				txtemail.setText("");
				txtpass.setText("");
				txttypecaptcha.setText("");
				txtid.requestFocus();
			}
		});
		btnClearAll.setFont(new Font("Arial", Font.BOLD, 21));
		btnClearAll.setBackground(new Color(72, 209, 204));
		btnClearAll.setBounds(25, 10, 307, 32);
		panel_4_1.add(btnClearAll);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2_1_1_1.setBackground(new Color(135, 206, 250));
		panel_2_1_1_1.setBounds(730, 521, 660, 169);
		contentPane.add(panel_2_1_1_1);
		
		txtcaptcha = new JTextField();
		txtcaptcha.setEditable(false);
		txtcaptcha.setFont(new Font("Chiller", Font.BOLD, 37));
		txtcaptcha.setBounds(10, 21, 250, 47);
		panel_2_1_1_1.add(txtcaptcha);
		txtcaptcha.setColumns(10);
        String captcha_code=captcha();
		
		txtcaptcha.setText(captcha_code);
		
		txttypecaptcha = new JTextField();
		txttypecaptcha.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 0, 0)));
		txttypecaptcha.setFont(new Font("Arial", Font.PLAIN, 16));
		txttypecaptcha.setColumns(10);
		txttypecaptcha.setBounds(10, 101, 250, 47);
		panel_2_1_1_1.add(txttypecaptcha);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(294, 21, 157, 47);
		panel_2_1_1_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnrefresh = new JButton("Refresh");
		btnrefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String captcha_code=captcha();
				txtcaptcha.setText(captcha_code);
			}
		});
		btnrefresh.setFont(new Font("Arial", Font.BOLD, 18));
		btnrefresh.setBackground(new Color(72, 209, 204));
		btnrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnrefresh.setBounds(10, 10, 130, 27);
		panel_3.add(btnrefresh);
		
		textField_5 = new JTextField();
		textField_5.setBounds(51, 33, 157, 24);
		panel_2_1_1_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(83, 21, 125, 24);
		panel_2_1_1_1.add(textField_7);
		textField_7.setColumns(10);
		
		txtEnterCaptcha = new JTextField();
		txtEnterCaptcha.setForeground(Color.BLACK);
		txtEnterCaptcha.setText("Enter Captcha ");
		txtEnterCaptcha.setBounds(34, 30, 204, 31);
		panel_2_1_1_1.add(txtEnterCaptcha);
		txtEnterCaptcha.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Type Proper Captcha Code");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel_2.setBounds(308, 101, 282, 47);
		panel_2_1_1_1.add(lblNewLabel_2);
	
	}
}
