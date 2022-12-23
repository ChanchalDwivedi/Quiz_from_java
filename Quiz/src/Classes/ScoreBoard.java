package Classes;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ScoreBoard extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public DefaultTableModel mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreBoard frame = new ScoreBoard();
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
	public ScoreBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(0, 0, 0));
		scrollPane.setBounds(27, 120, 380, 371);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Subjects", "Score"
			}
		));
		
		JLabel lblNewLabel = new JLabel("Score Board");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(102, 38, 232, 50);
		contentPane.add(lblNewLabel);
		mod = (DefaultTableModel)table.getModel();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from score");
			while(rs.next()) {
				mod.addRow(new Object[] {rs.getString(1),rs.getInt(2)});
				
				}
		}
		
		catch (ClassNotFoundException e2) {
		System.out.println("driver not loaded");
			e2.printStackTrace();
		}
		catch (SQLException e1) {
			e1.printStackTrace();
			System.out.println("driver not loaded");
		}

	}
}
