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

public class Comp extends JFrame {
	private static final long serialVersionUID = 10L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String answer,marks,sub;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public String Rans,Aans;
	private static final String[] Que= {
			"Which of these devices is used to point at things on the monitor?",
			"What does GB stand for in the world of computers?",
			"Which of these devices cannot be carried around?",
			"Which of these computer devices runs on a battery? ",
			"Which one of these is the smallest computer? ",
			"When was the first computer invented?",
			"What does the CPU in a computer stand for? ",
			"Which one of these components stores data in a computer? ",
			"What is the name of the device used to type letters and numbers on a document on the computer?",
			"What is the component that helps us hear the audio output from a computer? "
			
	};
	private static final String[] Aopt= {
			"Mouse",
			"General Business",
			"SmartPhone",
			"Tablet",
			"MainFrame",
			"1885",
			"Control Processing Unit",
			"Hard disk",
			"Random Access Memory",
			"USB"
	};
	private static final String[] Bopt= {
			"CPU",
			"Gigabyte",
			"Laptop",
			"Laptop",
			"Laptop",
			"1822",
			"Call Processing Unit",
			"Monitor",
			"Keyboard",
			"Monitor"
	};
	private static final String[] Copt= {
			"Keyboard",
			"None",
			"Desktop computer",
			"Tablet",
			"Table",
			"1998",
			"Central Processing Unit",
			"Keyboard",
			"Monitor",
			"Speakers"
	};
	private static final String[] ans= {
			"Mouse",
			"Gigabyte",
			"Desktop computer",
			"Both",
			"Tablet",
			"1822",
			"Central Processing Unit",
			"Hard disk",
			"Keyboard",
			"Speakers"
	};
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comp frame = new Comp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Comp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel ClblNewLabel = new JLabel("Computer Quiz");
		ClblNewLabel.setForeground(new Color(255, 255, 255));
		ClblNewLabel.setBounds(94, 11, 308, 52);
		ClblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel ClblNewLabel_1 = new JLabel("Score");
		ClblNewLabel_1.setForeground(new Color(255, 255, 255));
		ClblNewLabel_1.setBounds(221, 91, 77, 30);
		ClblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(322, 95, 63, 35);
		textField.setColumns(10);
		
		JLabel ClblNewLabel_2 = new JLabel("Question");
		ClblNewLabel_2.setForeground(new Color(255, 255, 255));
		ClblNewLabel_2.setBounds(33, 153, 124, 35);
		ClblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton CradioButton = new JRadioButton("No");
		buttonGroup.add(CradioButton);
		CradioButton.setBounds(79, 293, 323, 23);
		CradioButton.setBackground(new Color(240, 240, 240));
		CradioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton CradioButton_1 = new JRadioButton("yes");
		CradioButton_1.setToolTipText("");
		buttonGroup.add(CradioButton_1);
		CradioButton_1.setBounds(79, 340, 323, 23);
		CradioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		CradioButton_1.setBackground(SystemColor.menu);
		
		JRadioButton CradioButton_2 = new JRadioButton("MayBe");
		buttonGroup.add(CradioButton_2);
		CradioButton_2.setBounds(79, 389, 323, 23);
		CradioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		CradioButton_2.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(ClblNewLabel);
		contentPane.add(ClblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(ClblNewLabel_2);
		contentPane.add(CradioButton);
		contentPane.add(CradioButton_1);
		contentPane.add(CradioButton_2);
		
		JLabel ClblNewLabel_3 = new JLabel(" ");
		ClblNewLabel_3.setForeground(new Color(255, 255, 255));
		ClblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		ClblNewLabel_3.setBackground(new Color(240, 240, 240));
		ClblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		ClblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(ClblNewLabel_3);
		
		JLabel ClblNewLabel_2_1 = new JLabel("Answer");
		ClblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		ClblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		ClblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(ClblNewLabel_2_1);
		
		JLabel ClblNewLabel_4 = new JLabel(" ");
		ClblNewLabel_4.setForeground(new Color(255, 255, 255));
		ClblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(ClblNewLabel_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<=9)
				{
					String text = Que[i%Que.length];
					
					ClblNewLabel_3.setText(text);
					String text1 = Aopt[j%Aopt.length];
				
					CradioButton.setText(text1);
					String text2 = Bopt[k%Bopt.length];
					
					CradioButton_1.setText(text2);
					String text3 = Copt[l%Copt.length];
					
					CradioButton_2.setText(text3);
					Rans = ans[p%ans.length];
						String Aans=ClblNewLabel_4.getText();
						if(Aans==Rans)
						{
							score = score+10;
							i++;j++;k++;;l++;
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
					if(( CradioButton).isSelected())
					{
						String first = CradioButton.getText().toString();
						ClblNewLabel_4.setText(first);
					}
					else if(CradioButton_1.isSelected())
					{
						String sec = CradioButton_1.getText().toString();
						ClblNewLabel_4.setText(sec);
					}
					else
					{
						String third = CradioButton_2.getText().toString();
						ClblNewLabel_4.setText(third);
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
		sub = "Computer";
	}

}
