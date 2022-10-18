package com.vehicle.system;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddCarView extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Defining JFrame
	private JFrame frame;

	//Defining text fields
	private JTextField make;
	private JTextField vehicleModel; 
	private JTextField topSpeed;
	private JTextField registrationNumber;
	private JTextField dailyHireRate;
	private JTextField fuelType;
	private JTextField numberOfDoors;


	//Defining labels
	private JLabel title;
	private JLabel makeLabel;
	private JLabel modelLabel;
	private JLabel topSpeedLabel;
	private JLabel registrationNumberLabel;
	private JLabel dailyHireRateLabel;
	private JLabel fuelTypeLabel;
	private JLabel numberOfDoorsLabel;

	//Defining button
	private JButton addCarButton;
	private JButton back;

	//AddCarForm Constructor
	public AddCarView(){
		
		frame= new JFrame("Add a Car");
		frame.setLayout(new FlowLayout());
		
		//Setting Text Fields
		make = new JTextField(20);
		vehicleModel = new JTextField(20);
		topSpeed = new JTextField(20);
		registrationNumber = new JTextField(20);
		dailyHireRate = new JTextField(20);
		fuelType = new JTextField(20);
		numberOfDoors = new JTextField(20);
		
		//Setting Labels
		title = new JLabel("                                                           Add Car Form                                                             ");
		makeLabel = new JLabel("Make: ");
		modelLabel = new JLabel("Model: ");
		topSpeedLabel = new JLabel("Top Speed: ");
		registrationNumberLabel = new JLabel("Registration : ");
		dailyHireRateLabel = new JLabel("Daily Hire Rate: ");
		fuelTypeLabel = new JLabel("Fuel Type Label");
		numberOfDoorsLabel = new JLabel("Number Of Doors");
		
		//Setting Button
		addCarButton = new JButton("Add Car");
		back = new JButton("Back");
		
		frame.setSize(260,450);
		//Adding fields to the frame
		frame.add(title);
		
		frame.add(makeLabel);
		frame.add(make);
		
		frame.add(modelLabel);
		frame.add(vehicleModel);
		
		frame.add(topSpeedLabel);
		frame.add(topSpeed);
		
		frame.add(registrationNumberLabel);
		frame.add(registrationNumber);
		
		frame.add(dailyHireRateLabel);
		frame.add(dailyHireRate);
		
		frame.add(fuelTypeLabel);
		frame.add(fuelType);
		
		frame.add(numberOfDoorsLabel);
		frame.add(numberOfDoors);
		
		frame.add(addCarButton);
		frame.add(back);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	//getter and setter methods for buttons and textFields

	
	
	void addCarListener(ActionListener listener) {	
		addCarButton.addActionListener(listener);
		back.addActionListener(listener);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getMake() {
		return make;
	}

	public void setMake(JTextField make) {
		this.make = make;
	}

	public JTextField getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(JTextField vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public JTextField getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(JTextField topSpeed) {
		this.topSpeed = topSpeed;
	}

	public JTextField getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(JTextField registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public JTextField getDailyHireRate() {
		return dailyHireRate;
	}

	public void setDailyHireRate(JTextField dailyHireRate) {
		this.dailyHireRate = dailyHireRate;
	}

	public JTextField getFuelType() {
		return fuelType;
	}

	public void setFuelType(JTextField fuelType) {
		this.fuelType = fuelType;
	}

	public JTextField getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(JTextField numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public JButton getAddCarButton() {
		return addCarButton;
	}

	public void setAddCarButton(JButton addCarButton) {
		this.addCarButton = addCarButton;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	
}
