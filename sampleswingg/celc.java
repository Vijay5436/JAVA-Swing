package sampleswingg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class celc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celc window = new celc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public celc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(143, 62, 124, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDegree = new JLabel("Degrees");
		lblDegree.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDegree.setBounds(61, 67, 87, 22);
		frame.getContentPane().add(lblDegree);
		
		JLabel label = new JLabel("");
		label.setBounds(169, 136, 114, 14);
		frame.getContentPane().add(label);
		
		JButton btnCelcius = new JButton("To celsuis");
		btnCelcius.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				float number=Float.valueOf(a);
				float c=(number-32)*5/9;
				String b=String.valueOf(c);
				label.setText("Result="+b);
						}
		});
		btnCelcius.setBounds(42, 193, 89, 23);
		frame.getContentPane().add(btnCelcius);
		
		JButton btnToFahrenh = new JButton("To fahrenh");
		btnToFahrenh.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnToFahrenh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String a=textField.getText();
			float number=Float.valueOf(a);
			float c=(number-1*8f)+32;
			String b=String.valueOf(c);
			label.setText("Result="+b);
			}
		});
		btnToFahrenh.setBounds(277, 193, 89, 23);
		frame.getContentPane().add(btnToFahrenh);
		//label=textField.getText()*9/5+32;
	}

}
