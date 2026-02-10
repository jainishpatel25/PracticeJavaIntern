package GenericsExample;

//public class Box<T> {
//	
//	T id;
//	T value;
//	
//	<T> void getBox(){
//		System.out.println("Id is: " +id+ " and number is: "+value);
//	}
//	
//	public static void main(String[] args) {
//		
//		Box<Integer> b1=new Box<>();
//		b1.id = 23;
//		b1.value = 12212;
//		b1.getBox();
//		
//		Box<String> b2=new Box<>();
//		b2.id = "12312";
//		b2.value = "1321312";
//		b2.getBox();
//		
//	}
//}

//Generic class definition with type parameter <T>
class Box<T> {
 private T value;

 // Constructor
 public Box(T value) {
     this.value = value;
 }

 // Getter method
 public T getValue() {
     return value;
 }

 // Setter method
 public void setValue(T value) {
     this.value = value;
 }

 // Method to display the type of T
 public void showType() {
     System.out.println("Type of T: " + value.getClass().getName());
 }



 public static void main(String[] args) {
     // Example 1: Box with Integer
     Box<Integer> intBox = new Box<>(123);
     intBox.showType();
     System.out.println("Value: " + intBox.getValue());
     
     intBox.setValue(345);
     System.out.println("Updated Value: " + intBox.getValue());

     // Example 2: Box with String
     Box<String> strBox = new Box<>("Hello Generics");
     strBox.showType();
     System.out.println("Value: " + strBox.getValue());

     // Example 3: Box with Double
     Box<Double> doubleBox = new Box<>(45.67);
     doubleBox.showType();
     System.out.println("Value: " + doubleBox.getValue());

     // Changing value using setter
     doubleBox.setValue(99.99);
     System.out.println("Updated Value: " + doubleBox.getValue());
 }
}
