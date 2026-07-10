package myPack;

public class Assesment36 extends Parent {

	//WAP on Single Level Inheritance
	 void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println("Subtraction comes from Child class : "+c);
		
	}
    
	public static void main(String[] args) {
		Assesment36 obj= new Assesment36();
		obj.add();
		obj.sub();
		
	}

}
