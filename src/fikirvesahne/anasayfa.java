package fikirvesahne;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;

public class anasayfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anasayfa frame = new anasayfa();
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
	public anasayfa() {
		
		
		
		setBackground(new Color(240, 247, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel location = new JLabel("");
		location.setIcon(new ImageIcon("/Users/suha/Downloads/pin.png"));
		location.setBounds(370, 6, 24, 24);
		contentPane.add(location);
		
		JLabel lblNewLabel = new JLabel("Get going");
		lblNewLabel.setForeground(new Color(252, 255, 255));
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.ITALIC, 15));
		lblNewLabel.setBounds(6, 6, 90, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/suha/Downloads/moon-2.png"));
		lblNewLabel_1.setBounds(16, 42, 32,32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tonight");
		lblNewLabel_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(252, 255, 255));
		lblNewLabel_2.setBounds(10, 80, 61, 16);
		contentPane.add(lblNewLabel_2);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.ITALIC, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/clock.png"));
		lblNewLabel_1_1.setBounds(83, 42, 32, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("This week");
		lblNewLabel_2_1.setForeground(new Color(252, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(71, 80, 61, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart.png"));
		lblNewLabel_1_1_1.setBounds(156, 42, 32, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Top shows");
		lblNewLabel_2_1_1.setForeground(new Color(252, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(144, 80, 68, 16);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/disco-ball-3.png"));
		lblNewLabel_1_1_1_1.setBounds(230, 42, 32, 32);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Late night");
		lblNewLabel_2_1_1_1.setForeground(new Color(252, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(219, 80, 68, 16);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/inca.png"));
		lblNewLabel_1_1_1_1_1.setBounds(294, 42, 39, 32);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Culture");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(252, 255, 255));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_1.setBounds(289, 80, 68, 16);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("");
		lblNewLabel_1_1_1_1_2.setIcon(new ImageIcon("/Users/suha/Downloads/theater.png"));
		lblNewLabel_1_1_1_1_2.setBounds(345, 42, 32, 32);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Comedy");
		lblNewLabel_2_1_1_1_2.setForeground(new Color(252, 255, 255));
		lblNewLabel_2_1_1_1_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_2.setBounds(342, 80, 68, 16);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		ImageIcon image = new ImageIcon("/Users/suha/Downloads/e9b1c5172088549.647900f750927-3.jpg");
		RoundedImageLabel lblNewLabel_3 = new RoundedImageLabel(image);
		lblNewLabel_3.setBounds(6, 124, 388, 361);
		lblNewLabel_3.setArc(40, 40); // Köşe ovali burada belirleniyor
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setBounds(6, 124, 380, 361);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sat, May 31");
		lblNewLabel_4.setFont(new Font("Kohinoor Telugu", Font.ITALIC, 13));
		lblNewLabel_4.setForeground(new Color(254, 246, 0));
		lblNewLabel_4.setBounds(6, 487, 77, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("");
		lblNewLabel_1_1_1_2.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_1_1_1_2.setBounds(345, 487, 16, 16);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_1_2_1.setIcon(new ImageIcon("/Users/suha/Downloads/list.png"));
		lblNewLabel_1_1_1_2_1.setBounds(370, 487, 16, 16);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
	
		
	}
}
