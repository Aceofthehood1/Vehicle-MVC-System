package com.vehicle.system;

public class Lorry extends Vehicle{
	
	private int loading_capacity;
	private double load_weight;
	
	public Lorry(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate, int loading_capacity, double load_weight) {
		super(make, model, topSpeed, registrationNumber, dailyHireRate);
	}

	public int getLoading_capacity() {
		return loading_capacity;
	}

	public void setLoading_capacity(int loading_capacity) {
		this.loading_capacity = loading_capacity;
	}

	public double getLoad_weight() {
		return load_weight;
	}
	
	public void setLoad_weight(double load_weight) {
		this.load_weight = load_weight;
	}
	
}
