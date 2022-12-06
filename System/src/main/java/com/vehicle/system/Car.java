package com.vehicle.system;

public class Car extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fuel_type;
	private int number_of_doors;
	
	public Car(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, String fuel_type, int number_of_doors) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate);
		this.fuel_type = fuel_type;
		this.number_of_doors = number_of_doors;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public int getNumber_of_doors() {
		return number_of_doors;
	}

	public void setNumber_of_doors(int number_of_doors) {
		this.number_of_doors = number_of_doors;
	}

	public String getDetails(){
		String details = "Make: " + getMake() + " \nModel: " + getModel() + " \nTop Speed: " + getTopSpeed() + " km/h \nRegistration Number: " + getRegistrationNumber() + " \nDaily Hire Rate: " + getDailyHireRate() + " \nFuel Type: " + getFuel_type() + " \nNumber of Doors: " + getNumber_of_doors() + " \n";
		return details;
	}

	
}
