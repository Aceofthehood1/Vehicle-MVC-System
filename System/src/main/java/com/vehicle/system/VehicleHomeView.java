package com.vehicle.system;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VehicleHomeView extends JFrame{
	//Defining JFrame
	private JFrame frame;


	//Defining labels
	private JLabel title;
	private JLabel addVehiclesLabel;
	private JLabel removeVehiclesLabel;
	private JLabel queryVehiclesLabel;
	private JLabel viewRentedVehiclesLabel;

	//Defining Buttons
	private JButton addVehiclesPageButton;
	private JButton removeVehiclesPageButton;
	private JButton queryVehiclesPageButton;
	private JButton viewRentedVehiclesPageButton;
	private JButton logoutButton;

	//VehicleView Constructor
	public VehicleHomeView(){
		
		frame= new JFrame("Home Page");
		frame.setLayout(new FlowLayout());
		
		
		title = new JLabel("                                                           Home Page                                                             ");
		addVehiclesLabel = new JLabel("Add Vehicles Page: ");
		removeVehiclesLabel = new JLabel("Remove Vehicles Page: ");
		queryVehiclesLabel = new JLabel("View Vehicles Page");
		viewRentedVehiclesLabel = new JLabel("View Rented Vehicles Page");
		
		addVehiclesPageButton = new JButton("Add Vehicles");
		removeVehiclesPageButton = new JButton("Remove Vehicles");
		queryVehiclesPageButton = new JButton("View all Vehicles");
		viewRentedVehiclesPageButton = new JButton("View rented Vehicles");
		logoutButton =  new JButton("Logout");

		frame.setSize(220,320);
		
		frame.add(title);
		//Links to pages for Staff members 
		frame.add(addVehiclesLabel);
		frame.add(addVehiclesPageButton);
		
		frame.add(removeVehiclesLabel);
		frame.add(removeVehiclesPageButton);
		
		frame.add(queryVehiclesLabel);
		frame.add(queryVehiclesPageButton);

		frame.add(viewRentedVehiclesLabel);
		frame.add(viewRentedVehiclesPageButton);

		frame.add(logoutButton);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}



	public JButton getAddVehiclesPageButton() {
		return addVehiclesPageButton;
	}

	public JButton getRemoveVehiclesPageButton() {
		return removeVehiclesPageButton;
	}

	public JButton getQueryVehiclesPageButton() {
		return queryVehiclesPageButton;
	}

	public JButton getViewRentedVehiclesPageButton() {
		return viewRentedVehiclesPageButton;
	}

	public JButton getLogoutButton() {
		return logoutButton;
	}

	public JFrame getFrame() {
		return frame;
	}
	
	void addHomeViewListener(ActionListener listenForButtonClick) {
		addVehiclesPageButton.addActionListener(listenForButtonClick);
		removeVehiclesPageButton.addActionListener(listenForButtonClick);
		queryVehiclesPageButton.addActionListener(listenForButtonClick);
		viewRentedVehiclesPageButton.addActionListener(listenForButtonClick);
		logoutButton.addActionListener(listenForButtonClick);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
