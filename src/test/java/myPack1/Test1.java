package myPack1;
interface A{
	default void show()
	{
		System.out.println("Interface A");
	}
}

interface B{
	default void show()
	{
		System.out.println("Interface B");
	}
}
public class Test1 implements A,B {

	
	public void show()
	{
		System.out.println("Test");
		A.super.show();//Calls A's default method
		B.super.show();//Calls B's default method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t = new Test1();
		t.show();

	}

}
