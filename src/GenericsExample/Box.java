package GenericsExample;

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
