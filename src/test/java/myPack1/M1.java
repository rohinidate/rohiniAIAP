package myPack1;

class M3
{
	M3()
	{
		this("xyz");
		System.out.println("cons5");
	}
	M3(String s)
	{
	
		System.out.println("cons6");
	}
	
	
}

class M2 extends M3
{
	M2()
	{
		this(123.978);
		System.out.println("cons3");
	}
	
	M2(double d)
	{
		
		super("xyz");
		System.out.println("cons4");
	}
}
public class M1 extends M2 {

	M1()
	{
		
		this('r');
		System.out.println("cons1");
	}
	
	M1(char c)
	{
		super(12.21); 
		System.out.println("cons2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new M1();
	}

}
