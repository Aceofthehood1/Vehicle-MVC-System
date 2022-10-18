package com.vehicle.system;

public class MiniBus extends Vehicle{
	
	private int seating_capacity;
	private int intended_passengers;
	
	public MiniBus(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, int seating_capacity, int intended_passengers) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate);
		this.seating_capacity = seating_capacity;
		this.intended_passengers = intended_passengers;
	}

 int getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public int getIntended_passengers() {
		return intended_passengers;
	}

	public void setIntended_passengers(int intended_passengers) {
		this.intended_passengers = intended_passengers;
	}
}
