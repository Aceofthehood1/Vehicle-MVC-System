package com.vehicle.system;

import java.io.Serializable;

public class Vehicle implements Serializable{
	
	protected String make;
	protected String model;
	protected double topSpeed;
	protected String registrationNumber;
	protected double dailyHireRate;
	

	public Vehicle(String make, String model, double topSpeed, String registrationNumber, double dailyHireRate) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.registrationNumber = registrationNumber;
		this.dailyHireRate = dailyHireRate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	double getDailyHireRate() {
		return dailyHireRate;
	}

	public void setDailyHireRate(double dailyHireRate) {
		this.dailyHireRate = dailyHireRate;
	}
	
}
