import java.awt.EventQueue;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.JRadioButton;
public class Booking {

	private JFrame frame;
	private JTextField tf;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
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
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String n[]= {"select","1","2","3","4","5","6","7","8","9","10"};
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 250, 154));
		frame.setBounds(100, 100, 984, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                     TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(160, 25, 669, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(490, 117, 370, 336);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(31, 30, 46, 14);
		panel.add(lblName_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(31, 77, 46, 14);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(31, 131, 46, 14);
		panel.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(31, 179, 46, 14);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(31, 234, 46, 14);
		panel.add(lblTime);
		//textField_4.getText(textField);
		tf5 = new JTextField();
		tf5.setBounds(108, 27, 86, 20);
		panel.add(tf5);
		tf5.setColumns(10);
		
		
		tf6 = new JTextField();
		tf6.setBounds(108, 74, 86, 20);
		panel.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setBounds(108, 128, 86, 20);
		panel.add(tf7);
		tf7.setColumns(10);
		
		tf8 = new JTextField();
		tf8.setBounds(108, 176, 86, 20);
		panel.add(tf8);
		tf8.setColumns(10);
		
		tf9 = new JTextField();
		tf9.setBounds(108, 231, 86, 20);
		panel.add(tf9);
		tf9.setColumns(10);
		
		JLabel lblTicketno = new JLabel("TicketNo");
		lblTicketno.setBounds(200, 106, 46, 14);
		panel.add(lblTicketno);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(200, 154, 46, 14);
		panel.add(lblRoute);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(200, 206, 46, 14);
		panel.add(lblPrice);
		
		tf10 = new JTextField();
		tf10.setBounds(256, 103, 86, 20);
		panel.add(tf10);
		tf10.setColumns(10);
		
		tf11 = new JTextField();
		tf11.setBounds(256, 151, 86, 20);
		panel.add(tf11);
		tf11.setColumns(10);
		
		tf12 = new JTextField();
		tf12.setBounds(256, 203, 86, 20);
		panel.add(tf12);
		tf12.setColumns(10);
		String s[]= {"Choose","CaliCut","TVM","Munnar","Tuti","Otty","Bangalore","Mysore"};
		JComboBox ggh = new JComboBox(s);
		ggh.setBounds(27, 308, 124, 20);
		frame.getContentPane().add(ggh);
		String s1[]= {"Choose","CaliCut","TVM","Munnar","Tuti","Otty","Bangalore","Mysore"};
		JComboBox ggg = new JComboBox(s1);
		ggg.setBounds(169, 308, 117, 20);
		frame.getContentPane().add(ggg);
		JComboBox gg = new JComboBox(n);
		gg.setBounds(307, 308, 59, 20);
		frame.getContentPane().add(gg);
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow (new String[]
						{ tf.getText(),
					
							tf10.getText(),	tf6.getText(),tf7.getText(),(String)gg.getSelectedItem(),tf8.getText(),tf9.getText(),tf12.getText(),});
				
				
				
			
			}
			
		});
		btnNewButton.setBounds(147, 284, 99, 41);
		panel.add(btnNewButton);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(54, 126, 46, 14);
		frame.getContentPane().add(lblName);
		
		tf = new JTextField();
		tf.setBounds(126, 123, 206, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		ButtonGroup g1=new ButtonGroup();
		ButtonGroup g2=new ButtonGroup();
		
		
		
		
		
		JLabel lt = new JLabel("TAX");
		lt.setBounds(54, 355, 46, 14);
		frame.getContentPane().add(lt);
		
		tf2 = new JTextField();
		tf2.setBounds(177, 352, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setBounds(54, 399, 59, 14);
		frame.getContentPane().add(lblSubtotal);
		
		tf3 = new JTextField();
		tf3.setBounds(177, 396, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(54, 436, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		tf4 = new JTextField();
		tf4.setBounds(177, 433, 86, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf5.setText(tf.getText());
			
				float Tax=60;
			//	float Ac1=250;
				//float Ft1=200;
			//	float Sp1=175;
			//	float ss1=120;
				String st=tf.getText();
				
				{
				
				float tot=Tax*2+200;
				tf4.setText(String.valueOf(tot));
				tf2.setText(String.valueOf(Tax));
				tf3.setText(String.valueOf(Tax*2));
				tf11.setText(String.valueOf("Any"));
				tf12.setText(String.valueOf(tot));
				tf10.setText(String.valueOf("2121"+1));
				}
				DateFormat df = new SimpleDateFormat("dd/MM/yy");
				Date dateobj = new Date();
				tf8.setText(df.format (dateobj));
				DateFormat df1 = new SimpleDateFormat("HH.mm.ss");
				Date dateob = new Date();
				tf9.setText(df1.format (dateob));
				tf6.setText((String)ggh.getSelectedItem());
				tf7.setText((String)ggg.getSelectedItem());
			}
		});
		btnTotal.setBounds(313, 351, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf5.setText("");tf4.setText("");tf3.setText("");tf2.setText("");tf6.setText("");tf7.setText("");tf8.setText("");tf9.setText("");tf10.setText("");tf11.setText("");tf12.setText("");tf.setText("");
				
			}
		});
		btnReset.setBounds(313, 395, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(313, 432, 89, 23);
		frame.getContentPane().add(btnExit);
		
		table = new JTable();
		table.setBackground(new Color(245, 245, 220));
		table.setFont(new Font("Times New Roman", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"     Name", "  Booking No", "    From", "          To", "  No.of seat", "         Time", "         Date", "   AC/Non/Slp", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(54, 500, 806, 14);
		frame.getContentPane().add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(20, 485, 860, 55);
		frame.getContentPane().add(panel_1);
		
		JRadioButton st = new JRadioButton("Standard");
		st.setBounds(27, 189, 86, 23);
		frame.getContentPane().add(st);
		
		JRadioButton ac = new JRadioButton("Ac");
		ac.setBounds(126, 189, 59, 23);
		frame.getContentPane().add(ac);
		
		JRadioButton ft = new JRadioButton("First");
		ft.setBounds(199, 189, 86, 23);
		frame.getContentPane().add(ft);
		
		JRadioButton sp = new JRadioButton("Sleeper");
		sp.setBounds(293, 189, 109, 23);
		frame.getContentPane().add(sp);
		ButtonGroup gb=new ButtonGroup();
		gb.add (st);
		gb.add(ac);;
		gb.add(ft);
		gb.add(sp);
		
		
		
		
		JRadioButton ad = new JRadioButton("Adult");
		ad.setBounds(88, 248, 109, 23);
		frame.getContentPane().add(ad);
		
		JRadioButton ch = new JRadioButton("Child");
		ch.setBounds(233, 248, 109, 23);
		frame.getContentPane().add(ch);
        ButtonGroup gt =new ButtonGroup();
        gt.add(ch);
        gt.add(ad);

		
	}
}
