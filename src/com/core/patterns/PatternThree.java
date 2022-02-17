package com.core.patterns;

/**
 * @author Shahrukh
 * @since 17-Feb-2022
 */
public class PatternThree {
	
	public static void PatternEleventh(int noOfRows) {
		
		for(int row = 0; row < noOfRows; row++) {
			
			int noOfSpace = (noOfRows + row) - noOfRows;
			for(int space = 0; space < noOfSpace; space++) {
				System.out.print(" ");
			}
			
			int noOfCol = noOfRows - row;
			for(int col = 0; col < noOfCol; col++) {
				String extraSpace = " ";
				System.out.print("*" + extraSpace);
			}
			System.out.println();
		}
	}

}
