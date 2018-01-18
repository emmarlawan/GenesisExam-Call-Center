package com.callcenter.process.impl;

import com.callcenter.bean.ActionResult;
import com.callcenter.bean.Employee;
import com.callcenter.process.EmployeeAction;
import com.callcenter.util.Randomizer;

public class EmployeeActionImpl implements EmployeeAction {

	//Determine if problem can be solved by employee
	@Override
	public ActionResult solveProblem(Employee employee) {
		boolean result = Randomizer.randomGenerator();
		ActionResult ar = null;
		if (!employee.isAvailable()) {
			//Set available to true assuming that after trying to solve the problem the call will end either it was solved or not
			employee.setAvailable(true);
		}
		if (result) {
			ar = new ActionResult(employee, true, "solved problem");
		} else {
			ar = new ActionResult(employee, false, "can't solve problem");
		}
		System.out.println(employee.getName() + " " + ar.getMessage());
		return ar;
	}

	//Escalate problem to employee's higher up
	@Override
	public void escalate(Employee employee) {		
		if (employee != null) {
			System.out.println("Escalating to higher up...");
			//check Employee's higher up availability
			if (employee.isAvailable()) {
				ActionResult ar = solveProblem(employee);
				//Escalate to higher up's higher up if cannot be solved
				if (!ar.isSolved()) {
					escalate(employee.getHigherUp());
				}
			} else {//Escalate immediately to higher up's higher up if not available
				escalate(employee.getHigherUp());
			}
		} else {
			//
			System.out.println("No higher up to escalate to, resolving call");
		}
				
	}

}
