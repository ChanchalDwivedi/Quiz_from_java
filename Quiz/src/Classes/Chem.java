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
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Chem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JButton btnSubmit,btnNext;
	public String answer,marks,sub;
	public int i=0,j=0,k=0,l=0,p=0,score=0;
	public String Rans,Aans;
	private static final String[] Que= {
			"Which one of the following is acidic?",
			"Which one of the following will turn red litmus blue?",
			"Which one of the following will turn blue litmus red?",
			"Nature of Methyl orange is",
			"Lime water is",
			"The nature of calcium phosphate is present in tooth enamel is",
			"Which of the following salts has no water of crystallization?",
			"The chemical formula of caustic potash is",
			"Which of the following does not form an acidic salt?",
			"The difference of molecules of water in gypsum and PoP is"	
	};
	private static final String[] Aopt= {
			"Tomato",
			"Baking soda solution",
			"lime Water",
			"Acidic",
			"Ca(OH)2",
			"Acidic",
			"Gypsum",
			"NH4OH ",
			"Hydrochloric acid",
			"3/2"
	};
	private static final String[] Bopt= {
			"Lemon",
			"Lemon Juice",
			"Vineger",
			"Basic",
			"CaCO3",
			"Neutral",
			"Baking soda",
			"Ca(OH)2 ",
			"Carbonic acid",
			"3"
	};
	private static final String[] Copt= {
			"Both",
			"Vinegar",
			"Baking soda solution",
			"Neutral",
			"CaCI2",
			"Basic",
			"Washing soda",
			"KOH",
			"Sulphuric acid",
			"2"
	};
	private static final String[] ans= {
			"Both",
			"Baking soda solution",
			"Vineger",
			"Acidic",
			"Ca(OH)2 ",
			"Basic",
			"Baking soda",
			"KOH",
			"Carbonic acid",
			"3/2"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chem frame = new Chem();
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
	public Chem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JLabel CHlblNewLabel = new JLabel("Chemistry Quiz");
		CHlblNewLabel.setForeground(new Color(255, 255, 255));
		CHlblNewLabel.setBounds(51, 11, 320, 52);
		CHlblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel CHlblNewLabel_1 = new JLabel("Score");
		CHlblNewLabel_1.setForeground(new Color(255, 255, 255));
		CHlblNewLabel_1.setBounds(221, 91, 77, 30);
		CHlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField = new JTextField();
		textField.setBounds(308, 90, 63, 35);
		textField.setColumns(10);
		
		JLabel CHlblNewLabel_2 = new JLabel("Question");
		CHlblNewLabel_2.setForeground(new Color(255, 255, 255));
		CHlblNewLabel_2.setBounds(33, 153, 124, 35);
		CHlblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton CHradioButton = new JRadioButton("No");
		buttonGroup.add(CHradioButton);
		CHradioButton.setBounds(79, 293, 323, 23);
		CHradioButton.setBackground(new Color(240, 240, 240));
		CHradioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton CHradioButton_1 = new JRadioButton("Yes");
		buttonGroup.add(CHradioButton_1);
		CHradioButton_1.setBounds(79, 340, 323, 23);
		CHradioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		CHradioButton_1.setBackground(SystemColor.menu);
		
		JRadioButton CHradioButton_2 = new JRadioButton("MayBe");
		buttonGroup.add(CHradioButton_2);
		CHradioButton_2.setBounds(79, 389, 323, 23);
		CHradioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		CHradioButton_2.setBackground(SystemColor.menu);
		contentPane.setLayout(null);
		contentPane.add(CHlblNewLabel);
		contentPane.add(CHlblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(CHlblNewLabel_2);
		contentPane.add(CHradioButton);
		contentPane.add(CHradioButton_1);
		contentPane.add(CHradioButton_2);
		
		JLabel CHlblNewLabel_3 = new JLabel(" ");
		CHlblNewLabel_3.setForeground(new Color(255, 255, 255));
		CHlblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		CHlblNewLabel_3.setBackground(new Color(240, 240, 240));
		CHlblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		CHlblNewLabel_3.setBounds(65, 199, 337, 52);
		contentPane.add(CHlblNewLabel_3);
		
		JLabel CHlblNewLabel_2_1 = new JLabel("Answer");
		CHlblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		CHlblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		CHlblNewLabel_2_1.setBounds(33, 419, 124, 35);
		contentPane.add(CHlblNewLabel_2_1);
		
		JLabel CHlblNewLabel_4 = new JLabel(" ");
		CHlblNewLabel_4.setForeground(new Color(255, 255, 255));
		CHlblNewLabel_4.setBounds(79, 465, 256, 35);
		contentPane.add(CHlblNewLabel_4);
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
					
					CHlblNewLabel_3.setText(text);
					String text1 = Aopt[j%Aopt.length];
				
					CHradioButton.setText(text1);
					String text2 = Bopt[k%Bopt.length];
					
					CHradioButton_1.setText(text2);
					String text3 = Copt[l%Copt.length];
					
					CHradioButton_2.setText(text3);
					Rans = ans[p%ans.length];
						String Aans=CHlblNewLabel_4.getText();
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
					if(( CHradioButton).isSelected())
					{
						String first = CHradioButton.getText().toString();
						CHlblNewLabel_4.setText(first);
					}
					else if(CHradioButton_1.isSelected())
					{
						String sec = CHradioButton_1.getText().toString();
						CHlblNewLabel_4.setText(sec);
					}
					else
					{
						String third = CHradioButton_2.getText().toString();
						CHlblNewLabel_4.setText(third);
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
		sub = "Chemistry";
	}
}
