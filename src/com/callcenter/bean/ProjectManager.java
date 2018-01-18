package com.callcenter.bean;

public class ProjectManager extends Employee {

	private static ProjectManager instance = null;
	
	private ProjectManager() {
		setName("Don Juan");
		setAvailable(true);
	}
	
	public static ProjectManager getInstance() {
	      if(instance == null) {
	         instance = new ProjectManager();
	      }
	      return instance;
	   }
	
	@Override
	public boolean isAvailable() {
		// Assuming PM always available;		
		return true;
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
	public void setAvailable(boolean available) {
		super.setAvailable(available);
	}
	
	@Override
	public void setHigherUp(Employee higherUp) {
		super.setHigherUp(higherUp);
	}
	
	@Override
	public Employee getHigherUp() {
		return super.getHigherUp();
	}
	
}
