package myPack;

public class Assignment11 {

	// how to update the value of local and global variable

	static double pi = 3.14; // Global Variable
	static double area; // Global Variable

	static void calculateAreaOfCircle() {
		int r = 10; // Local Variable
		r = 20; // Updating Local Variable
		pi = 4.14; // Updating Global Variable

		area = pi * r * r;

		System.out.println("Pi : " + pi);
		System.out.println("Radius : " + r);
		System.out.println("Area : " + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculateAreaOfCircle();

	}

}
