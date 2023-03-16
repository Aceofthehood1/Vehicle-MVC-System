package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VehicleHomeViewController {
	
	private VehicleModel model;
	private VehicleLoginView vehicleLoginView;
	private VehicleController vehicleLoginController;
	private RemoveVehicleView removeView;
	private VehicleHomeView homeView;
	private RemoveVehicleViewController removeController;
	private AddVehicleView addView;
	private AddVehicleViewController addController;
	private ViewVehiclesView viewVehicle;
	private ViewVehiclesController viewController;
	private RentedVehiclesView rentedView;
	private RentedVehiclesController rentedController;
	
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
				ArrayList<Car> cars = model.getCars();
				ArrayList<Lorry> lorries = model.getLorries();
				ArrayList<MiniBus> buses = model.getMiniBuses();
				if(e.getSource() == homeView.getAddVehiclesPageButton()) {
					homeView.getFrame().setVisible(false);
					addView = new AddVehicleView();
					addController = new AddVehicleViewController(model,addView);
				}else if(e.getSource() == homeView.getRemoveVehiclesPageButton()){
					homeView.getFrame().setVisible(false);
					removeView = new RemoveVehicleView();
					removeController = new RemoveVehicleViewController(model, removeView);
				}else if(e.getSource() == homeView.getQueryVehiclesPageButton()) {
					homeView.getFrame().setVisible(false);
					viewVehicle = new ViewVehiclesView();
					viewController =new ViewVehiclesController(model, viewVehicle);
				}else if(e.getSource() == homeView.getViewRentedVehiclesPageButton()) {
					homeView.getFrame().setVisible(false);
					int numberOfCars = model.getCars().size();
					int numberOfLorries = model.getLorries().size();
					int numberOfBuses = model.getMiniBuses().size();
					rentedView = new RentedVehiclesView(numberOfCars,numberOfLorries,numberOfBuses);
					rentedController = new RentedVehiclesController(model, rentedView);
				}else if(e.getSource() == homeView.getLogoutButton()) {
					homeView.getFrame().setVisible(false);
					vehicleLoginView = new VehicleLoginView();
					vehicleLoginController = new VehicleController(model,vehicleLoginView);
				}
			}
			catch(Exception ex){
			}
		}
		
	}
}
