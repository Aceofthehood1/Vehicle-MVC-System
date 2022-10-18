package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AddVehicleViewController {
	
	private VehicleModel model;
	private VehicleLoginView loginView;
	private AddVehicleView addView;
	private VehicleController loginController;
	private AddCarView carView;
	private AddCarController carController;
	private AddLorryView lorryView;
	private AddLorryController lorryController;
	private AddMiniBusView busView;
	private AddMiniBusController busController;
	
	
	public AddVehicleViewController(VehicleModel model, AddVehicleView addView) {
		this.model = model;
		this.addView = addView;
		
		this.addView.addVehicleListener(new addListener());
	}
	
	class addListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {	
				if(e.getSource() == addView.getCarButton()) {
					addView.getFrame().setVisible(false);
					carView = new AddCarView();
					carController = new AddCarController(model,carView);
					
				}else if(e.getSource() == addView.getLorryButton()){
					addView.getFrame().setVisible(false);
					lorryView = new AddLorryView();
					lorryController = new AddLorryController (model, lorryView);
				}else if(e.getSource() == addView.getMiniBusButton()) {
					addView.getFrame().setVisible(false);
					busView = new AddMiniBusView();
					busController = new AddMiniBusController (model, busView);
				}
			}
			catch(Exception ex){
				loginView.displayErrorMessage("Wrong username or password");
			}
		}
		
	}
}
