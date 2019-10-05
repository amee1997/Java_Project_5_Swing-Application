import javax.swing.JLabel;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class ConnectionManager2 {

	

	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		   
		   Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","");  
			
			if (con != null)
			{
				System.out.println("Connected");
			}
			else
			{
				System.out.println("not Connected");
			}
			
			Statement statement = con.createStatement();
		   
		
		JFrame f = new JFrame("Registration");
		JLabel l3,l4;
		
		l3 = new JLabel("User Name:");
		l3.setBounds(80,150,180,50);
		l4 = new JLabel("Password:");
		l4.setBounds(80,200,180,50);
		
		final JTextField tf3 = new JTextField();
		tf3.setBounds(200,160,250,30);
		f.add(tf3);
		final JTextField tf4 = new JTextField();
		tf4.setBounds(200,210,250,30);
		f.add(tf4);
		
		f.setSize(600,900);
		f.setLayout(null);
		f.setVisible(true);
		
		
		f.add(l3);
		f.add(l4);
		
		JButton b = new JButton("Submit");
		b.setBounds(200,410,150,50);
		f.add(b);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String username,password;
				username=tf3.getText();
				password=tf4.getText();

				try {
					statement.executeUpdate("INSERT INTO reg VALUES('"+username+"','"+password+"')");
				} catch (SQLException e1) {
				  e1.printStackTrace();
				}
				
				
		    }
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				

		     }

		}

	