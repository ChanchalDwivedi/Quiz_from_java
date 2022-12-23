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

public class Phy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String answer,marks,sub;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public String Rans,Aans;
	private static final String[] Que= {
			"Two wires of the same material and length are stretched by the same force. Their masses are in the ratio 3:2, their elongations are in the ratio:",
			"A bullet fired into a fixed target loses half of its velocity after penetrating 3 cm. How much further it will penetrate before coming to rest, assuming that it faces constant resistance to motion?",
			"An iron ball is weighed in air and then in water by a spring balance:",
			"Which one of the following is not the advantage of semiconductor device in the electron tubes?",
			"A virtual image larger than the object can be obtained by:",
			"If the distance between the two particles is increased by 2%, then the force of attraction between them will:",
			"Which of the following substances has the highest value of the Youngs modulus?",
			"Ray optics fails when the size of the obstacle is:",
			"A lorry and a car, moving with the same KE are brought to rest by applying the same retarding force then:",
			"For a particle moving along a circular path with a constant speed, the acceleration is constant in:"
	};
	private static final String[] Aopt= {
			"2:3",
			"1.0cm",
			"its weight is zero in water",
			"Low consumption of power for cathode heating",
			"concave mirror",
			"decrease by 4%",
			"Steel",
			"5 cm",
			"both will come to rest in the same distance",
			"both magnitude and direction"
	};
	private static final String[] Bopt= {
			"2:4",
			"3.0cm",
			"its weight in air is more than in water",
			"No warming up time for switching",
			"plane mirror",
			"increase by 4%",
			"Aluminium",
			"less than the wavelength of light",
			"car will come to rest in a shorter distance",
			"magnitude"
	};
	private static final String[] Copt= {
			"none",
			"2.0cm",
			"its weight in water is more than in air",
			"Greater efficiency",
			"convex mirror",
			"increase by 6%",
			"Copper",
			"3 cm",
			"lorry will come to rest in a shorter distance",
			"direction"
	};
	private static final String[] ans= {
			"2:3",
			"1.0cm",
			"its weight in air is more than in water",
			"Greater efficiency",
			"concave mirror",
			"decrease by 4%",
			"Steel",
			"less than the wavelength of light",
			"both will come to rest in the same distance",
			"magnitude"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Phy frame = new Phy();
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
	public Phy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel PlblNewLabel = new JLabel("Physics Quiz");
		PlblNewLabel.setForeground(new Color(255, 255, 255));
		PlblNewLabel.setBounds(94, 11, 264, 52);
		PlblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel PlblNewLabel_1 = new JLabel("Score");
		PlblNewLabel_1.setForeground(new Color(255, 255, 255));
		PlblNewLabel_1.setBounds(221, 91, 77, 30);
		PlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(308, 90, 63, 35);
		textField.setColumns(10);
		
		JLabel PlblNewLabel_2 = new JLabel("Question");
		PlblNewLabel_2.setForeground(new Color(255, 255, 255));
		PlblNewLabel_2.setBounds(33, 153, 124, 35);
		PlblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton PradioButton = new JRadioButton("No");
		buttonGroup.add(PradioButton);
		PradioButton.setBounds(79, 293, 272, 23);
		PradioButton.setBackground(new Color(240, 240, 240));
		PradioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton PradioButton_1 = new JRadioButton("Yes");
		buttonGroup.add(PradioButton_1);
		PradioButton_1.setBounds(79, 340, 272, 23);
		PradioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		PradioButton_1.setBackground(SystemColor.menu);
		
		JRadioButton PradioButton_2 = new JRadioButton("MayBe");
		buttonGroup.add(PradioButton_2);
		PradioButton_2.setBounds(79, 389, 272, 23);
		PradioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		PradioButton_2.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(PlblNewLabel);
		contentPane.add(PlblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(PlblNewLabel_2);
		contentPane.add(PradioButton);
		contentPane.add(PradioButton_1);
		contentPane.add(PradioButton_2);
		
		JLabel PlblNewLabel_3 = new JLabel(" ");
		PlblNewLabel_3.setForeground(new Color(255, 255, 255));
		PlblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		PlblNewLabel_3.setBackground(new Color(240, 240, 240));
		PlblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		PlblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(PlblNewLabel_3);
		
		JLabel PlblNewLabel_2_1 = new JLabel("Answer");
		PlblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		PlblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		PlblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(PlblNewLabel_2_1);
		
		JLabel PlblNewLabel_4 = new JLabel(" ");
		PlblNewLabel_4.setForeground(new Color(255, 255, 255));
		PlblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(PlblNewLabel_4);
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
					
					PlblNewLabel_3.setText(text);
					String text1 = Aopt[j%Aopt.length];
				
					PradioButton.setText(text1);
					String text2 = Bopt[k%Bopt.length];
					
					PradioButton_1.setText(text2);
					String text3 = Copt[l%Copt.length];
					
					PradioButton_2.setText(text3);
					Rans = ans[p%ans.length];
						String Aans=PlblNewLabel_4.getText();
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
					if(( PradioButton).isSelected())
					{
						String first = PradioButton.getText().toString();
						PlblNewLabel_4.setText(first);
					}
					else if(PradioButton_1.isSelected())
					{
						String sec = PradioButton_1.getText().toString();
						PlblNewLabel_4.setText(sec);
					}
					else
					{
						String third = PradioButton_2.getText().toString();
						PlblNewLabel_4.setText(third);
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
		sub = "Physics";
	}

}
