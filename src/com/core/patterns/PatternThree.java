package com.core.patterns;

import java.util.Iterator;

/**
 * @author Shahrukh
 * @since 17-Feb-2022
 */
public class PatternThree {
	
	public static void PatternEleventh(int noOfRows) {
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpace = (noOfRows + row) - noOfRows;
			for(int space = 0; space < noOfSpace; space++) {
				System.out.print("  ");
			}
			
			int noOfCol = noOfRows - row;
			for(int col = 0; col < noOfCol; col++) {
				String extraSpace = "  ";
				System.out.print("* " + extraSpace);
			}
			System.out.println();
		}
	}
	
	/*
	 * Sandglass star pattern
	 */
	public static void PatternTwelth(int maxElementsInRow) {
		for(int currentRow = 0; currentRow < (maxElementsInRow * 2); currentRow++) {
			
			int colsInRow = (currentRow < maxElementsInRow) ? (maxElementsInRow - currentRow) : (currentRow - maxElementsInRow + 1);
			
			for(int space = 0; space < maxElementsInRow - colsInRow; space++) {
				System.out.print(" ");
			}
			
			for (int currentCol = 0; currentCol < colsInRow; currentCol++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
