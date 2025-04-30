package fikirvesahne;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login_ extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTabbedPane w_tabpane;
	private JPanel signupsekme;
	private JPanel Loginsekme;
	private JLabel k_adi;
	private JLabel k_adi10;
	private JButton btnNewButton;
	private JLabel k_adi_1;
	private JLabel k_adi_2;
	private JLabel k_adi_3;
	private JLabel k_adi_4;
	private JTextField username_kayit;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField name_kayit;
	private JTextField email_kayit;
	private JTextField usernametextfield;
	private JButton btnsignup;
	private JPasswordField passwordField;
	private JPasswordField password_kayit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_ frame = new Login_();
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
	public Login_() {
		setBackground(new Color(240, 247, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(145, 0, 100, 100);
		lblNewLabel.setIcon(new ImageIcon("/Users/suha/Downloads/ChatGPT Image 22 Nis 2025 18_19_04-2.png"));
		contentPane.add(lblNewLabel);
		
		w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBounds(6, 310, 388, 282);
		contentPane.add(w_tabpane);
		
		
		Loginsekme = new JPanel();
		Loginsekme.setBackground(new Color(0, 0, 0));
		Loginsekme.setForeground(new Color(0, 0, 0));
		w_tabpane.addTab("Login", null, Loginsekme, null);
		Loginsekme.setLayout(null);
		
		
		
		k_adi = new JLabel("User Name :");
		k_adi.setBounds(36, 53, 77, 21);
		k_adi.setForeground(new Color(251, 255, 252));
		k_adi.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		Loginsekme.add(k_adi);
		
		k_adi10 = new JLabel("Password :");
		k_adi10.setForeground(new Color(251, 255, 252));
		k_adi10.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi10.setBounds(36, 86, 77, 21);
		Loginsekme.add(k_adi10);
		
		
		btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon("/Users/suha/Downloads/ChatGPT Image 22 Nis 2025 18_26_53-2.png"));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String username = usernametextfield.getText();
		        String password = new String(passwordField.getPassword());

		        if (UserDatabase.authenticate(username, password)) {
		            System.out.println("Login successful!");
		            // Yeni GUI'ye geç
		            tonightgui gui = new tonightgui();
		            gui.setVisible(true);
		            // Mevcut pencereyi kapat
		            dispose();
		        } else {
		            System.out.println("Login failed: Incorrect username or password.");
		        }
		    }
		});


		

	
		btnNewButton.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(137, 131, 86, 99);
		Loginsekme.add(btnNewButton);
		
		
		usernametextfield = new JTextField();
		usernametextfield.setForeground(Color.WHITE);
		usernametextfield.setColumns(10);
		usernametextfield.setBackground(Color.BLACK);
		usernametextfield.setBounds(113, 47, 248, 26);
		Loginsekme.add(usernametextfield);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(0, 0, 0));
		passwordField.setBounds(113, 80, 248, 26);
		Loginsekme.add(passwordField);
		passwordField.setForeground(Color.WHITE);

		
		signupsekme = new JPanel();
		signupsekme.setBackground(new Color(0, 0, 0));
		w_tabpane.addTab("Sign Up", null, signupsekme, null);
		signupsekme.setLayout(null);
		
		k_adi_1 = new JLabel("Name :");
		k_adi_1.setForeground(new Color(251, 255, 252));
		k_adi_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_1.setBounds(54, 18, 53, 21);
		signupsekme.add(k_adi_1);
		
		k_adi_2 = new JLabel("E-mail :");
		k_adi_2.setForeground(new Color(251, 255, 252));
		k_adi_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_2.setBounds(54, 84, 53, 21);
		signupsekme.add(k_adi_2);
		
		k_adi_3 = new JLabel("Username :");
		k_adi_3.setForeground(new Color(251, 255, 252));
		k_adi_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_3.setBounds(25, 51, 77, 21);
		signupsekme.add(k_adi_3);
		
		k_adi_4 = new JLabel("Password :");
		k_adi_4.setForeground(new Color(251, 255, 252));
		k_adi_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_4.setBounds(25, 117, 77, 21);
		signupsekme.add(k_adi_4);
		
		username_kayit = new JTextField();
		username_kayit.setForeground(new Color(255, 255, 255));
		username_kayit.setColumns(10);
		username_kayit.setBackground(Color.BLACK);
		username_kayit.setBounds(97, 45, 264, 26);
		signupsekme.add(username_kayit);
		
		name_kayit = new JTextField();
		name_kayit.setForeground(Color.WHITE);
		name_kayit.setColumns(10);
		name_kayit.setBackground(Color.BLACK);
		name_kayit.setBounds(97, 12, 264, 26);
		signupsekme.add(name_kayit);
		
		email_kayit = new JTextField();
		email_kayit.setForeground(Color.WHITE);
		email_kayit.setColumns(10);
		email_kayit.setBackground(Color.BLACK);
		email_kayit.setBounds(97, 78, 264, 26);
		signupsekme.add(email_kayit);
		
		btnsignup = new JButton("Login");
		btnsignup.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String name = name_kayit.getText();
		        String email = email_kayit.getText();
		        String username = username_kayit.getText();
		        String password = new String(password_kayit.getPassword());

		        User newUser = new User(name, email, username, password);

		        if (UserDatabase.addUser(newUser)) {
		            System.out.println("Registration successful!");
		        } else {
		            System.out.println("Registration failed: Username already exists.");
		        }
		    }
		});


			
		btnsignup.setIcon(new ImageIcon("/Users/suha/Downloads/ChatGPT Image 22 Nis 2025 18_26_53-2.png"));
		btnsignup.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		btnsignup.setBackground(Color.BLACK);
		btnsignup.setBounds(136, 131, 86, 99);
		signupsekme.add(btnsignup);
		
		password_kayit = new JPasswordField();
		password_kayit.setBackground(new Color(0, 0, 0));
		password_kayit.setBounds(97, 111, 264, 27);
		signupsekme.add(password_kayit);
		password_kayit.setForeground(Color.WHITE);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/suha/Downloads/IMG_0335-2.jpg"));
		lblNewLabel_2.setBounds(38, 79, 338, 247);
		contentPane.add(lblNewLabel_2);
		
		
		
		
		
	}
}
