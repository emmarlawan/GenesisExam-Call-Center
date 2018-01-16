package com.callcenter.main;

import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.callcenter.model.Fresher;

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
		
		//Check all fresher availability
		while (iterate.hasNext()) {
			Fresher fresher = iterate.next();
			available = fresher.isAvailable();
			if (available) {				
				if (!fresher.solveProblem()) {
					fresher.escalate(fresher.getHigherUp());
				}
				break;
			}			
		}
		
		if (!available) {	
			//Escalate to default fresher higher up
			new Fresher().escalate(new Fresher().getHigherUp());
		}
	}
	

}
