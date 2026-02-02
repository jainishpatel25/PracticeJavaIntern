package StringPractice;

import java.lang.*;

public class StringBufferExample {
public static void main(String[] args) {
	
//	StringBuffer sb = new StringBuffer("hello world");	
//	StringBuffer sb1 = new StringBuffer("hello world");
//	
//	System.out.println(sb1.equals(sb));
	
//	StringBuffer sb = new StringBuffer("hello world");	
//	StringBuffer sb1 = sb;
//	
//	System.out.println(sb1.equals(sb));

	
String s="jainish";
String s2="jainish";
String s1 = new String("jainish");
String s3=s1.intern();
String s5="ajndasbidadbaisj";
//System.out.println(s==s1);
//System.out.println(s == s2);
//System.out.println(s1==s3); //false
//System.out.println(s3==s);

//System.out.println("ajndasbidadbaisj".intern() == s5);
System.out.println("ajndasbidadbaisj".intern() == s5);
	
}
}
