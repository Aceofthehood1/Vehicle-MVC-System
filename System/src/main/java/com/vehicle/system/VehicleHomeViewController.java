package com.vehicle.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class VehicleHomeViewController {
	
	private VehicleModel model;
	private RemoveVehicleView removeView;
	private VehicleHomeView homeView;
	private RemoveVehicleViewController removeController;
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
					removeView = new RemoveVehicleView();
					removeController = new RemoveVehicleViewController(model, removeView);
				}else if(e.getSource() == homeView.getQueryVehiclesPageButton()) {
					
				}
			}
			catch(Exception ex){
			}
		}
		
	}
}
