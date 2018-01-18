package com.callcenter.bean;

public class TeamLead extends Employee {
	
	private static TeamLead instance = null;
	
	private TeamLead() {
		setName("Jonh Joe");
		setHigherUp(ProjectManager.getInstance());
		setAvailable(true);
	}
	
	public static TeamLead getInstance() {
	      if(instance == null) {
	         instance = new TeamLead();
	      }
	      return instance;
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
	
	@Override
	public boolean isAvailable() {
		return super.isAvailable();
	}

}
