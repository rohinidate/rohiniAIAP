package myPack;

public class Assignment_9 {

	// WAP overload both methods[static and non-static] and the constructor in a
	// single program

	static void add() {
		int a = 20;
		int b = 20;
		int c = a + b;
		System.out.println("Addition : " + c);

	}

	static void add(int a, int b) {

		int c = a + b;
		System.out.println("Addition : " + c);

	}

	void subtract() {
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println("Subtraction : " + c);
	}

	void subtract(int a, int b) {

		int c = a - b;
		System.out.println("Subtraction : " + c);
	}

	Assignment_9() {
		this('r');
		System.out.println("Cunstructor1");
	}

	Assignment_9(char a) {
		System.out.println("Cunstructor2");
	}

	void multiply() {
		System.out.println("Multiplication");
	}
	void multiply(int a, int b) {
		
		int c=a*b;
		System.out.println("Multiplication : " +c);
		
	}
	void multiply(double a, double b) {
		double c = a*b;
		System.out.println("Multiplication : " +c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(200, 300);
		Assignment_9 a = new Assignment_9();
		// new Assignment_9('x'); //if I want to call constructor without using this();
		a.subtract();
		a.subtract(500, 200);
		a.multiply();
		a.multiply(10,5);
		a.multiply(12.12, 55.5);
		
	}

}
