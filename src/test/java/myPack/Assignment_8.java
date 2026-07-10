package myPack;

public class Assignment_8 {

	// WAP overload constructors
	// This Statement

	Assignment_8() {
		this(12);
		System.out.println("Constructor1");
	}

	Assignment_8(int a) {
		this("Rohini");
		
		System.out.println("Constructor2");
		
	}

	Assignment_8(String a) {
		this (100,50);
		
		System.out.println("Constructor3");

	}

	Assignment_8(int a, int b) {
		this("Rohini","Date");
		System.out.println("Constructor4");

	}

	Assignment_8(String a, String b) {

		System.out.println("Constructor5");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Assignment_8();
		 // for Constructor calling we can create object "Assignment_8 a=new Assignment_8();" or "new Assignment_8();"
//		 new Assignment_8(10);
//		 new Assignment_8("Rohini");
//		 new Assignment_8(10,20);
//		 new Assignment_8("Rohini","Date");
		 
	}

}
