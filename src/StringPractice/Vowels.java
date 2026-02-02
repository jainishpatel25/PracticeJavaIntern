package StringPractice;

public class Vowels {

	public static void main(String[] args) {
		
		String s= "jainishPATEL";
		s=s.toLowerCase();
		int count=0;
		
		
		for(int i=0; i<= s.length()-1 ; i++) 
		{
			
			char c = s.charAt(i);
		
			if( c =='i'|| c =='a'|| c =='u'|| c =='o'||c =='e' ) {
			count++;
		}
		}
		
		System.out.println("Vowels : " +count);
	}
	
}
