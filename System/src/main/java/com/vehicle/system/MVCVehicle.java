package com.vehicle.system;

import java.io.IOException;
import java.util.ArrayList;

public class MVCVehicle {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		VehicleLoginView loginView = new VehicleLoginView();
		VehicleModel model = new VehicleModel();
		new VehicleController(model, loginView);

		ArrayList<Customer> customers = new ArrayList<>();
		customers = model.getCustomers();

		ArrayList<Car> cars = new ArrayList<>();
		cars = model.getCars();

        ArrayList<Lorry> lorries = new ArrayList<>();
        lorries = model.getLorries();



		for(int i =0 ; i< customers.size(); i++){
			System.out.println(customers.get(i).getUsername() + " " + customers.get(i).getPassword() );
		}

		for(int i =0 ; i< cars.size(); i++){
			System.out.println(cars.get(i).getDetails());
		}

        for(int i =0 ; i< lorries.size(); i++){
            System.out.println(lorries.get(i).getDetails());
        }


	}

}
