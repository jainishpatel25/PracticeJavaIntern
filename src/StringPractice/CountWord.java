package StringPractice;

public class CountWord {

	public static void main(String[] args) {
		
		
		String s="java is best lan";
		int count =0;
		boolean iw = false;
		
		for(int i =0; i<s.length();i++) {
			char c= s.charAt(i);
			
			if(c != ' '&& !iw) {
				iw=true;
				count++;
			}
			else if(c==' '){
				iw=false;
			}
		}
		System.out.println("Word in Given String: " +count);
		
		
	}
	
}
