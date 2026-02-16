package collectionexample;

import java.util.List;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(13);
		v.add(14);  //boolean
		v.add(0, 11);  //void 
		
		v.addElement(23);  //void add at end 
		System.out.println("Vector V : " +v);
		v.indexOf(12); 
		
		
//		Object v2 = v.clone(); // object return  type 
		
//		System.out.println("V2 Variable: " +v2);
//		v.clear();  //void
//		System.out.println("after clearing: " +v);
		
//		v.forEach((v3)->System.out.println(v3));  //void
		
		Vector<Integer> v1 = new Vector<Integer>(10);   // increse the capacity by 2x
		v1.add(10);
		v1.add(11);
		v1.add(12);
		v1.add(13);
		v1.add(14);
		v1.add(15);
		v1.add(16);
		v1.add(17);
		v1.add(18);
		v1.add(19);
		
//		v.addAll(v1); //boolean
//		v.addAll(5,v1); // boolean spcific index par collection add karvu
		
//		System.out.println("after addAll method: " +v);  //boolean 
//		System.out.println(v1);
//		System.out.println("Capacity Of V1: " +v1.capacity());  //int 
		
		
//		Vector<Integer> v1 = new Vector<Integer>(10,2);   //increment the capcity by 2 
		v1.add(20);      //boolean
//		System.out.println(v1);
//		System.out.println(v1.capacity());
		
		
	
		
		
	}
	
}
