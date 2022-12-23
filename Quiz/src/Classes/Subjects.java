package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Subjects extends JFrame {
	private static final long serialVersionUID = 3L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subjects frame = new Subjects();
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
	public Subjects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subjects");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(141, 11, 168, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BIOLOGY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bio B=new Bio();
				B.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(10, 102, 196, 70);
		contentPane.add(btnNewButton);
		
		JButton btnPhysics = new JButton("PHYSICS");
		btnPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Phy P=new Phy();
				P.show();
				dispose();
			}
		});
		btnPhysics.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPhysics.setBounds(240, 102, 174, 70);
		contentPane.add(btnPhysics);
		
		JButton btnChemistry = new JButton("CHEMISTRY");
		btnChemistry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chem Ch=new Chem();
				Ch.show();
				dispose();
			}
		});
		btnChemistry.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnChemistry.setBounds(10, 220, 196, 70);
		contentPane.add(btnChemistry);
		
		JButton btnMaths = new JButton("MATHS");
		btnMaths.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Maths M=new Maths();
				M.show();
				dispose();
			}
		});
		btnMaths.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnMaths.setBounds(240, 220, 174, 70);
		contentPane.add(btnMaths);
		
		JButton btnGernalKnowlege = new JButton("GK");
		btnGernalKnowlege.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GK G=new GK();
				G.show();
				dispose();
			}
		});
		btnGernalKnowlege.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGernalKnowlege.setBounds(10, 339, 174, 70);
		contentPane.add(btnGernalKnowlege);
		
		JButton btnComputer = new JButton("COMPUTER");
		btnComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comp C=new Comp();
				C.show();
				dispose();
			}
		});
		btnComputer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnComputer.setBounds(240, 339, 187, 70);
		contentPane.add(btnComputer);
		
		JButton btnGernalKnowlege_1_1 = new JButton("Cancel");
		btnGernalKnowlege_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnGernalKnowlege_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGernalKnowlege_1_1.setBounds(306, 478, 121, 39);
		contentPane.add(btnGernalKnowlege_1_1);}

}
