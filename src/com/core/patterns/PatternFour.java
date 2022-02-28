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
}
