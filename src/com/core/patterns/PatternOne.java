package com.core.patterns;

public class PatternOne {
	
	public static void patternFirst(int rowCount) {
		
		for(int row= 0; row < rowCount; row++) {
			
			for(int col = 0; col < rowCount; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static public void patternSecond(int rowCount) {
		
		for(int row= 0; row < rowCount; row++) {
			
			for(int col = 0; col < row; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternThird(int n) {
		
		for(int row = 0; row < n; row++) { 
			
			for(int col = 0; col < n-row; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static public void patternFourth(int n) {
		
		for(int row = 1; row <= n; row++) {
			
			for(int col = 1; col <= row; col++) {
				
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
