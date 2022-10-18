package com.vehicle.system;

public class MiniBus extends Vehicle{
	
	private int seating_capacity;
	
	public MiniBus(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, int seating_capacity) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate);
		this.seating_capacity = seating_capacity;
	}

 int getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

}
