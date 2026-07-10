package myPack;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		// WAP to calculate  area & Perimeter using scanner class for rectangle

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length : ");
		int l= sc.nextInt();
		System.out.println("Enter breadth : ");
		int b= sc.nextInt();
		double area = l*b;
		System.out.println("Area of Rectangle is : "+area);
		
		int perimeter= 2*(l+b);
		System.out.println("Perimeter of Rectangle is : "+perimeter);
		
		sc.close();
	}

}
