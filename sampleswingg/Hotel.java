package sampleswingg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

public class Hotel {
	String str1,str2,op;
	float df=1;
	int chc=100;
	int cbc=60;
	int Tax=30;
	int ch=50;
	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField tf;
	private JTextField tdd;
	//private JTextField textField_6;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(238, 130, 238));
		frame.setBounds(100, 100, 1116, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("        HOTEL MANAGEMENT SYSTEMS");
		lblHotelManagementSystem.setBounds(129, 11, 768, 73);
		lblHotelManagementSystem.setFont(new Font("Wide Latin", Font.BOLD, 22));
		lblHotelManagementSystem.setForeground(new Color(0, 0, 128));
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(498, 95, 194, 237);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		String h[]= {"India","Srilanga","U.S"};
		JComboBox comboBox = new JComboBox(h);
		comboBox.setBounds(40, 67, 107, 20);
		panel_1.add(comboBox);
		JButton btn = new JButton("CONVERT");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=(String)comboBox.getSelectedItem();
				tf.getText();
				
				if(str1.equals("U.S"))
				{
					
			  float a=Float.parseFloat(tf.getText());
			  double d=71.76;
			  tf.setText(String.valueOf(a/d));
		
			  
					}
				
				
						
			}
		});
		btn.setForeground(Color.BLUE);
		btn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn.setBounds(10, 162, 116, 23);
		panel_1.add(btn);
		tf = new JTextField();
		tf.setBounds(30, 109, 135, 23);
		panel_1.add(tf);
		tf.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
			}
		});
		btnC.setForeground(Color.BLUE);
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnC.setBounds(133, 162, 51, 23);
		panel_1.add(btnC);
		
		
		JLabel lblCurrencyConvertor = new JLabel("  CURRENCY CONVERTOR");
		lblCurrencyConvertor.setForeground(Color.BLUE);
		lblCurrencyConvertor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCurrencyConvertor.setBounds(10, 11, 174, 33);
		panel_1.add(lblCurrencyConvertor);
		
		JButton b16 = new JButton("/");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=b16.getText();
			}
		});
		
		JButton b14 = new JButton("-");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=b14.getText();
							
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(81, 343, 413, 125);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Cost of Drink");
		lblCostOfDrink.setForeground(Color.BLUE);
		lblCostOfDrink.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCostOfDrink.setBounds(47, 24, 78, 23);
		panel_3.add(lblCostOfDrink);
		
		textField_4 = new JTextField();
		textField_4.setBounds(181, 25, 86, 23);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(181, 58, 86, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(181, 89, 86, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setForeground(Color.BLUE);
		lblCostOfMeal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCostOfMeal.setBounds(47, 61, 78, 14);
		panel_3.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCostOfDelivery.setForeground(Color.BLUE);
		lblCostOfDelivery.setBounds(47, 95, 100, 14);
		panel_3.add(lblCostOfDelivery);
		
		textField_6 = new JTextField();
		textField_6.setBounds(181, 89, 86, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(498, 343, 194, 125);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(Color.BLUE);
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTax.setBounds(10, 11, 46, 14);
		panel_4.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSubtotal.setForeground(Color.BLUE);
		lblSubtotal.setBounds(10, 54, 76, 14);
		panel_4.add(lblSubtotal);
		
		textField_7 = new JTextField();
		textField_7.setBounds(98, 8, 86, 20);
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(98, 54, 86, 20);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(98, 94, 86, 20);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.BLUE);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotal.setBounds(10, 97, 46, 14);
		panel_4.add(lblTotal);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(70, 479, 978, 55);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(81, 95, 413, 237);
		frame.getContentPane().add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setLayout(null);
		
		String []d= {"choose","Tea","Coffee","Juice","cock"};
		JComboBox cbb = new JComboBox(d);
		cbb.setBounds(89, 158, 97, 20);
		panel.add(cbb);
		
		JButton bt = new JButton("TOTAL");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String str2=textField_1.getText();
				
				int chi=Integer.valueOf(str2);
				textField_9.setText(String.valueOf(chi*ch));
				
				
                String str=textField_1.getText();
				
				int chm=Integer.valueOf(str);
				textField_9.setText(String.valueOf(chm*chc));
				

                String str3=textField_1.getText();
				
				int chbc=Integer.valueOf(str);
				textField_9.setText(String.valueOf(chbc*cbc));
				String str1=(String)cbb.getSelectedItem();
				
				
				textField_7.setText(String.valueOf(Tax));
				
		
				if(str1.equals("Tea"))
				{
					int t=10;
					textField_4.setText(String.valueOf(t));
					textField_6.setText(String.valueOf(25));
					textField_9.setText(String.valueOf(ch+chc+cbc+Tax+t+25));
					tf.setText(String.valueOf(ch+chc+cbc+Tax+t+25));
					textField_5.setText(String.valueOf(ch+chc+cbc+t+25));
					textField_8.setText(String.valueOf(ch+chc+cbc+t+25));
				}
				if(str1.equals("Coffee"))
				{
					int c=20;
					textField_4.setText(String.valueOf(c));
					textField_6.setText(String.valueOf(25));
					textField_9.setText(String.valueOf(ch+chc+cbc+Tax+c+25));
					tf.setText(String.valueOf(ch+chc+cbc+Tax+c+25));
					textField_5.setText(String.valueOf(ch+chc+cbc+c+25));
					textField_8.setText(String.valueOf(ch+chc+cbc+c+25));
				}
				if(str1.equals("Juice"))
				{
					int j=45;
					textField_4.setText(String.valueOf(j));
					textField_6.setText(String.valueOf(25));
					textField_9.setText(String.valueOf(ch+chc+cbc+Tax+j+25));
					tf.setText(String.valueOf(ch+chc+cbc+Tax+j+25));
					textField_5.setText(String.valueOf(ch+chc+cbc+j+25));
				}
				if(str1.equals("cock"))
				{
					int cc=35;
					textField_4.setText(String.valueOf(cc));
					textField_6.setText(String.valueOf(25));
					textField_9.setText(String.valueOf(ch+chc+cbc+Tax+cc));
					tf.setText(String.valueOf(ch+chc+cbc+Tax+cc+25));
					textField_5.setText(String.valueOf(ch+chc+cbc+cc+25));
					
				}
			}
		});
		
		bt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt.setForeground(Color.BLUE);
		bt.setBounds(70, 21, 126, 23);
		panel_5.add(bt);
		
		
		
		
		JButton bt2 = new JButton("RESET");
		bt2.setForeground(Color.BLUE);
		bt2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				cbb.setSelectedItem(null);
				
			}
		});
		bt2.setBounds(505, 21, 126, 23);
		panel_5.add(bt2);
		
		JButton bt3 = new JButton("EXIT");
		bt3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt3.setForeground(Color.BLUE);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		bt3.setBounds(721, 21, 118, 23);
		panel_5.add(bt3);
		
		
		JLabel lblChickenBargur = new JLabel("Chicken Bargur");
		lblChickenBargur.setForeground(Color.BLUE);
		lblChickenBargur.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblChickenBargur.setBounds(36, 26, 97, 26);
		panel.add(lblChickenBargur);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(160, 27, 132, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblChickenBargurMeal = new JLabel("Chicken Bargur Meal");
		lblChickenBargurMeal.setForeground(Color.BLUE);
		lblChickenBargurMeal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblChickenBargurMeal.setBounds(10, 71, 132, 26);
		panel.add(lblChickenBargurMeal);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(161, 72, 132, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCheeseBargur = new JLabel("Cheese Bargur");
		lblCheeseBargur.setForeground(Color.BLUE);
		lblCheeseBargur.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCheeseBargur.setBounds(32, 115, 110, 26);
		panel.add(lblCheeseBargur);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(160, 118, 132, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setForeground(Color.BLUE);
		lblDrink.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDrink.setBounds(43, 162, 46, 14);
		panel.add(lblDrink);
	
		JLabel lblQuality = new JLabel("Quality");
		lblQuality.setForeground(Color.BLUE);
		lblQuality.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblQuality.setBounds(212, 160, 46, 14);
		panel.add(lblQuality);
		String []s= {"1","2"};
		JComboBox comboBox_2 = new JComboBox(s);
		comboBox_2.setBounds(268, 157, 85, 20);
		panel.add(comboBox_2);
		
		JRadioButton rdbtnHomeDelivary = new JRadioButton("Home Delivery");
		rdbtnHomeDelivary.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnHomeDelivary.setForeground(Color.BLUE);
		rdbtnHomeDelivary.setBounds(60, 207, 109, 23);
		panel.add(rdbtnHomeDelivary);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnTax.setForeground(Color.BLUE);
		rdbtnTax.setBounds(232, 207, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(731, 95, 333, 365);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane Calculator = new JTabbedPane(JTabbedPane.TOP);
		Calculator.setBounds(10, 11, 313, 343);
		panel_2.add(Calculator);
		
		JLayeredPane layeredPane = new JLayeredPane();
		Calculator.addTab("Calculator", null, layeredPane, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 308, 315);
		layeredPane.add(panel_6);
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Calculator/Receipt", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		
		JButton bb = new JButton("+");
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=bb.getText();
							
			}
		});
		bb.setBounds(199, 224, 46, 66);
		panel_6.add(bb);
		
		JButton b11 = new JButton("=");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float st=Float.parseFloat(str1);
				float st1=Float.parseFloat(tdd.getText());
				switch(op)
				{
				case "+":
					tdd.setText(String.valueOf(st+st1));
					break;
				case "-":
					tdd.setText(String.valueOf(st-st1));
					break;
				case "*":
					tdd.setText(String.valueOf(st*st1));
					break;
				case "/":
					tdd.setText(String.valueOf(st/st1));
					break;
				case "x^y":
					int k=Integer.parseInt(str1);
					System.out.print(k);
					int k1=Integer.parseInt(tdd.getText());
					float jj=1;
					for(int i=1;i<=k1;i++)
					{
						jj=jj*k;
						
					}
					String str=String.valueOf(jj);
					tdd.setText(str);
					
					
				
					
				}
			}
		});
		b11.setBounds(143, 267, 46, 23);
		panel_6.add(b11);
		
		JButton b10 = new JButton("0");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b10.getText()));
			}
		});
		b10.setBounds(93, 267, 46, 23);
		panel_6.add(b10);
		
		JButton b0 = new JButton(".");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(df==0)
				{
					
				
				tdd.setText(tdd.getText().concat(b10.getText()));
				df=1;
				}
			}
		});
		b0.setBounds(37, 267, 46, 23);
		panel_6.add(b0);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(143, 233, 46, 23);
		panel_6.add(b9);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(93, 233, 46, 23);
		panel_6.add(b8);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(37, 233, 46, 23);
		panel_6.add(b7);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(143, 198, 46, 23);
		panel_6.add(b6);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(93, 198, 46, 23);
		panel_6.add(b5);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(37, 198, 46, 23);
		panel_6.add(b4);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(143, 164, 46, 23);
		panel_6.add(b3);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText(tdd.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(93, 164, 46, 23);
		panel_6.add(b2);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tdd.setText(tdd.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(37, 164, 46, 23);
		panel_6.add(b1);
		
		JButton bm = new JButton("*");
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=bm.getText();
			}
		});
		bm.setBounds(199, 164, 46, 23);
		panel_6.add(bm);
		
		JButton bs = new JButton("-");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=bs.getText();
							
			}
		});
		bs.setBounds(199, 198, 46, 23);
		panel_6.add(bs);
		
		JButton bd = new JButton("/");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tdd.getText();
				tdd.setText("");
				op=bd.getText();
			}
		});
		bd.setBounds(199, 130, 46, 23);
		panel_6.add(bd);
		
		JButton bc = new JButton("C");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tdd.setText("");
			}
		});
		bc.setBounds(37, 130, 89, 23);
		panel_6.add(bc);
		
		tdd = new JTextField();
		tdd.setColumns(10);
		tdd.setBounds(47, 23, 180, 58);
		panel_6.add(tdd);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		Calculator.addTab("Receipt", null, layeredPane_1, null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe Script", Font.BOLD, 16));
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setBackground(new Color(0, 255, 0));
		textArea.setBounds(0, 0, 308, 315);
		layeredPane_1.add(textArea);
		JButton bt1 = new JButton("RECEIPT");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Custamer Id:-001\n"+"Bill Amount:-"+textField_9.getText()+"\n items:-"+textField_1.getText()+"\nTax:-"+textField_7.getText()+"\nDrinkItem:-"+(String)cbb.getSelectedItem()+"\nIndianCash:-"+textField_9.getText()+"\nU.SCash:-"+tf.getText()+"\n\n"+" ,,,,,,Thanking You,,,,,,"
						+ "");
			}
		});
		bt1.setForeground(Color.BLUE);
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt1.setBounds(289, 21, 126, 23);
		panel_5.add(bt1);
		
	}
}
