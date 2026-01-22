package Feature;

import java.util.Optional;

public class OptionalExample {
	 public static void main(String[] args) {
//	        String[] str = new String[5];
//	        str[2] = "Geeks Classes are coming soon";
//
//	        Optional<String> empty = Optional.empty();
//	        System.out.println(empty); 

//	        Optional<String> value = Optional.of(null);
//	        System.out.println(value); 
	 
		 
		 	
		 
	        Optional<String> value1 = Optional.ofNullable("java");
	        System.out.println(value1);
	        System.out.println(value1.get()                                                                                                                                                                                                                                                                                                                                                             );
	        System.out.println(value1.isPresent());
	 }
}
