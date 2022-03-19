package com.core.patterns;

/**
 * @author Shahrukh
 * @since 27-Feb-2022
 */
public class PatternFour {
	
	public static void patternSixteen(int totalRows) {
		
		for(int currentRow = 1; currentRow <= totalRows; currentRow++) {
			
			int totalSpacesInRow = totalRows - currentRow;
			for (int spaces = 0; spaces < totalSpacesInRow; spaces++) {
				System.out.print(" ");
			}
					
			int nextElement = 1;
			for(int currentCol = 1; currentCol <= currentRow; currentCol++) {
				System.out.print(nextElement + " ");
				nextElement = nextElement * (currentRow - currentCol) / currentCol;
			}
			System.out.println();
		}
	}
	
	public static void patternSeventeen(int maxValue) {
		
		for(int currentRow = 0; currentRow <= 2 * maxValue; currentRow++) {
			
			int elementsInRow = (currentRow > maxValue) ? (2 * maxValue) - currentRow : currentRow;
			
			for(int spaces = 0; spaces < maxValue - elementsInRow; spaces++) {
				System.out.print("  ");
			}
			
			for(int column = elementsInRow; column >= 1; column--) {
				System.out.print(column + " ");
			}
			
			for (int rColumn = 2; rColumn <= elementsInRow; rColumn++) {
				System.out.print(rColumn + " ");
			}
			System.out.println();
		}
	}
}
