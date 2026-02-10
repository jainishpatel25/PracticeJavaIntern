package GenericsExample;


public class Cart<T> {
 private T item;

 public void addItem(T item) {
     this.item = item;
 }

 public void showItem() {
     System.out.println("Cart contains: " + item);
 }
 
 public static void main(String[] args) {
     // 1. Product ke liye Cart
     Cart<String> p = new Cart<>();
     p.addItem("LAPTOP_WARRENTY");
     p.showItem();

     // 2. ID (Integer) ke liye Cart
     Cart<Integer> i = new Cart<>();
     i.addItem(101);
     i.showItem();
 }
}

//
//public class Main {
// public static void main(String[] args) {
//     // 1. Product ke liye Cart
//     Cart<String> productCart = new Cart<>();
//     productCart.addItem("Laptop");
//     productCart.showItem();
//
//     // 2. ID (Integer) ke liye Cart
//     Cart<Integer> idCart = new Cart<>();
//     idCart.addItem(101);
//     idCart.showItem();
// }
//}
