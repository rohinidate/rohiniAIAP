package myPack;

import java.util.Scanner;

public class Assignment20 {

	/*
	 * Write a java program which takes 2 numbers a and b from user at run time and
	 * perform below operation: Please use methods from Math class 1.square root of
	 * a 2.maximum 3.minimum 4.a*b 5.a+b 6.a-b 7.Absolute value of a
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int b = sc.nextInt();

		double sqrt = Math.sqrt(a);
		System.out.println("Square root of a : " + sqrt);

		int max = Math.max(a, b);
		System.out.println("Max Number is :" + max);

		int min = Math.min(a, b);
		System.out.println("Min Number is : " + min);

		
		int multiplication = Math.multiplyExact(a, b);
		System.out.println("Multiplication of this two number : - " + multiplication);

		int add = Math.addExact(a, b);
		System.out.println("Addition of this two number : - " + add);

		int sub = Math.subtractExact(a, b);
		System.out.println("Subtraction of this two number : - " + sub);

		int abs = Math.abs(a);
		System.out.println("Absolute value of a : " + abs);

		sc.close();
	}

}
