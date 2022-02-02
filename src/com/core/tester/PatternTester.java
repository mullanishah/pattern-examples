package com.core.tester;

import com.core.patterns.PatternOne;

public class PatternTester {

	public static void main(String[] args) {
		
		PatternOne.patternFirst(7);
		line();
		PatternOne.patternSecond(7);
		line();
		PatternOne.patternThird(7);

	}
	
	public static void line() {
		System.out.println();
	}

}
