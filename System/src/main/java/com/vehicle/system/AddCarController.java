package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AddCarController {
	
	private VehicleModel model;
	private AddVehicleView addVehicleView;
	private AddCarView carView;
	
	public AddCarController(VehicleModel model, AddCarView carView) {
		this.model = model;
		this.carView = carView;
		
		this.carView.addCarListener(new carListener());
	}
	
	class carListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {	
				
				if(e.getSource() == carView.getAddCarButton()) {
					
					String make = carView.getMake().getText().isEmpty() ? " " : carView.getMake().getText() ;
					String carModel = carView.getVehicleModel().getText().isEmpty() ? " " : carView.getVehicleModel().getText();
					double topSpeed = carView.getTopSpeed().getText().isEmpty() ? 0.0 : Double.parseDouble(carView.getTopSpeed().getText());
					String registrationNumber = carView.getRegistrationNumber().getText().isEmpty() ? " " : carView.getRegistrationNumber().getText();
					double dailyHireRate = carView.getDailyHireRate().getText().isEmpty() ? 0.0 : Double.parseDouble(carView.getDailyHireRate().getText());
					String fuelType = carView.getFuelType().getText().isEmpty() ? " " : carView.getFuelType().getText();
					int numberOfDoors = carView.getNumberOfDoors().getText().isEmpty() ? 0 : Integer.parseInt(carView.getNumberOfDoors().getText());
					
					Car car = new Car(make, carModel, topSpeed, registrationNumber, dailyHireRate,false, fuelType, numberOfDoors);
					
					if(make.equals(" ") || carModel.equals(" ") || topSpeed == 0.0 || registrationNumber.equals(" ") || dailyHireRate == 0.0 || fuelType.equals(" ") || numberOfDoors == 0 ) {
						JOptionPane.showMessageDialog(null, "Please type in the cars details and do not leave any fields empty");
					}else {
						model.addCar(car);
						JOptionPane.showMessageDialog(null, "Car has been added successfully");
					}
					
					
				}else if(e.getSource() == carView.getBack()){
					carView.getFrame().setVisible(false);
					addVehicleView = new AddVehicleView();
					new AddVehicleViewController(model, addVehicleView);
					
				}
			}
			catch(Exception ex){
				addVehicleView.displayErrorMessage("Wrong data has been entered");
			}
		}
		
	}
}
