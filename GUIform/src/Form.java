import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Form implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  JPanel panel = new JPanel();	
  JFrame frame = new JFrame();
  
  frame.setSize(550,350);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.add(panel);
  
  panel.setLayout(null);
  
  JLabel firstName = new JLabel("First Name");
  firstName.setBounds(10,20,80,25);
  panel.add(firstName);
  
  
  JTextField firstNametext = new JTextField();
  firstNametext.setBounds(100,20,165 ,25 );
  panel.add(firstNametext);

  JLabel lastName = new JLabel("Last Name");
  lastName.setBounds(10,50,80,25);
  panel.add(lastName);
  
  
  JTextField lastNametext = new JTextField();
  lastNametext.setBounds(100,50,165 ,25 );
  panel.add(lastNametext);
  

  JLabel emailID = new JLabel("Email ID");
  emailID.setBounds(10,80,80,25);
  panel.add(emailID);
  
  
  JTextField emailText = new JTextField();
  emailText.setBounds(100,80,165 ,25 );
  panel.add(emailText);


  JLabel userName = new JLabel("User Name");
  userName.setBounds(10,110,80,25);
  panel.add(userName);
  
  
  JTextField userNametext = new JTextField();
  userNametext.setBounds(100,110,165 ,25 );
  panel.add(userNametext);

  

  JLabel passwordLabel = new JLabel("Password");
  passwordLabel.setBounds(10,140,80,25);
  panel.add(passwordLabel);
  
  JPasswordField passwordText = new JPasswordField();
  passwordText.setBounds(100, 140, 165, 25);
  panel.add(passwordText);
  

  JLabel confirmpasswordLabel = new JLabel("Confirm Password");
 confirmpasswordLabel.setBounds(10,170,80,25);
  panel.add(confirmpasswordLabel);
  
  JPasswordField confirmpasswordText = new JPasswordField();
  confirmpasswordText.setBounds(100, 170, 165, 25);
  panel.add(confirmpasswordText);
  
  JButton button = new  JButton ("Login");
  button.setBounds(10,200,80,25);
  button.addActionListener(new Form());
  panel.add(button);
  
  JLabel success = new JLabel("");
  success.setBounds(10,230,300,25);
  panel.add(success);
//  success.setText()
  
  frame.setVisible(true);
	}
@Override
public void actionPerformed(ActionEvent e) {
//	System.out.println("Button clicked");
}
}
