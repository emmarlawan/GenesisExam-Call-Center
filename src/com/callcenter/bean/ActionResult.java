package com.callcenter.bean;

public class ActionResult {
	
	private Employee employee;
	private boolean solved;
	public String message;
	
	public ActionResult(Employee employee, boolean solved, String message) {
		this.employee = employee;
		this.solved = solved;
		this.message = message;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public boolean isSolved() {
		return solved;
	}
	public void setSolved(boolean solved) {
		this.solved = solved;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
