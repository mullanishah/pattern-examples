package com.core.patterns;

/**
 * @author Shahrukh
 * @since 19-Jun-2022
 */
public class PatternFive {
	
	public static void patternTwentyOne(Integer n) {
		
		int counter = 0;
		for(int row = 0; row < n; row++) {
			
			for(int column = 0; column <= row; column++) {
				
				System.out.print(++counter + " ");
			}
			System.out.println();
		}
	}
	
	public static void patternTwentyTwo(Integer n) {
		
		for(int row = 1; row <= n; row++) {
			for(int column = 1; column <= row; column++) {
				
				if(((row + column) % 2) == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
