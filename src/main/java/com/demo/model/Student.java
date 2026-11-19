package com.demo.model;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private String city;
	private double percentage;
	private List<Address> addresses;

	// Setter with multiple addresses
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + ", addresses="
				+ addresses + "]";
	}

	// Setter for Single Reference
	/*
	 * private Address address;
	 * 
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 * 
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + ", city=" + city + ", percentage=" + percentage + ", address=" +
	 * address + "]"; }
	 */

	public List<Address> getAddresses() {
		return addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
