package StringPractice;

import java.util.Scanner;  


public class Example1 {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your first name: ");
//	        String firstName = scanner.next(); // Reads until the first space
	        
	        
	        String firstNamee = scanner.nextLine();
	        
	        
	        
	        System.out.println("Hello, " + firstNamee + "!");
	        scanner.close();
	    }
	}

