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
	private JLabel IconTauxLuminosite;
	private JLabel labelHumiditeAir;
	private JLabel labelHumiditeSol;
	private JLabel labelTemperatureAir;
	private JLabel IconBackground;
	private JButton btnAllumer;
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getIconTauxLuminosite() {
		return IconTauxLuminosite;
	}

	public JLabel getLabelHumiditeAir() {
		return labelHumiditeAir;
	}

	public JLabel getLabelHumiditeSol() {
		return labelHumiditeSol;
	}

	public JLabel getLabelTemperatureAir() {
		return labelTemperatureAir;
	}

	public JLabel getIconBackground() {
		return IconBackground;
	}

	public JButton getBtnAllumer() {
		return btnAllumer;
	}

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
		setBounds(100, 100, 538, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAllumer = new JButton("Allumer");
		btnAllumer.setBounds(5, 488, 89, 23);
		contentPane.add(btnAllumer);
		
		IconTauxLuminosite = new JLabel("");
		IconTauxLuminosite.setIcon(new ImageIcon("C:\\Users\\delto\\git\\plantagochi\\Plantagochi\\icon-moon.jpg"));
		IconTauxLuminosite.setBounds(26, 11, 50, 56);
		contentPane.add(IconTauxLuminosite);
		
		labelHumiditeAir = new JLabel("0 %");
		labelHumiditeAir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHumiditeAir.setBounds(420, 155, 73, 28);
		contentPane.add(labelHumiditeAir);
		
		labelHumiditeSol = new JLabel("0 %");
		labelHumiditeSol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHumiditeSol.setBounds(257, 441, 100, 28);
		contentPane.add(labelHumiditeSol);
		
		labelTemperatureAir = new JLabel("0 T\u00B0");
		labelTemperatureAir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTemperatureAir.setBounds(420, 116, 73, 28);
		contentPane.add(labelTemperatureAir);
		
		IconBackground = new JLabel("");
		IconBackground.setBounds(5, 0, 367, 522);
		IconBackground.setIcon(new ImageIcon("C:\\Users\\delto\\git\\plantagochi\\Plantagochi\\background-plante.png"));
		contentPane.add(IconBackground);
	}

}
