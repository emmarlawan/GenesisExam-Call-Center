package com.callcenter.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.callcenter.model.Fresher;

public class Main {
	
	public static void main(String[] args) {		
		
		List<Fresher> freshers = createFreshers();
		//get freshers size
		int  freshersSize  =    freshers.size();
		int  maxPoolSize   =   freshersSize;
		
		//Assume 25 callers
		int callers = 25;

		ThreadPoolExecutor callsPool =
		        new ThreadPoolExecutor(
		        		freshersSize,
		                maxPoolSize,
		                0L,
		                TimeUnit.MILLISECONDS,
		                new LinkedBlockingQueue<Runnable>()
		                );
		
		for (int x=0; x<callers; x++) {
			Runnable calls = new Call(freshers);
			callsPool.execute(calls);
		}
		
		callsPool.shutdown();
		
	}
	
	private static List<Fresher> createFreshers() {
		//Create three freshers
		List<Fresher> freshers = new ArrayList<Fresher>();
		freshers.add(new Fresher("Mike"));
		freshers.add(new Fresher("Kobe"));
		freshers.add(new Fresher("Bron"));
		return freshers;
	}
}
