package collectionexample;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(null);
		ar.add(20); 
//		System.out.println(ar.add(20));
		
//		
//		ArrayList<Integer> b= new ArrayList<Integer>();
//		b.add(55);
//		b.addAll(ar);
//		b.add(67);
//		System.out.println(b);
		
//		ar.add(3, 99);  
		
		
//		for(Integer i : ar) {
//			System.out.println("ArrayList: " +i);
//		}
//		
	
		System.out.println("Normal List" +ar);
//		System.out.println( "Contain method: "+ar.contains(20));
//		System.out.println("Last Index Element: " +ar.lastIndexOf(20));
		ar.remove(3);
		System.out.println("Remove Element: " +ar);
		ar.removeAll(ar);
		System.out.println(ar);
//		ar.removeFirst();
//		System.out.println(ar);
//		ar.clear();
//		System.out.println(ar);
		
//		System.out.println(ar.size());	
//		
//		ar.addFirst(89);
//		System.out.println(ar);
//		System.out.println(ar.size());
//		
//		System.out.println("Index: " +ar.indexOf(50));
//		
//		System.out.println("");
//		
		
		
		
	}

}
