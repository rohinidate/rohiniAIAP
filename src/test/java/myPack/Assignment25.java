package myPack;

import java.util.Scanner;

public class Assignment25 {
	//WAP to calculate  area & Perimeter using scanner class for square
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Side of Square : ");
		int side =sc.nextInt();
		
		int area = side*side;
		System.out.println("Area of Square is : "+area);
		
		int perimeter = 4*side;
		System.out.println("Perimeter of Square is : "+perimeter);
		
		sc.close();
	}

}
