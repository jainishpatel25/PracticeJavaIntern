package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
//		
//		ArrayList<Integer> ar = new ArrayList<>();
//		
//		ar.add(10);
//		ar.add(20);
//		ar.add(30);
//		ar.add(40);
//		ar.add(50);
//		ar.add(null);
//		ar.add(20); 
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
	
//		System.out.println("Normal List" +ar);
//		System.out.println( "Contain method: "+ar.contains(20));
//		System.out.println("Last Index Element: " +ar.lastIndexOf(20));
//		ar.remove(3);
//		System.out.println("Remove Element: " +ar);
//		ar.removeAll(ar);
//		System.out.println(ar);
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
	
		
		// 1. Default Constructor
        // Initial capacity is 10; size is 0.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");

        // 2. Initial Capacity Constructor
        // We set the capacity to 50 because we expect a lot of data.
        // This prevents the internal array from "growing" (copying) frequently.
        ArrayList<String> list2 = new ArrayList<>(50);
        list2.add("C++");
        list2.add("Rust");

        // 3. Collection Constructor
        // We take an existing collection 
        
        ArrayList<String> existingData = new ArrayList<>();
        existingData.add("html");
        existingData.add("js");
        existingData.add("css");
        ArrayList<String> list3 = new ArrayList<>(existingData);

        // Printing results
        System.out.println("List 1 (Default): " + list1);
        System.out.println("List 2 (Capacity): " + list2);
        System.out.println("List 3 (Collection): " + list3);
		
		
	}

}
