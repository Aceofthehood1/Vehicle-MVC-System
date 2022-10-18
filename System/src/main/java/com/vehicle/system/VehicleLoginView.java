package com.vehicle.system;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VehicleLoginView extends JFrame{
	
	private VehicleModel model;
	//Defining JFrame
	private JFrame frame;

	//Defining text fields
	private JTextField username;
	private JTextField password;

	//Defining labels
	private JLabel title;
	private JLabel usernameLabel;
	private JLabel passwordLabel;


	//Defining Buttons
	private JButton submitButton;
	private JButton createAccountButton;
	
	//Constructor
	public VehicleLoginView() {
		frame= new JFrame("Login Page");
		frame.setLayout(new FlowLayout());
		
		username = new JTextField(20);
		password = new JTextField(20);
		
		title = new JLabel("                                                           Login                                                             ");
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		
		submitButton = new JButton("login");
		createAccountButton = new JButton("Create an Account");
		
		frame.setSize(260,250);
		
		frame.add(title);
		
		frame.add(usernameLabel);
		frame.add(username);
		
		frame.add(passwordLabel);
		frame.add(password);
		
		frame.add(submitButton);
		frame.add(createAccountButton);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	
	public JTextField getUsername() {
		return username;
	}

	public void setUsername(JTextField username) {
		this.username = username;
	}


	public JTextField getPassword() {
		return password;
	}

	public void setPassword(JTextField password) {
		this.password = password;
	}
	
	public JButton getSubmitButton() {
		return submitButton;
	}
	
	public JButton getCreateAccountButton() {
		return createAccountButton;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	void addLoginCheckListener(ActionListener listenForButtonClick) {
		submitButton.addActionListener(listenForButtonClick);
		createAccountButton.addActionListener(listenForButtonClick);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
