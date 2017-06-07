package fr.exia.Plantagochi.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setTitle("Plantagochi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAllumer = new JButton("Allumer");
		btnAllumer.setBounds(5, 488, 71, 23);
		contentPane.add(btnAllumer);
		
		JLabel labelTauxLuminosite = new JLabel("");
		labelTauxLuminosite.setIcon(new ImageIcon("C:\\Users\\delto\\git\\plantagochi\\Plantagochi\\icon-moon.jpg"));
		labelTauxLuminosite.setBounds(26, 11, 50, 56);
		contentPane.add(labelTauxLuminosite);
		
		JLabel labelHumiditeAir = new JLabel("0 %");
		labelHumiditeAir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHumiditeAir.setBounds(420, 155, 48, 28);
		contentPane.add(labelHumiditeAir);
		
		JLabel labelHumiditeSol = new JLabel("0 %");
		labelHumiditeSol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHumiditeSol.setBounds(257, 441, 48, 28);
		contentPane.add(labelHumiditeSol);
		
		JLabel labelTemperatureAir = new JLabel("0 T\u00B0");
		labelTemperatureAir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTemperatureAir.setBounds(420, 116, 48, 28);
		contentPane.add(labelTemperatureAir);
		
		JLabel IconBackground = new JLabel("");
		IconBackground.setBounds(5, 0, 367, 522);
		IconBackground.setIcon(new ImageIcon("C:\\Users\\delto\\git\\plantagochi\\Plantagochi\\background-plante.png"));
		contentPane.add(IconBackground);
	}
}
