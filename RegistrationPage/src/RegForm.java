import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RegForm  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Registration");
		JLabel l1,l2,l3,l4,l5,l6,l7;
		l1 = new JLabel("First Name:");
		l1.setBounds(80,50,180,50);
		l2 = new JLabel("Last Name:");
		l2.setBounds(80,100,180,50);
		l3 = new JLabel("User Name:");
		l3.setBounds(80,150,180,50);
		l4 = new JLabel("Password:");
		l4.setBounds(80,200,180,50);
		l5 = new JLabel("Confirm Password:");
		l5.setBounds(80,250,180,50);
		l6 = new JLabel("Mobile Number:");
		l6.setBounds(80,300,230,50);
		l7 = new JLabel("Email Id:");
		l7.setBounds(80,350,240,50);
		final JTextField tf1 = new JTextField();
		tf1.setBounds(200,60,250,30);
		f.add(tf1);
		final JTextField tf2 = new JTextField();
		tf2.setBounds(200,110,250,30);
		f.add(tf2);
		final JTextField tf3 = new JTextField();
		tf3.setBounds(200,160,250,30);
		f.add(tf3);
		final JTextField tf4 = new JTextField();
		tf4.setBounds(200,210,250,30);
		f.add(tf4);
		final JTextField tf5 = new JTextField();
		tf5.setBounds(200,260,250,30);
		f.add(tf5);
		final JTextField tf6 = new JTextField();
		tf6.setBounds(200,310,250,30);
		f.add(tf6);
		final JTextField tf7 = new JTextField();
		tf7.setBounds(200,360,250,30);
		f.add(tf7);
		f.setSize(600,900);
		f.setLayout(null);
		f.setVisible(true);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		JButton b = new JButton("Submit");
		b.setBounds(200,410,150,50);
		f.add(b);
		JLabel s1,s2,s3,s4,s5,s6,s7,s8;
		s1 = new JLabel();
		s1.setBounds(80,500,160,50);
		s2 = new JLabel();
		s2.setBounds(80,530,180,50);
		s3 = new JLabel();
		s3.setBounds(80,560,180,50);
		s4 = new JLabel();
		s4.setBounds(80,590,180,50);
		s5 = new JLabel();
		s5.setBounds(80,620,180,50);
		s6 = new JLabel();
		s6.setBounds(80,650,180,50);
		s7 = new JLabel();
		s7.setBounds(80,680,180,50);
		s8 = new JLabel();
		s8.setBounds(80,460,250,50);
		f.add(s1);
		f.add(s2);
		f.add(s3);
		f.add(s4);
		f.add(s5);
		f.add(s6);
		f.add(s7);
		f.add(s8);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				s8.setText("Registration Completed Your details are:");
				s1.setText(tf1.getText());
				s2.setText(tf2.getText());
				s3.setText(tf3.getText());
				s4.setText(tf4.getText());
				s5.setText(tf5.getText());
				s6.setText(tf6.getText());
				s7.setText(tf7.getText());
				
				
		    }
		});
			
	}

}
