package com.vehicle.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VehicleModel {
	
	File customersFile = new File("customers.txt");
	File carsFile = new File("cars.txt");
	File lorriesFile = new File("lorries.txt");
	File miniBusesFile = new File("miniBuses.txt");
	
	
	public void addCustomer(Customer customer) throws ClassNotFoundException, FileNotFoundException, IOException {
			
			ArrayList<Customer> customers = new ArrayList<>();
			
			if(customersFile.length() != 0) {
				customers = getCustomers();
			}
			
				customers.add(customer);
			
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(customersFile));
			
			os.writeObject(customers); //remove this so that the data would be stored to the file when the program is exited
			
			os.close();
	
		}
	
	public void addCar(Car car) throws ClassNotFoundException, FileNotFoundException, IOException {
		
		ArrayList<Car> cars = new ArrayList<>();
		
		if(carsFile.length() != 0) {
			cars = getCars();
		}
		
			cars.add(car);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(carsFile));
		
		os.writeObject(cars); //remove this so that the data would be stored to the file when the program is exited
		
		os.close();

	}

	public void addLorry(Lorry lorry) throws ClassNotFoundException, FileNotFoundException, IOException {

		ArrayList<Lorry> lorries = new ArrayList<>();

		if(lorriesFile.length() != 0) {
			lorries = getLorries();
		}

		lorries.add(lorry);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(lorriesFile));

		os.writeObject(lorries); //remove this so that the data would be stored to the file when the program is exited

		os.close();

	}

	public void addMiniBus(MiniBus miniBus) throws ClassNotFoundException, FileNotFoundException, IOException {

		ArrayList<MiniBus> miniBuses = new ArrayList<>();

		if(miniBusesFile.length() != 0) {
			miniBuses = getMiniBuses();
		}

		miniBuses.add(miniBus);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(miniBusesFile));

		os.writeObject(miniBuses); //remove this so that the data would be stored to the file when the program is exited

		os.close();

	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Customer> getCustomers() throws ClassNotFoundException, FileNotFoundException, IOException {
		
		ArrayList<Customer> customers = new ArrayList<>();
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(customersFile));

				customers = (ArrayList<Customer>)is.readObject();
				is.close();
	
		return customers;

	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Car> getCars() throws ClassNotFoundException, FileNotFoundException, IOException {
		
		ArrayList<Car> cars = new ArrayList<>();
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(carsFile));

				cars = (ArrayList<Car>)is.readObject();
				is.close();
	
		return cars;

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Lorry> getLorries() throws ClassNotFoundException, FileNotFoundException, IOException {

		ArrayList<Lorry> lorries = new ArrayList<>();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(lorriesFile));

		lorries = (ArrayList<Lorry>)is.readObject();
		is.close();

		return lorries;

	}

	@SuppressWarnings("unchecked")
	public ArrayList<MiniBus> getMiniBuses() throws ClassNotFoundException, FileNotFoundException, IOException {

		ArrayList<MiniBus> miniBuses = new ArrayList<>();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(miniBusesFile));

		miniBuses = (ArrayList<MiniBus>)is.readObject();
		is.close();

		return miniBuses;

	}

	
	

}
