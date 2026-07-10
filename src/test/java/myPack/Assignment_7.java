package myPack;

public class Assignment_7 {
 
	//WAP overload non-static methods
	 void add() {
		int a =10;
		int b =20;
		int c = a+b;
		
		System.out.println(c);
	}
	
	void add(int a, int b) {
		add();  //non static method we can call in non static method directly by it's name
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Assignment_7 a = new Assignment_7();
		//a.add();
		a.add(100, 200);
		
		
	}

}
