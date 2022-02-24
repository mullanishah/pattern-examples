package com.core.tester;

import com.core.patterns.PatternOne;
import com.core.patterns.PatternThree;
import com.core.patterns.PatternTwo;

public class PatternTester {

	public static void main(String[] args) {
		//executePatternOne();
		//executePatternTwo();
		executePatternThree();
	}
	
	private static void executePatternThree() {
		//PatternThree.PatternEleventh(7);
		PatternThree.PatternTwelth(5);
	}
	
	private static void executePatternTwo() {
		PatternOne.patternFirst(7);
		PatternTwo.patternSixth(7);
		PatternTwo.patternSeventh(7);
		PatternTwo.patternEighth(7);
		PatternTwo.patternNinth(7);
		PatternTwo.patternTenth(7);
	}
	
	private static void executePatternOne() {
		PatternOne.patternFirst(7);
		PatternOne.patternSecond(7);
		PatternOne.patternThird(7);
		PatternOne.patternFourth(7);
		PatternOne.patternFifth(7);
	}
	
	public static void line() {
		System.out.println();
	}

}
