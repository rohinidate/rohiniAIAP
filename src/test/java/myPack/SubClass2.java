package myPack;

public class SubClass2 extends SuperClass1{

	void show2() {
		System.out.println("Sub Class2 property");
	}
	
	public static void main(String[] args) {
		SubClass2 s = new SubClass2();
		s.show2();
		s.show();
	}
}
