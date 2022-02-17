package com.core.patterns;

public class PatternTwo {

	public static void patternSixth(int n) {
		
		for(int row = 0; row < n; row++) {
			
			int noOfSpaces = n - row - 1;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
					
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternSeventh(int noOfElements) {
		
		for(int row = 0; row < noOfElements; row++) {
			
			int noOfSpaces = (row + noOfElements) - noOfElements;
			
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			
			for(int col = 0; col < (noOfElements - row); col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//incomplete
	public static void patternEighth(int noOfRows) {
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpaces = (row + noOfRows) - noOfRows;
			
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			
			int noOfCols = noOfRows - noOfSpaces;
			for(int col = 0; col < noOfCols; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
