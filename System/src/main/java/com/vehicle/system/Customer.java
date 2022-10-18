package com.vehicle.system;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private String corporation_name;
	private String address;
	private String phone_number;
	private String email_address;
	private String username;
	private String password;
	
	public Customer(String corporation_name, String address, String phone_number, String email_address, String username,
			String password) {
		this.corporation_name = corporation_name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
		this.username = username;
		this.password = password;
	}

	public String getCorporationName() {
		return corporation_name;
	}

	public void setCorporationName(String corporation_name) {
		this.corporation_name = corporation_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmailAddress() {
		return email_address;
	}

	public void setEmailAddress(String email_address) {
		this.email_address = email_address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
