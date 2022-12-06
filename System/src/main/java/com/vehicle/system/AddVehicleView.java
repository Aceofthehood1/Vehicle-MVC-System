package com.vehicle.system;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddVehicleView extends JFrame{
	//Defining JFrame
	private JFrame frame;

	//Defining labels
	private JLabel title;

	//Defining Buttons
	private JButton carButton;
	private JButton lorryButton;
	private JButton miniBusButton;
	private JButton backButton;


	//VehicleView Constructor
	public AddVehicleView(){
		
		frame= new JFrame("Add Vehicles Page");
		frame.setLayout(new FlowLayout());
		
		title = new JLabel("                                                           Select Vehicle                                                             ");
		
		
		carButton = new JButton("Add a Car");
		lorryButton = new JButton("Add a Lorry");
		miniBusButton = new JButton("Add a Mini-Bus");
		backButton = new JButton("Back");
		
		frame.setSize(260,250);
		
		frame.add(title);
		
		frame.add(carButton);
		frame.add(lorryButton);
		frame.add(miniBusButton);
		frame.add(backButton);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	public JButton getCarButton() {
		return carButton;
	}


	public void setCarButton(JButton carButton) {
		this.carButton = carButton;
	}


	public JButton getLorryButton() {
		return lorryButton;
	}


	public void setLorryButton(JButton lorryButton) {
		this.lorryButton = lorryButton;
	}

	public JButton getMiniBusButton() {
		return miniBusButton;
	}

	public void setMiniBusButton(JButton miniBusButton) {
		this.miniBusButton = miniBusButton;
	}
	public JButton getBackButton() {
		return backButton;
	}

	public JFrame getFrame() {
		return frame;
	}


	void addVehicleListener(ActionListener listenForButtonClick) {
		carButton.addActionListener(listenForButtonClick);
		lorryButton.addActionListener(listenForButtonClick);
		miniBusButton.addActionListener(listenForButtonClick);
		backButton.addActionListener(listenForButtonClick);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
