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

public class Maths extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String answer,marks,sub;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public String Rans,Aans;
	private static final String[] Que= {
			"1.what comes after 328 ?",
			" 2. what comes after 118 ?",
			"3.what comes before 550 ?",
			"4.what comes before 336 ?",
			"5.what comes between 452 and 454 ?",
			"6.what comes between 631 and 633 ?",
			"7.What is the sum of 8 and 17 ?",
			"8. 5 + 15 =  ?",
			"9. 18 - 5 = ?",
			"10. 32 - 2 = ?"
			
	};
	private static final String[] Aopt= {
			"330",
			"119",
			"559",
			"335",
			"453",
			"632",
			"22",
			"20",
			"23",
			"34"
	};
	private static final String[] Bopt= {
			"329",
			"220",
			"549",
			"325",
			"451",
			"666",
			"25",
			"27",
			"13",
			"30"
	};
	private static final String[] Copt= {
			"370",
			"117",
			"720",
			"345",
			"453",
			"636",
			"23",
			"15",
			"14",
			"29"
	};
	private static final String[] ans= {
			"329",
			"119",
			"549",
			"335",
			"453",
			"632",
			"25",
			"20",
			"13",
			"30"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maths frame = new Maths();
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
	public Maths() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JLabel MlblNewLabel = new JLabel("Maths Quiz");
		MlblNewLabel.setForeground(new Color(255, 255, 255));
		MlblNewLabel.setBounds(94, 11, 264, 52);
		MlblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel MlblNewLabel_1 = new JLabel("Score");
		MlblNewLabel_1.setForeground(new Color(255, 255, 255));
		MlblNewLabel_1.setBounds(221, 91, 77, 30);
		MlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(308, 90, 63, 35);
		textField.setColumns(10);
		
		JLabel MlblNewLabel_2 = new JLabel("Question");
		MlblNewLabel_2.setForeground(new Color(255, 255, 255));
		MlblNewLabel_2.setBounds(33, 153, 124, 35);
		MlblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton MradioButton = new JRadioButton("No");
		buttonGroup.add(MradioButton);
		MradioButton.setBounds(79, 293, 272, 23);
		MradioButton.setBackground(new Color(240, 240, 240));
		MradioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton MradioButton_1 = new JRadioButton("Yes");
		buttonGroup.add(MradioButton_1);
		MradioButton_1.setBounds(79, 340, 272, 23);
		MradioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		MradioButton_1.setBackground(SystemColor.menu);
		
		JRadioButton MradioButton_2 = new JRadioButton("MayBe");
		buttonGroup.add(MradioButton_2);
		MradioButton_2.setBounds(79, 389, 272, 23);
		MradioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		MradioButton_2.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(MlblNewLabel);
		contentPane.add(MlblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(MlblNewLabel_2);
		contentPane.add(MradioButton);
		contentPane.add(MradioButton_1);
		contentPane.add(MradioButton_2);
		
		JLabel MlblNewLabel_3 = new JLabel(" ");
		MlblNewLabel_3.setForeground(new Color(255, 255, 255));
		MlblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		MlblNewLabel_3.setBackground(new Color(240, 240, 240));
		MlblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		MlblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(MlblNewLabel_3);
		
		JLabel MlblNewLabel_2_1 = new JLabel("Answer");
		MlblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		MlblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		MlblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(MlblNewLabel_2_1);
		
		JLabel MlblNewLabel_4 = new JLabel(" ");
		MlblNewLabel_4.setForeground(new Color(255, 255, 255));
		MlblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(MlblNewLabel_4);
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
					MlblNewLabel_3.setText(text);
					
					String text1 = Aopt[j%Aopt.length];
					MradioButton.setText(text1);
					
					String text2 = Bopt[k%Bopt.length];
					MradioButton_1.setText(text2);
					
					String text3 = Copt[l%Copt.length];
					MradioButton_2.setText(text3);
					Rans = ans[p%ans.length];
						String Aans=MlblNewLabel_4.getText();
						if(Aans==Rans)
						{
							score = score+10;
							i++;j++;k++;l++;
							p++;
						}
						if(Aans!=Rans)
						{
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
					if(( MradioButton).isSelected())
					{
						String first = MradioButton.getText().toString();
						MlblNewLabel_4.setText(first);
					}
					else if(MradioButton_1.isSelected())
					{
						String sec = MradioButton_1.getText().toString();
						MlblNewLabel_4.setText(sec);
					}
					else
					{
						String third = MradioButton_2.getText().toString();
						MlblNewLabel_4.setText(third);
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
		sub = "Maths";
	}

}
