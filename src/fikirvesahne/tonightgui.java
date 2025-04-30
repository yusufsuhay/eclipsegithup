package fikirvesahne;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class tonightgui extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayout;
	private JPanel cardPanel;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				tonightgui frame = new tonightgui();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public tonightgui() {
		setBackground(new Color(240, 247, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Get going");
		lblNewLabel.setBounds(6, 6, 90, 24);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.ITALIC, 19));
		contentPane.add(lblNewLabel);

		// Panel for cards
		JPanel buttonpanel = new JPanel();
		buttonpanel.setBounds(5, 108, 390, 462);
		contentPane.add(buttonpanel);
		buttonpanel.setLayout(null);

		cardPanel = new JPanel();
		cardPanel.setBounds(0, 0, 390, 480);
		buttonpanel.add(cardPanel);

		cardLayout = new CardLayout(0, 0);
		cardPanel.setLayout(cardLayout);

		// Cards
		JPanel Comedy = new JPanel();
		Comedy.setBackground(new Color(0, 0, 0));
		cardPanel.add(Comedy, "comedy");
		Comedy.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(6, 6, 378, 72);
		Comedy.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/suha/Downloads/tuzbiber-stand-up-20241311157241ced9360644e4386a6d5fb83b04aaee8-2.png"));
		lblNewLabel_3.setBounds(6, 6, 82, 60);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tuz Biber Standup");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5.setBounds(100, 29, 128, 21);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6.setBounds(100, 46, 122, 16);
		panel_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2_9 = new JLabel("New label");
		lblNewLabel_2_9.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9.setBounds(356, 28, 16, 16);
		panel_1.add(lblNewLabel_2_9);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(6, 79, 378, 72);
		Comedy.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("/Users/suha/Downloads/MV5BOTBlNjE0MzItZTYxMi00NDU4LTljNTctYzM5MDE4MGViNjFhXkEyXkFqcGc._V1_.jpg"));
		lblNewLabel_3_1.setBounds(-11, 6, 85, 66);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_9_1 = new JLabel("New label");
		lblNewLabel_2_9_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_1.setBounds(356, 28, 16, 16);
		panel_1_1.add(lblNewLabel_2_9_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Konusanlar");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_1.setBounds(98, 17, 146, 21);
		panel_1_1.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_1.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_1.setBounds(98, 39, 122, 16);
		panel_1_1.add(lblNewLabel_1_6_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.BLACK);
		panel_1_1_1.setBounds(6, 152, 378, 72);
		Comedy.add(panel_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/301726235_510230674438273_2624799761498581254_n-3.jpg"));
		lblNewLabel_3_1_1.setBounds(0, 0, 74, 72);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_9_1_1 = new JLabel("New label");
		lblNewLabel_2_9_1_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_1_1.setBounds(356, 28, 16, 16);
		panel_1_1_1.add(lblNewLabel_2_9_1_1);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Cem Yilmaz");
		lblNewLabel_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_1_1.setBounds(100, 29, 146, 21);
		panel_1_1_1.add(lblNewLabel_1_5_1_1);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_1_1.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_1_1.setBounds(100, 50, 122, 16);
		panel_1_1_1.add(lblNewLabel_1_6_1_1);

		JPanel Favori =new JPanel();
		Favori.setBackground(new Color(0, 0, 0));
		cardPanel.add(Favori, "favori");

		JPanel Culture = new JPanel();
		Culture.setBackground(new Color(0, 0, 0));
		cardPanel.add(Culture, "culture");
		Culture.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(6, 6, 378, 72);
		Culture.add(panel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("/Users/suha/Downloads/yuzlesme-digital-2.jpg"));
		lblNewLabel_3_2.setBounds(6, 6, 82, 60);
		panel_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Yuzlesme Digital");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2.setBounds(100, 29, 128, 21);
		panel_1_2.add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2.setBounds(100, 46, 122, 16);
		panel_1_2.add(lblNewLabel_1_6_2);
		
		JLabel lblNewLabel_2_9_2 = new JLabel("");
		lblNewLabel_2_9_2.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2.setBounds(356, 28, 16, 16);
		panel_1_2.add(lblNewLabel_2_9_2);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBackground(Color.BLACK);
		panel_1_3_1.setBounds(6, 79, 378, 72);
		Culture.add(panel_1_3_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon("/Users/suha/Downloads/Refik-anadol-01-scaled-2.jpg"));
		lblNewLabel_3_3_1.setBounds(6, 6, 82, 60);
		panel_1_3_1.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_1_5_3_1 = new JLabel("Refik Anadol");
		lblNewLabel_1_5_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_3_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_3_1.setBounds(100, 29, 128, 21);
		panel_1_3_1.add(lblNewLabel_1_5_3_1);
		
		JLabel lblNewLabel_1_6_3_1 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_3_1.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_3_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_3_1.setBounds(100, 46, 122, 16);
		panel_1_3_1.add(lblNewLabel_1_6_3_1);
		
		JLabel lblNewLabel_2_9_3_1 = new JLabel("New label");
		lblNewLabel_2_9_3_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_3_1.setBounds(356, 28, 16, 16);
		panel_1_3_1.add(lblNewLabel_2_9_3_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.BLACK);
		panel_1_4.setBounds(6, 152, 378, 72);
		Culture.add(panel_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon("/Users/suha/Downloads/van-gogh-dijital-sergisi-acildi-uOqGwd2i-2.jpg"));
		lblNewLabel_3_4.setBounds(6, 6, 82, 60);
		panel_1_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("Van Gogh Museum");
		lblNewLabel_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_1_5_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_4.setBounds(100, 29, 128, 21);
		panel_1_4.add(lblNewLabel_1_5_4);
		
		JLabel lblNewLabel_1_6_4 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_4.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_4.setBounds(100, 46, 122, 16);
		panel_1_4.add(lblNewLabel_1_6_4);
		
		JLabel lblNewLabel_2_9_4 = new JLabel("New label");
		lblNewLabel_2_9_4.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_4.setBounds(356, 28, 16, 16);
		panel_1_4.add(lblNewLabel_2_9_4);

		JPanel Concert = new JPanel();
		Concert.setBackground(new Color(0, 0, 0));
		cardPanel.add(Concert, "concert");
		Concert.setLayout(null);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(194, 5, 1, 1);
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.BLACK);
		Concert.add(panel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(6, 6, 82, 60);
		panel_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("Refik Anadol");
		lblNewLabel_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_3.setBounds(100, 29, 128, 21);
		panel_1_3.add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_6_3 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_3.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_3.setBounds(100, 46, 122, 16);
		panel_1_3.add(lblNewLabel_1_6_3);
		
		JLabel lblNewLabel_2_9_3 = new JLabel("New label");
		lblNewLabel_2_9_3.setBounds(356, 28, 16, 16);
		panel_1_3.add(lblNewLabel_2_9_3);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(Color.BLACK);
		panel_1_2_1.setBounds(6, 5, 378, 72);
		Concert.add(panel_1_2_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon("/Users/suha/Downloads/e9b1c5172088549.647900f750927-3-2.jpg"));
		lblNewLabel_3_2_1.setBounds(6, 6, 82, 60);
		panel_1_2_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("Buyuk Ev Ablukada");
		lblNewLabel_1_5_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_2_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2_1.setBounds(100, 29, 128, 21);
		panel_1_2_1.add(lblNewLabel_1_5_2_1);
		
		JLabel lblNewLabel_1_6_2_1 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2_1.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2_1.setBounds(100, 46, 122, 16);
		panel_1_2_1.add(lblNewLabel_1_6_2_1);
		
		JLabel lblNewLabel_2_9_2_1 = new JLabel("");
		lblNewLabel_2_9_2_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2_1.setBounds(356, 28, 16, 16);
		panel_1_2_1.add(lblNewLabel_2_9_2_1);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBackground(Color.BLACK);
		panel_1_2_2.setBounds(6, 79, 378, 72);
		Concert.add(panel_1_2_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("");
		lblNewLabel_3_2_2.setIcon(new ImageIcon("/Users/suha/Downloads/brek-yangin-konseri-72052-2.jpg"));
		lblNewLabel_3_2_2.setBounds(6, 6, 82, 60);
		panel_1_2_2.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_1_5_2_2 = new JLabel("Brek");
		lblNewLabel_1_5_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2_2.setBounds(100, 29, 128, 21);
		panel_1_2_2.add(lblNewLabel_1_5_2_2);
		
		JLabel lblNewLabel_1_6_2_2 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2_2.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2_2.setBounds(100, 46, 122, 16);
		panel_1_2_2.add(lblNewLabel_1_6_2_2);
		
		JLabel lblNewLabel_2_9_2_2 = new JLabel("");
		lblNewLabel_2_9_2_2.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2_2.setBounds(356, 28, 16, 16);
		panel_1_2_2.add(lblNewLabel_2_9_2_2);
		
		JPanel panel_1_2_3 = new JPanel();
		panel_1_2_3.setLayout(null);
		panel_1_2_3.setBackground(Color.BLACK);
		panel_1_2_3.setBounds(6, 153, 378, 72);
		Concert.add(panel_1_2_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("");
		lblNewLabel_3_2_3.setIcon(new ImageIcon("/Users/suha/Downloads/ab67616d0000b273f8278fed048f38a3c5889caa-2.jpeg"));
		lblNewLabel_3_2_3.setBounds(6, 6, 82, 77);
		panel_1_2_3.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_1_5_2_3 = new JLabel("Radiohead");
		lblNewLabel_1_5_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_2_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2_3.setBounds(100, 29, 128, 21);
		panel_1_2_3.add(lblNewLabel_1_5_2_3);
		
		JLabel lblNewLabel_1_6_2_3 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2_3.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2_3.setBounds(100, 46, 122, 16);
		panel_1_2_3.add(lblNewLabel_1_6_2_3);
		
		JLabel lblNewLabel_2_9_2_3 = new JLabel("");
		lblNewLabel_2_9_2_3.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2_3.setBounds(356, 28, 16, 16);
		panel_1_2_3.add(lblNewLabel_2_9_2_3);

		JPanel Anaekran = new JPanel();
		Anaekran.setBackground(new Color(0, 0, 0));
		cardPanel.add(Anaekran, "anaekran");
		Anaekran.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 390, 152);
		Anaekran.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/suha/Downloads/ab67616d0000b273f8278fed048f38a3c5889caa-2.jpeg"));
		lblNewLabel_2.setBounds(6, 18, 120, 115);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("/Users/suha/Downloads/yuzlesme-digital-2.jpg"));
		lblNewLabel_2_1.setBounds(138, 27, 101, 98);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("/Users/suha/Downloads/e9b1c5172088549.647900f750927-3-2.jpg"));
		lblNewLabel_2_2.setBounds(283, 18, 101, 107);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Latest hot spots near you");
		lblNewLabel_4.setForeground(new Color(241, 255, 231));
		lblNewLabel_4.setBounds(6, 130, 233, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Popular on FikirVeSahne");
		lblNewLabel_5.setForeground(new Color(243, 255, 248));
		lblNewLabel_5.setBounds(10, 164, 162, 16);
		Anaekran.add(lblNewLabel_5);
		
		JPanel panel_1_2_4 = new JPanel();
		panel_1_2_4.setLayout(null);
		panel_1_2_4.setBackground(Color.BLACK);
		panel_1_2_4.setBounds(0, 182, 390, 72);
		Anaekran.add(panel_1_2_4);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("");
		lblNewLabel_3_2_4.setIcon(new ImageIcon("/Users/suha/Downloads/yuzlesme-digital-2.jpg"));
		lblNewLabel_3_2_4.setBounds(6, 6, 82, 60);
		panel_1_2_4.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_1_5_2_4 = new JLabel("Yuzlesme Digital");
		lblNewLabel_1_5_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_5_2_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2_4.setBounds(100, 29, 128, 21);
		panel_1_2_4.add(lblNewLabel_1_5_2_4);
		
		JLabel lblNewLabel_1_6_2_4 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2_4.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2_4.setBounds(100, 46, 122, 16);
		panel_1_2_4.add(lblNewLabel_1_6_2_4);
		
		JLabel lblNewLabel_2_9_2_4 = new JLabel("");
		lblNewLabel_2_9_2_4.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2_4.setBounds(356, 28, 16, 16);
		panel_1_2_4.add(lblNewLabel_2_9_2_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBackground(Color.BLACK);
		panel_1_5.setBounds(0, 253, 390, 72);
		Anaekran.add(panel_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setIcon(new ImageIcon("/Users/suha/Downloads/tuzbiber-stand-up-20241311157241ced9360644e4386a6d5fb83b04aaee8-2.png"));
		lblNewLabel_3_5.setBounds(6, 6, 82, 60);
		panel_1_5.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_1_5_5 = new JLabel("Tuz Biber Standup");
		lblNewLabel_1_5_5.setForeground(Color.WHITE);
		lblNewLabel_1_5_5.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_5.setBounds(100, 29, 128, 21);
		panel_1_5.add(lblNewLabel_1_5_5);
		
		JLabel lblNewLabel_1_6_5 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_5.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_5.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_5.setBounds(100, 46, 122, 16);
		panel_1_5.add(lblNewLabel_1_6_5);
		
		JLabel lblNewLabel_2_9_5 = new JLabel("New label");
		lblNewLabel_2_9_5.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_5.setBounds(356, 28, 16, 16);
		panel_1_5.add(lblNewLabel_2_9_5);
		
		JPanel panel_1_2_3_1 = new JPanel();
		panel_1_2_3_1.setLayout(null);
		panel_1_2_3_1.setBackground(Color.BLACK);
		panel_1_2_3_1.setBounds(0, 327, 390, 72);
		Anaekran.add(panel_1_2_3_1);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("");
		lblNewLabel_3_2_3_1.setIcon(new ImageIcon("/Users/suha/Downloads/61D95E00-D653-429D-B936-CB9BCAC374F0.JPG"));
		lblNewLabel_3_2_3_1.setBounds(6, 6, 82, 77);
		panel_1_2_3_1.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_1_5_2_3_1 = new JLabel("Sky");
		lblNewLabel_1_5_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_2_3_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_5_2_3_1.setBounds(100, 23, 128, 21);
		panel_1_2_3_1.add(lblNewLabel_1_5_2_3_1);
		
		JLabel lblNewLabel_1_6_2_3_1 = new JLabel("Jun 14 - Jun 15");
		lblNewLabel_1_6_2_3_1.setForeground(new Color(255, 234, 0));
		lblNewLabel_1_6_2_3_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 10));
		lblNewLabel_1_6_2_3_1.setBounds(100, 46, 122, 16);
		panel_1_2_3_1.add(lblNewLabel_1_6_2_3_1);
		
		JLabel lblNewLabel_2_9_2_3_1 = new JLabel("");
		lblNewLabel_2_9_2_3_1.setIcon(new ImageIcon("/Users/suha/Downloads/heart-2.png"));
		lblNewLabel_2_9_2_3_1.setBounds(356, 28, 16, 16);
		panel_1_2_3_1.add(lblNewLabel_2_9_2_3_1);

		// Icon Labels (png)
		JLabel anaekranIcon = new JLabel(new ImageIcon("/Users/suha/Downloads/home-3.png"));
		anaekranIcon.setBounds(16, 42, 37, 32);
		addLabelAction(anaekranIcon, "anaekran");
		contentPane.add(anaekranIcon);

		JLabel comedyIcon = new JLabel(new ImageIcon("/Users/suha/Downloads/stand-up.png"));
		comedyIcon.setBounds(96, 42, 37, 32);
		addLabelAction(comedyIcon, "comedy");
		contentPane.add(comedyIcon);

		JLabel favoriIcon = new JLabel(new ImageIcon("/Users/suha/Downloads/heart.png"));
		favoriIcon.setBounds(181, 42, 37, 43);
		addLabelAction(favoriIcon, "favori");
		contentPane.add(favoriIcon);

		JLabel cultureIcon = new JLabel(new ImageIcon("/Users/suha/Downloads/inca-3.png"));
		cultureIcon.setBounds(265, 42, 37, 32);
		addLabelAction(cultureIcon, "culture");
		contentPane.add(cultureIcon);

		JLabel concertIcon = new JLabel(new ImageIcon("/Users/suha/Downloads/hand.png"));
		concertIcon.setBounds(344, 42, 37, 32);
		addLabelAction(concertIcon, "concert");
		contentPane.add(concertIcon);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(15, 86, 48, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Favorites");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(171, 86, 63, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Comedy");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(86, 86, 63, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cultural");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_3.setBounds(257, 86, 63, 16);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Concerts");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Hiragino Maru Gothic ProN", Font.ITALIC, 13));
		lblNewLabel_1_4.setBounds(332, 86, 63, 16);
		contentPane.add(lblNewLabel_1_4);
		
	 

		
	}


	private void addLabelAction(JLabel label, String panelName) {
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, panelName);
			}
		});
	}
}
