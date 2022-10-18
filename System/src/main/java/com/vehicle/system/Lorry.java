package com.vehicle.system;

public class Lorry extends Vehicle{
	
	private double loadingCapacity;
	
	public Lorry(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, double loadingCapacity) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate);
		this.loadingCapacity = loadingCapacity;
	}

	public double getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(int loading_capacity) {
		this.loadingCapacity = loading_capacity;
	}
	
}
