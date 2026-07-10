package myPack;

public class Assignment_6 {
	
	//WAP overload static methods
	
	static void add() {
		int a= 10;
		int b= 20;
		int c = a+b;
		System.out.println(c);
	}
	
	static void add(int a , int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		add();
		add(100,200);
	}

}
