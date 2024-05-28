//Using switch case create simple calculator.

package codingtest;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {                    // main method
		  
		        Scanner scanner = new Scanner(System.in);       // Create  Scanner object to read input

		        System.out.println("Simple Calculator");        // chose the operation in simple calculator
		        System.out.println("Choose an operation:");     // Display menu options to the user
		        System.out.println("1. Addition");              
		        System.out.println("2. Subtraction");
		        System.out.println("3. Multiplication");
		        System.out.println("4. Division");
		        
		        
		        int choice = scanner.nextInt();
		        
		        System.out.println("Enter the first number:");    //user to enter two numbers
		        double num1 = scanner.nextDouble();
		        System.out.println("Enter the second number:");
		        double num2 = scanner.nextDouble();
		        
		        double result = 0;

		        
		        switch (choice) {                                  // user choice operation
		            case 1:
		                result = num1 + num2;                      // Addition
		                break;
		            case 2:
		                result = num1 - num2;                      // Subtraction
		                break;
		            case 3:
		                result = num1 * num2;                      // Multiplication
		                break;
		            case 4:
		                if (num2 != 0) { 
		                    result = num1 / num2;                  // Division
		                } else {
		                    System.out.println(" Division by zero is not allowed ");
		                  
		                }
		                break;
		            default:
		                System.out.println(" choice not found ");
		                
		        }
		        System.out.println("The result is: " + result);
		        
		
	}

}
