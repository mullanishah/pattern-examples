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

	/*
	 * Here, imagine a section as a separate 90 degree triangle, so there are 4 sections in total.
	 */
	public static void patternEighteen(Integer elementsInASection) {

		for(int currentRow = 0; currentRow < 2 * elementsInASection; currentRow++) {

			int elementsInRow = (currentRow >= elementsInASection) ? ((currentRow - elementsInASection) + 1) : (elementsInASection - currentRow);
			for(int column = 0; column < elementsInRow; column++) {
				System.out.print("* ");
			}

			int spacesInRow = (currentRow >= elementsInASection) ? ((elementsInASection - elementsInRow) * 2) : (currentRow * 2);
			for(int spaces = 0; spaces < spacesInRow; spaces++) {
				System.out.print("  ");
			}

			for(int column = 0; column < elementsInRow; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/**
	 * @param maxElements
	 * @return void
	 */
	public static void patternTwenty(Integer maxElements) {

		for(int currentRow = 0; currentRow <= maxElements; currentRow++) {
			
			for(int column = 0; column <= maxElements; column++) {
				
				if(currentRow == 0 || currentRow == maxElements) {
					
					System.out.print("*");
				}else if(column == 0 || column == maxElements) {
					
					System.out.print("*");
				} else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}

	/**
	 * Here, imagine a section as a separate 90 degree triangle, so there are 4 sections in total.
	 * @param 
	 * @return void
	 * @param i
	 */
	public static void patternNineteen(Integer rowsInSection) {
		
		
	}

}
