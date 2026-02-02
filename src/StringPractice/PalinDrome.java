package StringPractice;

public class PalinDrome {
public static void main(String[] args) {
	
	String s = "madam";
	
	boolean isPalindrome= true;
	
	s=s.toLowerCase();
	
	for(int i=0;i<=s.length()/2;i++) {
		if(s.charAt(i) != s.charAt(s.length()-1-i)) {
			isPalindrome=false;
			break;
		}
	}
	
	if(isPalindrome) {
		System.out.println("String Is PalinDrome");
	}
		else {
			System.out.println("Not PalinDrome");
		}
	}
}

