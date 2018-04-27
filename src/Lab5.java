/*	Author: 	John Aoraha
 	Date:		4/26/2018
	Lab Title: 	Lab Number 5
*/

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Factorial Calculator!");

		//Declare variable to allow "continue" option.
		String cont = "y";

		//While loop to allow "continue" option at end of program.
		while (cont.equalsIgnoreCase("y")) {

			System.out.println();
			
			//Prompt user for input.
			System.out.print("Enter an integer from 1 to 20: ");
			
			//Declare variables.
			int num = scan.nextInt();
			int i;
			long factorial = 1;
			
			//If statement to validate user entry (num) is within range. 
			//Highest factorial accurately calculated by application is 20.
			if (num < 1 || num > 20) {
				System.out.println();
				System.out.println("The number " + num + " is not in the range of 1 to 20!");
			} else {
				
				//For loop to calculate factorial based on user entry (num). 
				for (i = 1; i <= num; i++) {

					factorial = (factorial * i);
				}
				//Outpute result and ask user if they want to continue.
				System.out.println();
				System.out.println("The factorial of " + num + " is " + factorial + "!");
				System.out.print("Continue? (y/n): ");
				cont = scan.next();
			}
		}
		//Prompt to indicate end of program. 
		System.out.println("Bye!");
	}
}