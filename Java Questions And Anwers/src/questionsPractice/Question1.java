package questionsPractice;

	/*Question:
	Write a program that generates 2 integers between 0 and 100  and prompts the user to enter the answer 
	for the sum of the two random numbers. it should then show whether the user's input is correct or wrong*/

import java.util.Scanner;

public class Question1 {
	
	public static void main(String args[]) {
		int number1;
		int number2;
		
//		Generate random numbers
		number1 = (int) (System.currentTimeMillis()%100);
		number2 = (int) ((System.currentTimeMillis()*3)%99);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the sum of "+number1+" and "+number2);
		int result = input.nextInt();
		int sum = number1 + number2;
		input.close();
		
//		check if answer is correct
		if(number1 + number2 == result) {
			System.out.println("Correct!\nThe sum is: "+sum);
		}
		else {
			System.out.println("Oops! Incorrect\nThe correct answer is "+sum);
		}
	
		
	}

}
