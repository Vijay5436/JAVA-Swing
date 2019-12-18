package swi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator {
	String sign="";
	int sum=0;
	int m=1;
	Double d=(double) 1;
	float a;
	float df;
	String str1,op,str2;

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setBackground(black);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setBounds(10, 25, 402, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCalculator = new JLabel("CALCULATOR");
		lblCalculator.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCalculator.setBounds(178, 0, 86, 14);
		frame.getContentPane().add(lblCalculator);
		//frame.add(btnNewButton);
		
		JButton b0 = new JButton("1");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText().concat(b0.getText()));
				
			}
		});
		b0.setBounds(10, 111, 46, 23);
		frame.getContentPane().add(b0);
		
		JButton b1 = new JButton("2");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(59, 111, 46, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("3");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(106, 111, 46, 23);
		frame.getContentPane().add(b2);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(10, 145, 46, 23);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(59, 145, 46, 23);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(106, 145, 46, 23);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(10, 179, 46, 23);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(59, 179, 46, 23);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(106, 179, 46, 23);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton(".");
		b10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(df==0)
				{
					
				
				textField.setText(textField.getText().concat(b10.getText()));
				df=1;
				}
			}
		});
		b10.setBounds(10, 213, 46, 23);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("0");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(b11.getText()));
			}
		});
		b11.setBounds(59, 213, 46, 23);
		frame.getContentPane().add(b11);
		
		JButton b12 = new JButton("=");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float st=Float.parseFloat(str1);
				float st1=Float.parseFloat(textField.getText());
				switch(op)
				{
				case "+":
					textField.setText(String.valueOf(st+st1));
					break;
				case "-":
					textField.setText(String.valueOf(st-st1));
					break;
				case "*":
					textField.setText(String.valueOf(st*st1));
					break;
				case "/":
					textField.setText(String.valueOf(st/st1));
					break;
				case "x^y":
					int k=Integer.parseInt(str1);
					System.out.print(k);
					int k1=Integer.parseInt(textField.getText());
					float jj=1;
					for(int i=1;i<=k1;i++)
					{
						jj=jj*k;
						
					}
					String str=String.valueOf(jj);
					textField.setText(str);
					
					
				
					
				}
			}
		});
		b12.setBounds(106, 213, 46, 23);
		frame.getContentPane().add(b12);
		
		JButton b13 = new JButton("+");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			str1=textField.getText();
			textField.setText("");
			op=b13.getText();
						
				
			    
	              
			}
		});
		b13.setBounds(162, 179, 46, 66);
		frame.getContentPane().add(b13);
		
		JButton b14 = new JButton("-");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				textField.setText("");
				op=b14.getText();
							
			}
		});
		b14.setBounds(227, 179, 55, 23);
		frame.getContentPane().add(b14);
		
		JButton b15 = new JButton("*");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				textField.setText("");
				op=b15.getText();
			}
		});
		b15.setBounds(162, 145, 55, 23);
		frame.getContentPane().add(b15);
		
		JButton b16 = new JButton("/");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				textField.setText("");
				op=b16.getText();
			}
		});
		b16.setBounds(162, 111, 55, 23);
		frame.getContentPane().add(b16);
		
		JButton b17 = new JButton("Sin");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.sin(radian);
				textField.setText(String.valueOf(d));
			}
		});
		b17.setBounds(227, 145, 55, 23);
		frame.getContentPane().add(b17);
		
		JButton bt = new JButton("Cos");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.cos(radian);
				textField.setText(String.valueOf(d));
				
			}
		});
		bt.setBounds(293, 111, 66, 23);
		frame.getContentPane().add(bt);
		
		JButton bt0 = new JButton("Tan");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.tan(radian);
				textField.setText(String.valueOf(d));
			}
		});
		bt0.setBounds(368, 213, 56, 23);
		frame.getContentPane().add(bt0);
		
		JButton bt1 = new JButton("Sec");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.cos(radian);
				textField.setText(String.valueOf(d/1));
			}
		});
		bt1.setBounds(293, 145, 66, 23);
		frame.getContentPane().add(bt1);
		
		JButton bt3 = new JButton("x^y");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				textField.setText("");
				op=bt3.getText();
				m=1;
				
				
				
				
				
			}
		});
		bt3.setBounds(293, 179, 65, 23);
		frame.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("Sqrt");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.sqrt(radian);
				textField.setText(String.valueOf(d));
			}
		});
		bt4.setBounds(216, 205, 66, 38);
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("x^2");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				double j=a*a;
				textField.setText(String.valueOf(j));
			}
		});
		bt5.setBounds(293, 213, 66, 23);
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("Exp");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.exp(radian);
				textField.setText(String.valueOf(d));
			}
		});
		bt6.setBounds(368, 111, 56, 23);
		frame.getContentPane().add(bt6);
		
		JButton bt7 = new JButton("n!");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(textField.getText());
				int ff=1;
				for(int i=1;i<=n;i++)
				{
					ff=ff*i;
					m=1;
				}
				String strr=String.valueOf(ff);
				textField.setText(strr);
				
			}
		});
		bt7.setBounds(369, 145, 55, 23);
		frame.getContentPane().add(bt7);
		
		JButton bt8 = new JButton("In");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Float.parseFloat(textField.getText());
				Double radian=(Double)Math.toRadians(a);
				d=Math.log(radian);
				textField.setText(String.valueOf(d));
			}
		});
		bt8.setBounds(368, 179, 56, 23);
		frame.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("1/x");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				double f=1/a;
				
				textField.setText(String.valueOf(f));
			}
		});
		bt9.setBounds(227, 111, 56, 23);
		frame.getContentPane().add(bt9);
		
		JButton c1 = new JButton("C");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		c1.setBounds(240, 64, 119, 40);
		frame.getContentPane().add(c1);
		
		JLabel lblChekkuzzz = new JLabel("chekkuzzz");
		lblChekkuzzz.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblChekkuzzz.setForeground(Color.DARK_GRAY);
		lblChekkuzzz.setBounds(378, 247, 56, 14);
		frame.getContentPane().add(lblChekkuzzz);
		
		JButton btnNewButton = new JButton("Ac");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(368, 68, 56, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(50, 103, 46, 14);
		frame.getContentPane().add(label);
	}

}
