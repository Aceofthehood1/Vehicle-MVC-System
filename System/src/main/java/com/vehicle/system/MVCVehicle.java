package com.vehicle.system;

public class MVCVehicle {


	public static void main(String[] args) {
		
		VehicleLoginView loginView = new VehicleLoginView();
		VehicleModel model = new VehicleModel();
		new VehicleController(model, loginView);

	}

}
