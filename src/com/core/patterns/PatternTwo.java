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
			
			//int noOfCols = noOfElements - noOfSpaces;
			for(int col = 0; col < (noOfElements - row); col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternEighth(int noOfRows) { 
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpaces = noOfRows - row;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			
			int noOfCols = (2 * row) + 1;
			for(int col = 0; col < noOfCols; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternNinth(int noOfRows) {
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpaces = row;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			
			int noOfCols = (2 * noOfRows) - (2 * row + 1);
			for(int col = 0; col < noOfCols; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternTenth(int noOfRows) {
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpaces = noOfRows - row;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			
			int noOfCol = row + 1;
			for(int col = 0; col < noOfCol; col++) {
				String extraSpace = "  ";
				System.out.print("* " + extraSpace);
			}
			System.out.println();
		}
	}
}
