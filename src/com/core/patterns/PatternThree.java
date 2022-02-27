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
	
	/* Reverse Triangle Star Pattern
	 */
	public static void patternFourteen(int noOfRows) {
		
		int colsInFirstRow = 2 * noOfRows - 1;
		for(int firstRow = 0; firstRow < colsInFirstRow; firstRow++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int currentRow = 1; currentRow < noOfRows; currentRow++) {
			int noOfSpacesInRow = (noOfRows + currentRow) - noOfRows;
			for (int space = 0; space < noOfSpacesInRow; space++) {
				System.out.print(" ");
			}
			
			int colsInRow = noOfRows - currentRow;
			for (int col = 0; col < colsInRow; col++) {
				if(col == 0 || col == colsInRow - 1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	/* Diamond star pattern
	 */
	public static void patternFifteen(int maxElementsInRow) {
		
		int totalRows = maxElementsInRow * 2;
		for(int currentRow = 0; currentRow < totalRows; currentRow++) {
			
			int totalSpaces = (currentRow < maxElementsInRow) ? (maxElementsInRow - currentRow) : (currentRow - maxElementsInRow);
			for(int spaces = 0; spaces < totalSpaces; spaces++) {
				System.out.print(" ");
			}
			
			int totalColsInRow = (currentRow > maxElementsInRow) ? (2 * maxElementsInRow - currentRow) : currentRow;
			for (int cols = 0; cols < totalColsInRow; cols++) {
				System.out.print((cols == 0 || cols == totalColsInRow - 1) ? "* " : "  ");
			}
			System.out.println();
		}
	}
}
