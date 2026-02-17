package ComparableExample.Comparator;

import java.util.Comparator;

import ComparableExample.Comparator.*;

public class Students {
	 int id;
	    String name;

	    Students(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    
	    public static void displayComparison(Students first, Students second, Comparator<Students> comp) {
	        // Call the compare(o1, o2) method of the comparator
	        int result = comp.compare(first, second);
	        
	        System.out.print("Comparing " + first.name + " with " + second.name + ": ");
	        
	        if (result < 0) {
	            System.out.println(first.name + " comes before " + second.name);
	        } else if (result > 0) {
	            System.out.println(first.name + " comes after " + second.name);
	        } else {
	            System.out.println("Both are equal");
	        }
	        System.out.println("----------------------------------------");
	    }

	    public static void main(String[] args) {
	    	 Students s1 = new Students(1, "Jainish");
	         Students s2 = new Students(2, "Patel");
	         Students s3 = new Students(3, "Joy");
	         Students s4 = new Students(4, "Nain");
	         Students s5 = new Students(5, "Rohit");
	         Students s6 = new Students(6, "Aakash");
	         
	         
	         // Create an instance of the comparator
	         NameCompartor nameComp = new NameCompartor();
	         
	         // Pass the comparator to the display method
	         displayComparison(s1, s2, nameComp);
	         displayComparison(s2, s1, nameComp);
	         displayComparison(s4, s3, nameComp);
	         displayComparison(s4, s6, nameComp);
	         displayComparison(s6, s5, nameComp);
	         
		}
}
