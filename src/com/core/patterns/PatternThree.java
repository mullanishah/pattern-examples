package com.core.patterns;

import java.util.Iterator;

/**
 * @author Shahrukh
 * @since 17-Feb-2022
 */
public class PatternThree {
	
	public static void patternEleventh(int noOfRows) {
		
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
	
	/* Sandglass star pattern
	 */
	public static void patternTwelth(int maxElementsInRow) {
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
	
	/* Triangle Star Pattern
	 */
	public static void patternThirteenth(int noOfRows) {
		
		for(int currentRow = 0; currentRow < noOfRows; currentRow++) {
			int noOfSpaces = noOfRows - currentRow;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			
			int elementsInRow = currentRow + 1;
			for(int col = 0; col < elementsInRow; col++) {
				if(col == 0 || col == elementsInRow - 1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		int elementsInRow = 2 * noOfRows + 1;
		for(int lastRow = 0; lastRow < elementsInRow; lastRow++) {
			System.out.print("*");
		}
	}

}
