package myPack;

public class Assignment_10 {

	// WAP on Local Variable, Global Variable

	double pi = 3.14; // Global Variable
	double area; // Global Variable

	void calculateAreaOfCircle() {

		int r = 10; // Local Variable
		area = pi * r * r;

		System.out.println("Area Of Circle :"+area);
	}

	void calculateAreaOfSquare() {

		int side = 5; // Local Variable
		area = side * side;

		System.out.println("Area Of Square :"+area);
	}

	void calculateAreaOfRectangle() {

		int length = 10; // Local Variable
		int breadth = 5; // Local Variable
		area = length * breadth;

		System.out.println("Area Of Rectangle :" +area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_10 obj = new Assignment_10();
		obj.calculateAreaOfCircle();
		obj.calculateAreaOfSquare();
		obj.calculateAreaOfRectangle();

	}

}
