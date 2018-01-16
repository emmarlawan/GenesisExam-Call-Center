package com.callcenter.model;

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
		System.out.println(getName() + " is Available");
		return true;
	}
	
	@Override
	public boolean solveProblem() {
		// Assuming PM can always solve the problem;
		System.out.println(getName() + " Solved Problem");
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
	
}
