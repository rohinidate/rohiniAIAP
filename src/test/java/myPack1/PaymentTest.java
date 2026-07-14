package myPack1;
class Payment
{
	void pay() {
		System.out.println("Processing Payment ...........");
	}
}
class CreditCard extends Payment
{
	void pay() {
		System.out.println("Payment Done by Credit Card.");
	}
}
class UPI extends Payment{
	void pay() {
		System.out.println("Payment Done by UPI.");
	}
}
public class PaymentTest  {

	public static void main(String[] args) {
		Payment p =new Payment();
		p.pay();
		p=new CreditCard();
		p.pay();
		p=new UPI();
		p.pay();
	

	}

}
