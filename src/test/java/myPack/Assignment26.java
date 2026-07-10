package myPack;

import java.util.Scanner;

public class Assignment26 {

	// Develop Calculator logic using scanner class and switch case.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();

		System.out.println("Enter your Choice between(1-5)");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Addition " + (num1 + num2));
			break;
			
		case 2:
			System.out.println("Subtraction " + (num1 - num2));
			break;
			
		case 3:
			System.out.println("Multiplication " + (num1 * num2));
			break;

		case 4:
			if(num2 !=0) {
				System.out.println("Division " + (num1 / num2));
			}
			else {
				System.out.println("Division by 0 is not allowed");
			}
			
			break;
			
		case 5:
			if(num2 !=0) {
				System.out.println("Modulus " + (num1 % num2));
			}
			else
			{
				System.out.println("Modulus by 0 is not allowed");
			}
			
			break;
			
			default : 
				System.out.println("Invalid Choice");
			
		}
		
		sc.close();

	}

}
