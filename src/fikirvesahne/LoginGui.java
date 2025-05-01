package fikirvesahne;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class LoginGui extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGui frame = new LoginGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginGui() {
		setBackground(new Color(240, 247, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton login_signup = new JButton("");
		login_signup.setIcon(new ImageIcon("resources/vinyl_login_signup_100x100_hq.png"));
		login_signup.setBackground(new Color(0, 0, 0));
		login_signup.setForeground(new Color(0, 0, 0));
		login_signup.setFont(new Font("Helvetica", Font.PLAIN, 13));
		login_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Login_ loginFrame = new Login_();
					loginFrame.setVisible(true);
					dispose();
			}
		});
		login_signup.setBounds(146, 466, 100, 100);
		contentPane.add(login_signup);
		
		JLabel lblNewLabel_1 = new JLabel("More shows,");
		lblNewLabel_1.setForeground(new Color(251, 252, 250));
		lblNewLabel_1.setFont(new Font("Bodoni 72 Oldstyle", Font.BOLD, 21));
		lblNewLabel_1.setBounds(146, 350, 136, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("more fun");
		lblNewLabel_1_1.setForeground(new Color(251, 251, 250));
		lblNewLabel_1_1.setFont(new Font("Bodoni 72", Font.BOLD, 21));
		lblNewLabel_1_1.setBounds(156, 379, 136, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("We've got something for everybody,now");
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.ITALIC, 13));
		lblNewLabel_2.setForeground(new Color(251, 251, 250));
		lblNewLabel_2.setBounds(80, 426, 268, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("get booked up");
		lblNewLabel_2_1.setFont(new Font("Kohinoor Devanagari", Font.ITALIC, 13));
		lblNewLabel_2_1.setForeground(new Color(251, 251, 250));
		lblNewLabel_2_1.setBounds(154, 443, 256, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("resources/ChatGPT Image 22 Nis 2025 12_44_52-2.png"));
		lblNewLabel_3.setBounds(67, 0, 307, 369);
		contentPane.add(lblNewLabel_3);
		
		JLabel setting = new JLabel("");
		setting.setIcon(new ImageIcon("resources/settings.png"));
		setting.setBounds(370, 6, 24, 24);
		contentPane.add(setting);
		
	
		
		
		
	}
}
