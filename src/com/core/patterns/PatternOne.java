package com.core.patterns;

public class PatternOne {
	
	public static void patternFirst(int rowCount) {
		
		for(int i = 0; i < rowCount; i++) {
			
			for(int j = 0; j < rowCount; j++) {
				
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	
	public static void patternSecond(int rowCount) {
		
		for(int i = 0; i < rowCount; i++) {
			
			for(int j = 0; j < i; j++) {
				
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
