package StringPractice;

public class Length {

	
	public static void main(String[] args) {
		
	
	String s="jainish";
	char[] c= s.toCharArray();
	
	int count=0;
	
	for(char j : c) {
		System.out.println(j);
		count++;
	}
	
	System.out.println(count);
	}
}
