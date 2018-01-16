package com.callcenter.model;

public class Fresher extends Employee {
	
	public Fresher() {
		setHigherUp(TeamLead.getInstance());
	}
	
	public Fresher(String name) {
		setName(name);
		setHigherUp(TeamLead.getInstance());
		setAvailable(true);
	}
	
	@Override
	public void escalate(Employee employee) {
		System.out.println("Calling Team Lead...");
		super.escalate(employee);
	}
	
	@Override
	public boolean isAvailable() {
		return super.isAvailable();
	}
	
	@Override
	public boolean solveProblem() {
		return super.solveProblem();
	}	
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public void setHigherUp(Employee higherUp) {
		super.setHigherUp(higherUp);
	}
	
	@Override
	public Employee getHigherUp() {
		return super.getHigherUp();
	}
	
	@Override
	public void setAvailable(boolean available) {
		super.setAvailable(available);
	}
	
}
