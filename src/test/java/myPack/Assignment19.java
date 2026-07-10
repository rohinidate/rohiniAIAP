package myPack;

import java.util.Scanner;

public class Assignment19 {

	//WAP using switch case to display days of the week:1 for Monday,2 for Tuesday etc 7 for Sunday.
	//if the input is not in between 1-7 ,print "Invalid Day"
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the day number between(1-7) : ");
//
//		int day = sc.nextInt();
		
		int day = 3;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid Day");

		}
		//sc.close();
	}

}
