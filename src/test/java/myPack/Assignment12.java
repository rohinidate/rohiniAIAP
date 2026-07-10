package myPack;

public class Assignment12 {

	// In same cases variable is present both locally and globally then?
	static int a = 10; // Global static variable
	String str = "rohini"; // Global non-static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100; // Local variable having same variable name as Global Variable
		String str = "Date"; // Locale variable having same variable name as Global Variable
		System.out.println(a);
		System.out.println(str);

		System.out.println(Assignment12.a = 50); // Static Global variable call

		Assignment12 obj = new Assignment12();
		System.out.println(obj.str = "Vansh"); // Non-Static Global variable call

	}

}
