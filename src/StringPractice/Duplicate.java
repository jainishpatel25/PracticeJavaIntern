package StringPractice;

public class Duplicate {

	
	public static void main(String[] args) {
		
		String str="jaaainiishhh";
		
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if (!result.contains(String.valueOf(c))) {
			    result += c;
			}

		}
		System.out.println(result);
	}
}
