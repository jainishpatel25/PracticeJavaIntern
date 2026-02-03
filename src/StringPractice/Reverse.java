package StringPractice;

public class Reverse {
	
	public static void main(String[] args) {
	
		String s="jainish";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		StringBuffer s1 = new StringBuffer("java");
		System.out.println(s1.reverse());
	}
}
