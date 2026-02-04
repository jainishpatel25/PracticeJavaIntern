package Exception;

public class ATMException { 
	static void withdraw(int balance, int amount) {
		if(amount > balance) {
			throw new ArithmeticException("Low Balance Check the account !!!"); 
			} else { System.out.println("Withdraw successfully"); } }
	//static int withdraw(int balance, int amount) {
	//if(amount > balance) {
//		throw new ArithmeticException("Low Balance Check the account !!!"); 
	//	
//		} 
	//else { System.out.println("Withdraw successfully");
	//} 
	//return balance-amount;
	//}
	
	
	public static void main(String[] args) {
		int balance = 5000;
		try { withdraw(balance, 6000); }
		catch(ArithmeticException r) {
			System.out.println(r);
//			System.out.println("Exception: " + r.getMessage());
		}
		withdraw(balance, 2000);
		}
	

	//with out try catch block				
//		int w = withdraw(300, 440);
//		System.out.println(w);
}
