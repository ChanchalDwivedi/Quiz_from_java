package Classes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class GK extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String answer,marks,sub;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public String Rans,Aans;
	private static final String[] Que= {
			"1. Which one of the following river flows between Vindhyan and Satpura ranges?",
			"2. The Central Rice Research Station is situated in?",
			"3. Who among the following wrote Sanskrit grammar?",
			"4. Which among the following headstreams meets the Ganges in last?",
			"5. The metal whose salts are sensitive to light is?",
			"6. Patanjali is well known for the compilation of –",
			"7. River Luni originates near Pushkar and drains into which one of the following?",
			"8. Which one of the following rivers originates in Brahmagiri range of Western Ghats?",
			"9. The country that has the highest in Barley Production?",
			"10. Tsunamis are not caused by"
			
	};
	private static final String[] Aopt= {
			"Narmada",
			"Bangalore",
			"Charak",
			"Pindar",
			"Copper",
			"Yoga Sutra",
			"Lake Sambhar",
			"Cauvery",
			"India",
			"Earthquakes"
	};
	private static final String[] Bopt= {
			"Mahanadi",
			"Chennai",
			"Panini",
			"Mandakini",
			"Silver",
			"Ayurveda",
			"Arabian Sea",
			"Pennar",
			"China",
			"Hurricanes"
	};
	private static final String[] Copt= {
			"Netravati",
			"Cuttack",
			"Kalidasa",
			"Bhagirathi",
			"Aluminum",
			"Panchatantra",
			"Rann of Kachchh",
			"Krishna",
			"Russia",
			"Undersea landslides"
	};
	private static final String[] ans= {
			"Narmada",
			"Cuttack",
			"Panini",
			"Bhagirathi",
			"Silver",
			"Yoga Sutra",
			"Rann of Kachchh",
			"Cauvery",
			"Russia",
			"Hurricanes"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GK frame = new GK();
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
	public GK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel GlblNewLabel = new JLabel("GK Quiz");
		GlblNewLabel.setForeground(new Color(255, 255, 255));
		GlblNewLabel.setBounds(112, 11, 264, 52);
		GlblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel GlblNewLabel_1 = new JLabel("Score");
		GlblNewLabel_1.setForeground(new Color(255, 255, 255));
		GlblNewLabel_1.setBounds(221, 91, 77, 30);
		GlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(313, 95, 63, 35);
		textField.setColumns(10);
		
		JLabel GlblNewLabel_2 = new JLabel("Question");
		GlblNewLabel_2.setForeground(new Color(255, 255, 255));
		GlblNewLabel_2.setBounds(33, 153, 124, 35);
		GlblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton GradioButton = new JRadioButton("No");
		buttonGroup.add(GradioButton);
		GradioButton.setBounds(79, 293, 272, 23);
		GradioButton.setBackground(new Color(240, 240, 240));
		GradioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton GradioButton_1 = new JRadioButton("Yes");
		buttonGroup.add(GradioButton_1);
		GradioButton_1.setBounds(79, 340, 272, 23);
		GradioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GradioButton_1.setBackground(SystemColor.menu);
		
		JRadioButton GradioButton_2 = new JRadioButton("MayBe");
		buttonGroup.add(GradioButton_2);
		GradioButton_2.setBounds(79, 389, 272, 23);
		GradioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GradioButton_2.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(GlblNewLabel);
		contentPane.add(GlblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(GlblNewLabel_2);
		contentPane.add(GradioButton);
		contentPane.add(GradioButton_1);
		contentPane.add(GradioButton_2);
		
		JLabel GlblNewLabel_3 = new JLabel(" ");
		GlblNewLabel_3.setForeground(new Color(255, 255, 255));
		GlblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		GlblNewLabel_3.setBackground(new Color(240, 240, 240));
		GlblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		GlblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(GlblNewLabel_3);
		
		JLabel GlblNewLabel_2_1 = new JLabel("Answer");
		GlblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		GlblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GlblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(GlblNewLabel_2_1);
		
		JLabel GlblNewLabel_4 = new JLabel(" ");
		GlblNewLabel_4.setForeground(new Color(255, 255, 255));
		GlblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(GlblNewLabel_4);
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "you scored "+marks);
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "");
					Statement st = con.createStatement();
					st.executeUpdate("INSERT INTO `score`(`Subject`, `Score`) VALUES ('"+sub+"','"+marks+"')");
				}

				catch (ClassNotFoundException e2) {
				System.out.println("driver not loaded");
					e2.printStackTrace();
				}
				catch (SQLException e1) {
					e1.printStackTrace();
					System.out.println("driver not loaded");
				}
				ScoreBoard SS =new ScoreBoard();
				SS.show();
				dispose();
			}
		});
		btnSubmit.setVisible(false);
		btnSubmit.setBounds(338, 487, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<=9)
				{
					String text = Que[i%Que.length];
					
					GlblNewLabel_3.setText(text);
					String text1 = Aopt[j%Aopt.length];
				
					GradioButton.setText(text1);
					String text2 = Bopt[k%Bopt.length];
					
					GradioButton_1.setText(text2);
					String text3 = Copt[l%Copt.length];
					
					GradioButton_2.setText(text2);
					Rans = ans[p%ans.length];
						String Aans=GlblNewLabel_4.getText();
						if(Aans==Rans)
						{
							score = score+10;
							i++;j++;k++;l++;
							p++;	
						}
				}
				else {
					btnSubmit.setVisible(true);
					btnNewButton.setVisible(false);
				}
				marks=Integer.toString(score);
				textField.setText(marks);
				
			}
		});
		Thread c = new Thread() {
			public void run() {
				while (true) {
					if(( GradioButton).isSelected())
					{
						String first = GradioButton.getText().toString();
						GlblNewLabel_4.setText(first);
					}
					else if(GradioButton_1.isSelected())
					{
						String sec = GradioButton_1.getText().toString();
						GlblNewLabel_4.setText(sec);
					}
					else
					{
						String third = GradioButton_2.getText().toString();
						GlblNewLabel_4.setText(third);
					}
					
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};
		c.setPriority(Thread.MIN_PRIORITY);
		c.start();

		
		btnNewButton.setBounds(338, 453, 89, 23);
		contentPane.add(btnNewButton);
		sub = "GK";
	}

}
