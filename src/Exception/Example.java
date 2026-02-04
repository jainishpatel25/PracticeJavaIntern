package Exception;

public class Example {

	public static void main(String[] args) {
		
		
		try {
		String s=null;
		int a=10/0;
		System.out.println(a);
		System.out.println(s);
		s.length();
		}
		catch(NullPointerException e) 
		{
		System.out.println("error in input...");
		}
		catch(ArithmeticException e) {
			System.out.println("Can Not Divide By Zero");
		}
	}
}



