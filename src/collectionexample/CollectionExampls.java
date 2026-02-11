package collectionexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExampls {

	
	public static void main(String[] args) {
		
	Collection<Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(null);
		ar.add(20);
		
		System.out.println("Original list"+ar);
		
		Iterator<Integer> itr=ar.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		System.out.println(ar.add(20));
		
//		
		Collection<Integer> b= new ArrayList<Integer>();
		b.add(55);
		b.add(67);
		b.addAll(ar);
		
		System.out.println(b);
		
//		b.removeAll(ar);
//		System.out.println(b);
//		b.clear();
//		System.out.println(b);
//		b.retainAll(ar);
//		System.out.println(b);

		
		
		
		
	}
}
