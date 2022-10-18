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

	//Defining Buttons
	private JButton addVehiclesPageButton;
	private JButton removeVehiclesPageButton;
	private JButton queryVehiclesPageButton;
	private JButton logoutButton;

	//VehicleView Constructor
	public VehicleHomeView(){
		
		frame= new JFrame("Home Page");
		frame.setLayout(new FlowLayout());
		
		
		title = new JLabel("                                                           Home Page                                                             ");
		addVehiclesLabel = new JLabel("Add Vehicles Page: ");
		removeVehiclesLabel = new JLabel("Remove Vehicles Page: ");
		queryVehiclesLabel = new JLabel("View Vehicles Page");
		
		addVehiclesPageButton = new JButton("Add Vehicles Page");
		removeVehiclesPageButton = new JButton("Remove Vehicles Page");
		queryVehiclesPageButton = new JButton("View Vehicles");
		
		frame.setSize(220,240);
		
		frame.add(title);
		//Links to pages for Staff members 
		frame.add(addVehiclesLabel);
		frame.add(addVehiclesPageButton);
		
		frame.add(removeVehiclesLabel);
		frame.add(removeVehiclesPageButton);
		
		frame.add(queryVehiclesLabel);
		frame.add(queryVehiclesPageButton);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}



	public JButton getAddVehiclesPageButton() {
		return addVehiclesPageButton;
	}



	public void setAddVehiclesPageButton(JButton addVehiclesPageButton) {
		this.addVehiclesPageButton = addVehiclesPageButton;
	}

	public JButton getRemoveVehiclesPageButton() {
		return removeVehiclesPageButton;
	}

	public void setRemoveVehiclesPageButton(JButton removeVehiclesPageButton) {
		this.removeVehiclesPageButton = removeVehiclesPageButton;
	}

	public JButton getQueryVehiclesPageButton() {
		return queryVehiclesPageButton;
	}

	public void setQueryVehiclesPageButton(JButton queryVehiclesPageButton) {
		this.queryVehiclesPageButton = queryVehiclesPageButton;
	}

	public JFrame getFrame() {
		return frame;
	}
	
	void addHomeViewListener(ActionListener listenForButtonClick) {
		addVehiclesPageButton.addActionListener(listenForButtonClick);
		removeVehiclesPageButton.addActionListener(listenForButtonClick);
		queryVehiclesPageButton.addActionListener(listenForButtonClick);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
