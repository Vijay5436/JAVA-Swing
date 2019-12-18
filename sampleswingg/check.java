package sampleswingg;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class check {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					check window = new check();
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
	public check() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GREEN);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		label.setBounds(153, 177, 114, 14);
		frame.getContentPane().add(label);
		
		JCheckBox ck = new JCheckBox("     C++");
		ck.setForeground(Color.RED);
		ck.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ck.setBounds(136, 60, 97, 23);
		frame.getContentPane().add(ck);
		ck.addItemListener(new ItemListener()
		{
		public void itemStateChanged(ItemEvent e)
		{
		label.setText("C++"+(e.getStateChange()==1?" -checked":" -unchecked"));
			
		}
		
		});
		
		
		JCheckBox ck1 = new JCheckBox("    JAVA");
		ck1.setForeground(Color.RED);
		ck1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ck1.setBounds(136, 110, 97, 23);
		frame.getContentPane().add(ck1);
		
		
		
		ck1.addItemListener(new ItemListener()
		{
		public void itemStateChanged(ItemEvent e)
		{
			label.setText("");
		label.setText("JAVA"+(e.getStateChange()==1?" -checked":"-unchecked"));
			
		}
		
		});
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
