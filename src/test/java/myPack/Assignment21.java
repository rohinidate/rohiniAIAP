package myPack;

import java.util.Scanner;

public class Assignment21 {
	// WAP for two number addition using Scanner class
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a= sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b= sc.nextInt();
		
		int c= a+b;
		System.out.println("Addition of First and Secound Number : " +c);
		
		sc.close();
	}

}
