package com.callcenter.bean;

public class Employee {

	private String name;
	private Employee higherUp;
	private boolean available;
//	
//	//Determine if employee is available
//	public boolean isAvailable() {
//		//store available result 
//		boolean result = available;
//		
//		//Uncomment if you want a randomize availability of employee
////		Random dice = new Random();
////		boolean result = dice.nextBoolean();
//		if (available) {
//			//Set available to false assuming that being available he/she have taken the call
//			setAvailable(false);
//			System.out.println(getName()+ " is available");
//		} else {
//			System.out.println(getName()+ " is not available");
//		}
//		return result;
//	}
//	
//	//Determine if problem can be solved by employee
//	public boolean solveProblem() {
//		boolean result = Randomizer.randomGenerator();
//		if (!available) {
//			//Set available to true assuming that after trying to solve the problem the call will end either it was solved or not
//			setAvailable(true);
//		}
//		if (result) {
//			System.out.println(getName()+ " solved problem");
//		} else {
//			System.out.println(getName()+ " can't solve sroblem");
//		}
//		return result;
//	}	
//	
//	//Escalate problem to employee's higher up
//	public void escalate(Employee employee) {
//		if (employee.isAvailable()) {
//			if (!employee.solveProblem()) {
//				employee.escalate(employee.getHigherUp());
//			}
//		}
//	}
	
	

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
