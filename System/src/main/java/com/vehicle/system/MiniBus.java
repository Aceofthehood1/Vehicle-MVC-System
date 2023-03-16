package com.vehicle.system;

public class MiniBus extends Vehicle{
	
	private int seating_capacity;
	private boolean rented = false;
	public MiniBus(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, boolean rented, int seating_capacity) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate, rented);
		this.seating_capacity = seating_capacity;
	}

 public int getSeatingCapacity() {
		return seating_capacity;
	}

	public void setSeatingCapacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public boolean getRented(){
		return rented;
	}

	public void setRented(boolean rented){
		this.rented = rented;
	}

	public String getDetails(){
		String details = "Make: " + getMake() + "\nModel: " + getModel() + "\nTop Speed: " + getTopSpeed() + " km/h \nRegistration Number: " + getRegistrationNumber() + "\nDaily Hire Rate: " + getDailyHireRate() + "\nSeating Capacity: " + getSeatingCapacity() + "\n";
		return details;
	}
}
