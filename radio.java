package swi;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class radio {
	String a;

	private JFrame frame;
	private JTextField tf;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio window = new radio();
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
	public radio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(143, 40, 153, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(61, 43, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(61, 209, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		JRadioButton rb = new JRadioButton("Celsuis");
		rb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rb.setForeground(Color.RED);
		rb.setBounds(18, 93, 89, 23);
		frame.getContentPane().add(rb);
		rb.addItemListener(new ItemListener()
				{
			public void itemStateChanged(ItemEvent e)
			{
				String a=tf.getText();
			}
				});
		
		
		JRadioButton rb1 = new JRadioButton("Fahrenheit");
		rb1.setForeground(new Color(0, 100, 0));
		rb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rb1.setBounds(18, 119, 89, 23);
		frame.getContentPane().add(rb1);
/*	rb1.addItemListener(new ItemListener()
		{
	public void itemStateChanged(ItemEvent e)
	{
		String a=tf.getText();
      tf1.setText(a);
	     }
		})*/
		
		JRadioButton rb2 = new JRadioButton("Kelvin");
		rb2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rb2.setForeground(Color.BLUE);
		rb2.setBounds(18, 145, 89, 23);
		frame.getContentPane().add(rb2);
		ButtonGroup g1=new ButtonGroup();
		g1.add(rb);
		g1.add(rb1);
		g1.add(rb2);
		/*rb2.addItemListener(new ItemListener()
		{
	public void itemStateChanged(ItemEvent e)
	{
		String a=tf.getText();
      tf1.setText(a);
	     }
		});*/
		
		JRadioButton rb11 = new JRadioButton("Celsuis");
		rb11.setForeground(Color.RED);
		rb11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rb11.setBounds(284, 93, 89, 23);
		frame.getContentPane().add(rb11);
		rb11.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
        
       String a=tf.getText();
       if(rb.isSelected())
       {
    	   tf1.setText(a);
       }
       if(rb1.isSelected()) {
    	   
       
       float number=Float.valueOf(a);
       double c=(number*1.8)+32;
       String b=String.valueOf(c);
       tf1.setText(b);
       }
       if(rb2.isSelected()) {
    	   float number=Float.valueOf(a);
           double c=(number+273.15);
           String b=String.valueOf(c);
           tf1.setText(b);
       }
	     }
		});
		JRadioButton rb12 = new JRadioButton("Fahrenheit");
		rb12.setForeground(new Color(0, 128, 0));
		rb12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rb12.setBounds(284, 119, 89, 23);
		frame.getContentPane().add(rb12);
		rb12.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		    
		       String a=tf.getText();
		       if(rb.isSelected())
		       {
		    	   float number=Float.valueOf(a);
			       double c=(number-32)*5/9;
			       String b=String.valueOf(c);
			       tf1.setText(b); 
		    	 
		       }
		       if(rb1.isSelected()) {
		    	   tf1.setText(a); 
		       
		      
		       }
		       if(rb2.isSelected()) {
		    	   float number=Float.valueOf(a);
		           double c=(number+459.67)*5/9;
		           String b=String.valueOf(c);
		           tf1.setText(b);
		       }		}
		});

		
		JRadioButton rb13 = new JRadioButton("Kelvin");
		rb13.setForeground(Color.BLUE);
		rb13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rb13.setBounds(284, 145, 89, 23);
		frame.getContentPane().add(rb13);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rb11);
		G1.add(rb13);
		G1.add(rb12);
		rb13.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			String a=tf.getText();
		       if(rb.isSelected())
		       {
		    	   float number=Float.valueOf(a);
			       double c=(number-273.15);
			       String b=String.valueOf(c);
			       tf1.setText(b); 
		    	 
		    	  
		    	 
		       }
		       if(rb1.isSelected()) {
		    	 
		    	   float number=Float.valueOf(a);
			       double c=(number*9/5)-459.67;
			       String b=String.valueOf(c);
			       tf1.setText(b);  
			       }
			       if(rb2.isSelected()) {
			    	   tf1.setText(a); 
			       
			      
			       }
      
	     }
		});

		JLabel lblInputscale = new JLabel("InputScale");
		lblInputscale.setBounds(18, 72, 89, 14);
		frame.getContentPane().add(lblInputscale);
		
		JLabel lblOutputscale = new JLabel("OutputScale");
		lblOutputscale.setBounds(284, 72, 89, 14);
		frame.getContentPane().add(lblOutputscale);
		
		JButton btnAc = new JButton("Ac");
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAc.setForeground(new Color(0, 0, 0));
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnAc.setBounds(370, 228, 54, 23);
		frame.getContentPane().add(btnAc);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf1.setText("");
				tf.setText("");
			}
		});
		btnNewButton.setBounds(369, 205, 55, 23);
		frame.getContentPane().add(btnNewButton);
		
		tf1 = new JTextField();
		tf1.setBounds(138, 206, 158, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblChekkuzz = new JLabel("chekkuzz..");
		lblChekkuzz.setForeground(new Color(220, 20, 60));
		lblChekkuzz.setFont(new Font("Shruti", Font.PLAIN, 12));
		lblChekkuzz.setBounds(0, 248, 46, 14);
		frame.getContentPane().add(lblChekkuzz);
	}
}
