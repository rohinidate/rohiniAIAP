package myPack1;

class ABC
{
	void Login() {
		System.out.println("Login with Email ID");
	}
}

public class MethodOverride extends ABC{

	void Login() {
		super.Login();
		System.out.println("Login with Mobile Number");
	}
	public static void main(String[] args) {
		MethodOverride m= new MethodOverride();
		m.Login();

		
	}

}
