package collectionexample;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorExample {
	
	
//	@FunctionalInterface
//	interface Vechicle{
//		void start();
//		void stop();
//	}
	
	public static void main(String[] args) {
	
	       // 1. INITIALIZATION
        // Initial capacity of 5, increments by 2 when full
        Vector<String> vec = new Vector<>(5, 2);

        // 2. ADDING ELEMENTS
        vec.add("Python");            // Standard add
        System.out.println("first element add : " +vec);
        vec.addElement("Java");       // Legacy Vector method
        System.out.println("add element : " +vec);
        vec.add(1, "C++");            // Insert at index 1
        System.out.println("add element Index 1 : " +vec);
        
        
        Vector<String> tools = new Vector<>();
        tools.add("Git");
        tools.add("Docker");
//        vec.addAll(tools);            // Append a collection

        // 3. ACCESSING & INFORMATION
        System.out.println("First Element: " + vec.firstElement());
        System.out.println("Last Element: " + vec.lastElement());
        System.out.println("Element at index 2: " + vec.get(2));
        System.out.println("Size: " + vec.size());            // Number of elements
        System.out.println("Capacity: " + vec.capacity());    // Total space allocated

        // 4. SEARCHING
        boolean containsJava = vec.contains("Java");          // Returns true
      
        int index = vec.indexOf("Java");                   // Returns index

        System.out.println(containsJava);
        System.out.println(index);
        
        
        // 5. UPDATING
        vec.set(0, "Rust");           // Replaces index 0 with "Rust"

        // 6. REMOVING
        vec.remove("Git");            // Remove by object
//        vec.remove(2);                // Remove by index
        // vec.clear();               // Would remove all elements

        // 7. ITERATING (The Legacy Way)
        System.out.print("Iteration: ");
        Enumeration<String> en = vec.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }

        // 8. UTILITY
        Collections.sort(vec);        // Sort alphabetically
        vec.trimToSize();             // Reduces capacity to current size
        
        System.out.println("\nFinal Vector: " + vec);		
		
	}
}
