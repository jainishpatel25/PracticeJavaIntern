package StringPractice;

public class EqualAndDoubleEquals {
public static void main(String[] args) {
	String s="java";
	String s1="java";
	
	String s3=new String("java");
	
	
//	System.out.print(s==s1);
//	System.out.print(s==s3);
	
//	System.out.println(s.equals(s1));
//	System.out.println(s.equals(s3));
	
	StringBuilder sb = new StringBuilder("End");
	sb.append("world");
	System.out.println(sb);
	
	
	StringBuffer sf = new StringBuffer("Jainish");
	sf.append("patel");
	System.out.println(sf);
//	System.out.println(s.append("world"));
//	
	
}
}
