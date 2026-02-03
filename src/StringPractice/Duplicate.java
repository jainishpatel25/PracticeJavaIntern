package StringPractice;

public class Duplicate {

	
	public static void main(String[] args) {
		String str="jaaainiishhh";
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			boolean exists = false;
			for (int j = 0; j < result.length(); j++) {
			    if (result.charAt(j) == ch) {
			        exists = true;
			        break;
			    }
			}
			if (!exists) {
			    result += ch;
			}
//			if (!result.contains(String.valueOf(c))) {
//			    result += c;
//			}

		}
		System.out.println(result);
		System.out.println("Result");
	}
}
