package collectionexample;

import java.util.Queue;
import java.util.TreeSet;

public class TreeSetComparator {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> num = new TreeSet<>(new DescendingComparator());		

		num.add(12);
		num.add(52);
		
		num.add(22);
		num.add(42);
		num.add(32);
		
		System.out.println(num);
//		System.out.println(num.ceiling(25));

		
//		TreeSet<StringBuilder> t = new TreeSet<>();
//		
//		t.add(new StringBuilder("L"));
//		t.add(new StringBuilder("E"));
//		t.add(new StringBuilder("R"));
//		t.add(new StringBuilder("K"));
//		t.add(new StringBuffer("C") );
//		t.add(new StringBuffer("L"));
//		t.add("B");
//		t.add("B");
//		t.add("B");
		
		
		
//		System.out.println(t);
		
 		
	}
}
