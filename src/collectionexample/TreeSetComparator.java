package collectionexample;

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
	}
}
