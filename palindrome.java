/* Adedayo Adebanjo							`
 * COSC 2336
 * 09/25/2020
 * Purpose: To create a recursive method to check if a reversed string meets the palindrome rules(Problem 2) */

package Recursion;

/**
 * @author aaded
 *
 */

import java.util.Scanner;

/**This class will generate a recursive method to check if the input meets the palindrone rule.*/
public class palindrome {
	
	
	/**This is the recursive method to check the palindrone requirement.
	 * 
	 * @param s This is the input we are trying to check
	 * @return return true if requirements are met, else return false
	 */
	public static boolean palindrome(String s) {
		 if(s.length() == 0 ||s.length()==1){ // If the word is down to this, then it's true
	         return true;
	      }
		 
		// We keep checking a letter at a time; If it breaks out of this then it's false
	      if(s.charAt(0) == s.charAt(s.length()-1)){ 
	         return palindrome(s.substring(1, s.length()-1));
	      }
	      return false;
	   }
	   public static void main(String args[]){
		  Scanner myInput = new Scanner(System.in); // Creating a scanner to read input
		  System.out.print("Please enter the word: ");
		  String input = myInput.next(); // Reading in users input
	      if (palindrome(input)){ // Using the recursive method test users input and return yes for true
	         System.out.println("Yes");
	      }else{ // Return no for false
	         System.out.println("No");
	      }
	      
	    //close the scanner
		myInput.close();
	   }
	}