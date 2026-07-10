package myPack;

public class Assignment16 {

	//Write a Program on nested if Else Block_Case
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =18;
		boolean voterID =true;
		
		if(age>=18) {
			
			if(voterID) {
				System.out.println("You are eligible for voting");
			}
			else
			{
				System.out.println("You are eligible by age, but you need a Voting Card.");
			}
			
		}
		else {
			System.out.println("You are not eligible for voting");
		}

	}

}
