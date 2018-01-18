package com.callcenter.bean;

public class Employee {

	private String name;
	private Employee higherUp;
	private boolean available;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getHigherUp() {
		return higherUp;
	}

	public void setHigherUp(Employee higherUp) {
		this.higherUp = higherUp;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}		
	
}
