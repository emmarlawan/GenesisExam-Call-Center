package com.callcenter.util;

import java.util.Random;

public class Randomizer {

	//Random generator for dice
	public static boolean randomGenerator() {
		Random dice = new Random();
		boolean result = dice.nextBoolean();
		
		return result;
	}
	
}
