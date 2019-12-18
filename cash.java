package swi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;

public class cash {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cash window = new cash();
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
	public cash() {
		initialize();
		String str1,str2,s;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(205, 133, 63));
		frame.setBackground(new Color(205, 133, 63));
		frame.setForeground(new Color(173, 255, 47));
		frame.getContentPane().setForeground(new Color(173, 255, 47));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String []b= {"India","U.S","Europa","Singapur","Aus"};
		String []a= {"India","U.S","Europa","Singapur","Aus"};
		
		JLabel lblCashConvetor = new JLabel("CASH CONVETOR");
		lblCashConvetor.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 14));
		lblCashConvetor.setForeground(new Color(0, 0, 128));
		lblCashConvetor.setBackground(new Color(205, 133, 63));
		lblCashConvetor.setBounds(165, 0, 162, 28);
		frame.getContentPane().add(lblCashConvetor);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 434, 28);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBounds(0, 31, 434, 231);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(155, 8, 34, 17);
		panel_1.add(lblInput);
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInput.setForeground(new Color(128, 0, 128));
		lblInput.setBackground(new Color(205, 133, 63));
		JComboBox cb = new JComboBox(b);
		cb.setBounds(194, 5, 85, 23);
		panel_1.add(cb);
		cb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cb.setForeground(Color.BLUE);
		cb.setBackground(new Color(205, 133, 63));
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tf1.setBounds(193, 49, 86, 20);
		panel_1.add(tf1);
		tf1.setBackground(new Color(205, 133, 63));
		tf1.setColumns(10);
		
		
		
		
		
		
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(139, 51, 64, 14);
		panel_1.add(lblAmount);
		lblAmount.setForeground(new Color(139, 0, 0));
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAmount.setBackground(new Color(205, 133, 63));
		JComboBox cb1 = new JComboBox(a);
		cb1.setBounds(194, 97, 85, 20);
		panel_1.add(cb1);
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cb1.setForeground(Color.BLUE);
		cb1.setBackground(new Color(205, 133, 63));
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(143, 100, 46, 14);
		panel_1.add(lblOutput);
		lblOutput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOutput.setForeground(new Color(128, 0, 0));
		lblOutput.setBackground(new Color(205, 133, 63));
		
		JButton bt1 = new JButton("Clear");
		bt1.setBounds(260, 167, 89, 23);
		panel_1.add(bt1);
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt1.setForeground(new Color(128, 0, 0));
		bt1.setBackground(new Color(205, 133, 63));
		
				
				tf = new JTextField();
				tf.setBounds(110, 169, 140, 20);
				panel_1.add(tf);
				tf.setBackground(new Color(205, 133, 63));
				tf.setColumns(10);
				
				JButton bt = new JButton("Convert");
				bt.setBounds(21, 168, 79, 23);
				panel_1.add(bt);
				bt.setForeground(new Color(128, 0, 0));
				bt.setFont(new Font("Times New Roman", Font.BOLD, 12));
				bt.setBackground(new Color(205, 133, 63));
				
				
				JButton btnClose = new JButton("Close");
				btnClose.setBackground(new Color(233, 150, 122));
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				btnClose.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnClose.setForeground(new Color(128, 0, 0));
				btnClose.setBounds(359, 168, 64, 23);
				panel_1.add(btnClose);
				
				JLabel label = new JLabel("");
				label.setBounds(87, 206, 315, 14);
				panel_1.add(label);
				bt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String	str1=(String)cb.getSelectedItem();
					String	str2=(String)cb1.getSelectedItem();
					String	s=tf.getText();
						
					if(str1.equals("India")&&(str2.equals("India")))
					{
					
						tf.setText(s);
					}
					if(str1.equals("U.S")&&(str2.equals("India")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=71.76;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("India")&&(str2.equals("U.S")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=71.76;
				  tf.setText(String.valueOf(a/d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("U.S")&&(str2.equals("U.S")))
					{
					
						tf.setText(s);
					}
					if(str1.equals("Europa")&&(str2.equals("Europa")))
					{
					
						tf.setText(s);
					}
						
					if(str1.equals("Europa")&&(str2.equals("India")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=79.55;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
						}
					if(str1.equals("India")&&(str2.equals("Europa")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=79.55;
				  tf.setText(String.valueOf(a/d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Singapur")&&(str2.equals("India")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=54.70;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("India")&&(str2.equals("Singapur")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=54.70;
				  tf.setText(String.valueOf(a/d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Aus")&&(str2.equals("India")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=48.85;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("India")&&(str2.equals("Aus")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=48.85;
				  tf.setText(String.valueOf(a/d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Aus")&&(str2.equals("U.S")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=0.67;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Aus")&&(str2.equals("Singapur")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=0.92;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Aus")&&(str2.equals("Europa")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=0.61;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Singapur")&&(str2.equals("Europa")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=0.66;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Singapur")&&(str2.equals("U.S")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=0.73;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Singapur")&&(str2.equals("Aus")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.07;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Europa")&&(str2.equals("Aus")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.62;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Europa")&&(str2.equals("Singapur")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.50;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("Europa")&&(str2.equals("U.S")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.10;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("U.S")&&(str2.equals("Aus")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.47;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("U.S")&&(str2.equals("Singapur")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=1.39;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					if(str1.equals("U.S")&&(str2.equals("Europa")))
					{
						
				  float a=Float.parseFloat(tf1.getText());
				  double d=.90;
				  tf.setText(String.valueOf(a*d));
				  label.setText("..........Be Happy to Smile......!");
				  
						}
					
					
					
					}
				});
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				tf1.setText("");
				label.setText("");
				
			}
		});
	}
}
