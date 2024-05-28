//Write a program to check whether  string is palindrome or not in java

package codingtest;

import java.util.Scanner;

	public class PalindromeChecker {

	    public static void main(String[] args) {                  // Create a Scanner object to read input from the user
	        
	        Scanner scanner = new Scanner(System.in);

	                                                               // user to enter a string 
	        System.out.println("Enter a string to check if it is a palindrome:");
	        String inputString = scanner.nextLine();

	        
	        boolean isPalindrome = isPalindrome(inputString);

	                                                                         
	       
	        if (isPalindrome) {                                        // Display the result to the user
	            System.out.println("The string \"" + inputString + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
	        }

	     
	        scanner.close();
	    }

	    
	    public static boolean isPalindrome(String str) {
	        
	        str = str.toLowerCase();
	        
	        int left = 0;
	        int right = str.length() - 1;

	        
	        while (left < right) {
	           
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            
	            left++;
	            right--;
	        }

	        
	        return true;
	    }
	}

	
	

	


