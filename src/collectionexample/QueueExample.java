package collectionexample;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
//		System.out.println(q.size());
//		System.out.println(q);
		
//		q.add(20);
		
//		System.out.println(q);
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.offer(10);
		q1.offer(80);
		q1.offer(30);
		q1.offer(50);
		q1.offer(20);
//		
		System.out.println(q1);
		
//		System.out.println(q1.peek());
//		System.out.println(q1);
		
//		System.out.println(q1.poll());
//		System.out.println(q1);
		 
//		
////		try {
////	            q1.element(); // Throws Exception
////	        } catch (Exception e) {
////	            System.out.println("element() threw: " + e);
////	        }
//		 
		
//		System.out.println("Head Element: " + q1.element());
		
//		System.out.println(q1.remove());
		
//		q1.remove(20);
//		System.out.println(q1);
		
//		System.out.println(q.size());
		
		
		q1.clear();
		System.out.println(q1.peek());
		System.out.println(q1.poll());
			
	}
}
