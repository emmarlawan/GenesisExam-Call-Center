package com.callcenter.main;

import java.util.Iterator;
import java.util.List;

import com.callcenter.bean.ActionResult;
import com.callcenter.bean.Fresher;
import com.callcenter.impl.EmployeeActionImpl;
import com.callcenter.interfaces.EmployeeAction;

public class Call implements Runnable {
	
	private List<Fresher> freshers;

	public Call(List<Fresher> freshers) {
		this.freshers = freshers;
	}
	
	@Override
	public void run() {
		pickUpCall();
	}
	
	private void pickUpCall() {
		Iterator<Fresher> iterate = freshers.iterator();
		boolean available = false;
		EmployeeAction actions = new EmployeeActionImpl();
		
		//Check all fresher availability
		while (iterate.hasNext()) {
			Fresher fresher = iterate.next();
			available = fresher.isAvailable();
			if (available) {
				System.out.println(fresher.getName() + " is available");
				//Set available to false assuming that being available he/she have taken the call
				fresher.setAvailable(false);
				ActionResult ar = actions.solveProblem(fresher);
				fresher = (Fresher) ar.getEmployee();				
				if (!ar.isSolved()) {
					actions.escalate(fresher.getHigherUp());
				}
				break;
			} else {
				System.out.println(fresher.getName() + " is not available");
			}
		}
		
		if (!available) {	
			//Escalate to default fresher higher up
			actions.escalate(new Fresher().getHigherUp());
		}
	}
	

}
