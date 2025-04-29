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

public class Login_ extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTabbedPane w_tabpane;
	private JPanel passwordtextfield;
	private JPanel Login;
	private JLabel k_adi;
	private JLabel k_adi10;
	private JButton btnNewButton;
	private JLabel k_adi_1;
	private JLabel k_adi_2;
	private JLabel k_adi_3;
	private JLabel k_adi_4;
	private JButton btnSignup;
	private JTextField username_kayit;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField name_kayit;
	private JTextField email_kayit;
	private JTextField password_kayit;
	private JTextField usernametextfield;
	private JTextField textField_1;

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
		w_tabpane.setBounds(6, 310, 388, 256);
		contentPane.add(w_tabpane);
		
		Login = new JPanel();
		Login.setBackground(new Color(0, 0, 0));
		Login.setForeground(new Color(0, 0, 0));
		w_tabpane.addTab("Login", null, Login, null);
		Login.setLayout(null);
		
		k_adi = new JLabel("User Name :");
		k_adi.setBounds(36, 53, 77, 21);
		k_adi.setForeground(new Color(251, 255, 252));
		k_adi.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		Login.add(k_adi);
		
		k_adi10 = new JLabel("Password :");
		k_adi10.setForeground(new Color(251, 255, 252));
		k_adi10.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi10.setBounds(36, 86, 77, 21);
		Login.add(k_adi10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(125, 164, 117, 29);
		Login.add(btnNewButton);
		
		usernametextfield = new JTextField();
		usernametextfield.setForeground(Color.WHITE);
		usernametextfield.setColumns(10);
		usernametextfield.setBackground(Color.BLACK);
		usernametextfield.setBounds(113, 47, 248, 26);
		Login.add(usernametextfield);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(113, 80, 248, 26);
		Login.add(textField_1);
		
		passwordtextfield = new JPanel();
		passwordtextfield.setBackground(new Color(0, 0, 0));
		w_tabpane.addTab("Sign Up", null, passwordtextfield, null);
		passwordtextfield.setLayout(null);
		
		k_adi_1 = new JLabel("Name :");
		k_adi_1.setForeground(new Color(251, 255, 252));
		k_adi_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_1.setBounds(54, 18, 53, 21);
		passwordtextfield.add(k_adi_1);
		
		k_adi_2 = new JLabel("E-mail :");
		k_adi_2.setForeground(new Color(251, 255, 252));
		k_adi_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_2.setBounds(49, 51, 53, 21);
		passwordtextfield.add(k_adi_2);
		
		k_adi_3 = new JLabel("Username :");
		k_adi_3.setForeground(new Color(251, 255, 252));
		k_adi_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_3.setBounds(25, 84, 77, 21);
		passwordtextfield.add(k_adi_3);
		
		k_adi_4 = new JLabel("Password :");
		k_adi_4.setForeground(new Color(251, 255, 252));
		k_adi_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		k_adi_4.setBounds(25, 117, 77, 21);
		passwordtextfield.add(k_adi_4);
		
		btnSignup = new JButton("Sign Up");
		btnSignup.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 13));
		btnSignup.setBackground(Color.BLACK);
		btnSignup.setBounds(129, 164, 117, 29);
		passwordtextfield.add(btnSignup);
		
		username_kayit = new JTextField();
		username_kayit.setForeground(new Color(255, 255, 255));
		username_kayit.setColumns(10);
		username_kayit.setBackground(Color.BLACK);
		username_kayit.setBounds(97, 78, 264, 26);
		passwordtextfield.add(username_kayit);
		
		name_kayit = new JTextField();
		name_kayit.setForeground(Color.WHITE);
		name_kayit.setColumns(10);
		name_kayit.setBackground(Color.BLACK);
		name_kayit.setBounds(97, 12, 264, 26);
		passwordtextfield.add(name_kayit);
		
		email_kayit = new JTextField();
		email_kayit.setForeground(Color.WHITE);
		email_kayit.setColumns(10);
		email_kayit.setBackground(Color.BLACK);
		email_kayit.setBounds(97, 45, 264, 26);
		passwordtextfield.add(email_kayit);
		
		password_kayit = new JTextField();
		password_kayit.setForeground(Color.WHITE);
		password_kayit.setColumns(10);
		password_kayit.setBackground(Color.BLACK);
		password_kayit.setBounds(97, 111, 264, 26);
		passwordtextfield.add(password_kayit);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/suha/Downloads/IMG_0335-2.jpg"));
		lblNewLabel_2.setBounds(38, 79, 338, 247);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
