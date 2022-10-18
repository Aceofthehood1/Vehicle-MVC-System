package com.vehicle.system;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VehicleRegisterView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Defining JFrame
	private JFrame frame;

	//Defining text fields
	private JTextField corporationName;
	private JTextField address;
	private JTextField emailAddress;
	private JTextField phoneNumber;
	private JTextField username;
	private JTextField password;

	//Defining labels
	private JLabel nameLabel;
	private JLabel addressLabel;
	private JLabel emailLabel;
	private JLabel phoneNumberLabel;
	private JLabel usernameLabel;
	private JLabel passwordLabel;


	//Defining Buttons
	private JButton submitButton;
	private JButton loginButton;
	
	public VehicleRegisterView() {
		frame= new JFrame();
		frame.setLayout(new FlowLayout());
		
		corporationName= new JTextField(20);
		address = new JTextField(20);
		emailAddress = new JTextField(20);
		phoneNumber = new JTextField(20);
		username = new JTextField(20);
		password = new JTextField(20);
		
		nameLabel = new JLabel("Corporation Name: ");
		addressLabel = new JLabel("Address: ");
		emailLabel = new JLabel("Email Address: ");
		phoneNumberLabel = new JLabel("Phone Number: ");
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		
		submitButton = new JButton("Sign up");
		loginButton = new JButton("Log in if you already have an account");
		
		frame.setSize(300,400);
		
		frame.add(nameLabel);
		frame.add(corporationName);
		
		frame.add(addressLabel);
		frame.add(address);
		
		frame.add(emailLabel);
		frame.add(emailAddress);
		
		frame.add(phoneNumberLabel);
		frame.add(phoneNumber);
		
		frame.add(usernameLabel);
		frame.add(username);
		
		frame.add(passwordLabel);
		frame.add(password);
		
		frame.add(submitButton);
		frame.add(loginButton);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public JTextField getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(JTextField corporationName) {
		this.corporationName = corporationName;
	}

	public JTextField getAddress() {
		return address;
	}

	public void setAddress(JTextField address) {
		this.address = address;
	}

	public JTextField getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(JTextField emailAddress) {
		this.emailAddress = emailAddress;
	}

	public JTextField getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(JTextField phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	public JButton getLoginButton() {
		return loginButton;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	
	void addRegisterCheckListener(ActionListener listenForButtonClick) {
		submitButton.addActionListener(listenForButtonClick);
		loginButton.addActionListener(listenForButtonClick);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
