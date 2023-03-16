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

		ArrayList<RentedVehicle> rentedVehicles = new ArrayList<>();
		rentedVehicles = model.getRentedVehicles();

		for(int i =0 ; i< customers.size(); i++){
			System.out.println(customers.get(i).getUsername() + " " + customers.get(i).getPassword() );
		}

		for(int i =0 ; i< cars.size(); i++){
			//System.out.println(cars.get(i).getDetails());
			System.out.println(cars.get(i).getRented());
		}

        for(int i =0 ; i< lorries.size(); i++){
			System.out.println(lorries.get(i).getRented());
            //System.out.println(lorries.get(i).getDetails());
        }

		for(RentedVehicle rentedVehicle : rentedVehicles){
			System.out.println(rentedVehicle.getVehicleType());
		}

		String details ="";
		for(RentedVehicle rentedVehicle :rentedVehicles){
			if(rentedVehicle.getVehicleType().equals("Car")){
				System.out.println("I am here");
			}
			else if(rentedVehicle.getVehicleType()=="Lorry"){
				details += "Vehicle Type: Lorry\n" + lorries.get(rentedVehicle.getVehicleIndex()).getDetails();
			}
		}



	}

}
