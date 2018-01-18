package com.callcenter.process;

import com.callcenter.bean.ActionResult;
import com.callcenter.bean.Employee;

public interface EmployeeAction {

	public ActionResult solveProblem(Employee employee);
	public void escalate(Employee employee);
	
}
