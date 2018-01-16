package com.callcenter.model;

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
	public void escalate(Employee employee) {
		System.out.println("Calling Project Manager...");
		super.escalate(employee);
	}
	
	@Override
	public boolean isAvailable() {
		//Override isAvailable function to call escalation if TL is not available
		boolean result = super.isAvailable();
		if (!result) {
			super.escalate(getHigherUp());
		}
		return result;
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
