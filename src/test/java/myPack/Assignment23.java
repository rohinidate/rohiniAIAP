package myPack;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WAP to calculate area & Perimeter using scanner class for triangle

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hight :");
		int h = sc.nextInt();
		System.out.println("Enter base :");
		int b = sc.nextInt();
		double area = 0.5 * h * b;

		System.out.println("Area of Triangle is - " + area);

		System.out.println("Enter First side : ");
		int side1 = sc.nextInt();
		System.out.println("Enter Second side : ");
		int side2 = sc.nextInt();
		System.out.println("Enter Third side : ");
		int side3 = sc.nextInt();

		double perimeter = side1 + side2 + side3;
		System.out.println("Perimeter of Triangle is : " + perimeter);

		sc.close();

	}

}
