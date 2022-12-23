package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class Bio extends JFrame {
	private static final long serialVersionUID = 4L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Label lblNewLabel_3;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public JButton btnSubmit,btnNext;
	public String answer,marks,sub;
	public String Rans,Aans;
	private static final String[] Que= {
			"The chlorophyll in photosynthesis is used for",
			"Proteins after digestion are converted into",
			"Carbohydrates in the plants are stored in the form of",
			"Main site of photosynthesis",
			"The small pores present of leaf’s surface are called",
			"Photosynthesis is a",
			"Opening and closing of pores is a function performed by",
			"Which element is used in the synthesis of proteins?",
			"Temporary finger like extensions on amoeba are called",
			"Bile juice is secreted by"
			
	};
	private static final String[] Aopt= {
			"Absorbing light",
			"Carbohydrates",
			"Maltose",
			"Chloroplast",
			"Stomata",
			"Oxidation",
			"Guard cells",
			"Hydrogen",
			"Pseudopodia",
			"Stomach"
	};
	private static final String[] Bopt= {
			"Breaking down water molecule",
			"Amino acids",
			"Glucose",
			"Leaf",
			"Guard cells",
			"Reduction",
			"Stomata",
			"Oxygen",
			"Cell wall",
			"Liver"
	};
	private static final String[] Copt= {
			"Reduction of CO2",
			"Small globules",
			"Starch",
			"Stem",
			"Chlorophyll",
			"Both",
			"Chlorophyll",
			"Nitrogen",
			"Cell membrane",
			"Pancreas"
	};
	private static final String[] ans= {
			"Absorbing light",
			"Amino acids",
			"Starch",
			"Leaf",
			"Stomata",
			"Both",
			"Guard cells",
			"Nitrogen",
			"Pseudopodia",
			"Liver"
	};
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bio frame = new Bio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Bio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Biology Quiz");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(94, 11, 264, 52);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel lblNewLabel_1 = new JLabel("Score");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(221, 91, 77, 30);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(308, 90, 63, 35);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Question");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(33, 153, 124, 35);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		JLabel lblNewLabel_3 = new JLabel(" Lets Get Started");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Answer");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(lblNewLabel_4);

		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(79, 293, 323, 23);
		rdbtnNo.setBackground(new Color(240, 240, 240));
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(79, 340, 323, 23);
		rdbtnYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnYes.setBackground(SystemColor.menu);
		
		JRadioButton rdbtnMayBe = new JRadioButton("May be");
		buttonGroup.add(rdbtnMayBe);
		rdbtnMayBe.setBounds(79, 389, 323, 23);
		rdbtnMayBe.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnMayBe.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(lblNewLabel_2);
		contentPane.add(rdbtnNo);
		contentPane.add(rdbtnYes);
		contentPane.add(rdbtnMayBe);
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<=9)
				{
					String text = Que[i%Que.length];
					
					lblNewLabel_3.setText(text);
					String text1 = Aopt[j%Aopt.length];
				
					rdbtnNo.setText(text1);
					String text2 = Bopt[k%Bopt.length];
					
					rdbtnYes.setText(text2);
					String text3 = Copt[l%Copt.length];
					
					rdbtnMayBe.setText(text3);
					Rans = ans[p%ans.length];
						String Aans=lblNewLabel_4.getText();
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
					if(rdbtnNo.isSelected())
					{
						String first = rdbtnNo.getText().toString();
						lblNewLabel_4.setText(first);
					}
					else if(rdbtnYes.isSelected())
					{
						String sec = rdbtnYes.getText().toString();
						lblNewLabel_4.setText(sec);
					}
					else
					{
						String third = rdbtnMayBe.getText().toString();
						lblNewLabel_4.setText(third);
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
		sub = "Biology";
		
	}
}
