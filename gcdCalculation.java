/* Adedayo Adebanjo							`
 * COSC 2336
 * 09/25/2020
 * Purpose: To create a recursive method to calculate GCD and test it(Problem 1) */
package Recursion;

/**
 * @author aaded
 *
 */

import java.util.Scanner;

/**This class will generate a recursive method to calculate GCD and create a method to test it.*/
public class gcdCalculation {
	
	/** This is the recursive method that calculates the GCD
	 * 
	 * @param a - first number
	 * @param b - second number
	 * @return - returns a when b is reduced to 0, but before that, 
	 * repeat the recursive method to keep reducing the numbers
	 */
	public static int calculateGCD(int a, int b) {
		if(b == 0)
			return a;
		return calculateGCD(b, a%b); // the remainder, r, is calculated by diving a by b and taking the remainder
	}
	
	
	/**
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in); // Creating a scanner to read input
		
		// Prompting User to enter their input
		System.out.println("Please enter the first and second numbers respoectively: ");
		// Reading in users input
		int a = myInput.nextInt();
		int b = myInput.nextInt();
		
		// Calculating the result of the GCD using the method above
		int result = calculateGCD(a,b);
		System.out.println("The GCD of "+a+ " and "+b+ " is "+result); // Output	
		
		//close the scanner
		myInput.close();
		
	}

}
