package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class VehicleHomeViewController {
	
	private VehicleModel model;
	private VehicleLoginView loginView;
	private VehicleHomeView homeView;
	private VehicleController loginController;
	private AddVehicleView addView;
	private AddVehicleViewController addController;
	
	public VehicleHomeViewController(VehicleModel model, VehicleHomeView homeView) {
		this.model = model;
		this.homeView = homeView;
		
		this.homeView.addHomeViewListener(new homeListener());
	}
	
	class homeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {	
				if(e.getSource() == homeView.getAddVehiclesPageButton()) {
					homeView.getFrame().setVisible(false);
					addView = new AddVehicleView();
					addController = new AddVehicleViewController(model,addView);
				}else if(e.getSource() == homeView.getRemoveVehiclesPageButton()){
					homeView.getFrame().setVisible(false);
					loginView = new VehicleLoginView();
					loginController = new VehicleController(model, loginView);
				}else if(e.getSource() == homeView.getQueryVehiclesPageButton()) {
					
				}
			}
			catch(Exception ex){
				loginView.displayErrorMessage("Wrong username or password");
			}
		}
		
	}
}
