package Fitness;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
	private static JLabel tittle,password1, label;
	private static JTextField username;
	private static JButton button;
	private static JPasswordField Password;
	
	
	public LoginPage() {
                tittle = new JLabel ("User Login");
                tittle.setBounds(200,5,200,80);
                tittle.setFont(new Font("",Font.BOLD,30));
                add(tittle);
                
		label = new JLabel("Username");
		label.setBounds(80, 100, 250, 40);
                label.setFont(new Font ("",Font.BOLD,22));
		add(label);
		
		
		username = new JTextField();
		username.setBounds(80, 140, 400, 40);
                username.setFont(new Font ("",Font.PLAIN,20));
		add(username);
		
		
		password1 = new JLabel("Password");
		password1.setBounds(80, 200, 250, 40 );
                password1.setFont(new Font ("",Font.BOLD,22));
		add(password1);
		
		
		Password = new JPasswordField();
		Password.setBounds(80, 240, 400,40);
                Password.setFont(new Font ("",Font.PLAIN,20));
		add(Password);
		
		
		button = new JButton("Sign In");
                button.setFont(new Font ("",Font.BOLD,22));
		button.setBounds(80, 350, 400, 50);
		button.setForeground(Color.white);
		button.setBackground(Color.BLACK);
		button.addActionListener(this);
		add(button);
		setTitle("Fitness Login ");
                setLayout(null);
		setSize(550,500);
                setVisible(true);
                setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}

@Override
public void actionPerformed (ActionEvent e){
if (e. getSource() ==button) {
String txtuser = username.getText();
String txtpass = Password.getText();
if (txtuser. equals ("Visal") ) {
if (txtpass. equals ("somalin") ) {
Resigters stu = new Resigters () ;
stu.setVisible(true);
                dispose () ;
            }else {
                JOptionPane.showMessageDialog(null,"Invalid Password...!");
            }
            }else{
                JOptionPane.showMessageDialog (null, "Invalid Email...!");
            }
            }else {
            System.exit(0);
        }	
    }
}

