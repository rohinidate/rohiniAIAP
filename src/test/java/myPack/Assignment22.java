package myPack;

import java.util.Scanner;

public class Assignment22 {

	//WAP to calculate  area & circumference using scanner class for Circle
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter tour Circles Redius : ");
		int r=sc.nextInt();
		
		double area = Math.PI*r*r;
		System.out.println("Area of your Circle :"+area);
		 
		double circumference = 2*Math.PI*r;
		System.out.println("Circumference of your Circle : "+circumference);
		
		sc.close();
	}
}
