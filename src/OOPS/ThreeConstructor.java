package OOPS;

class Smartphone {
    String brand;
    int storage;

    // 1. No-Argument Constructor
    // Every time someone creates a "new Smartphone()", it gets these values.
    public Smartphone() {
        this.brand = "Unknown";
        this.storage = 128;
    }

    // 2. Parameterized Constructor
    // Allows the user to specify the brand and storage at creation.
    public Smartphone(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }

    // 3. Copy Constructor (Equivalent to the ArrayList Collection constructor)
    // Creates a new object using the data from an existing object.
    public Smartphone(Smartphone otherPhone) {
        this.brand = otherPhone.brand;
        this.storage = otherPhone.storage;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Storage: " + storage + "GB");
    }
}

public class ThreeConstructor {
    public static void main(String[] args) {
        // Using No-Argument Constructor
        Smartphone defaultPhone = new Smartphone();
        
        // Using Parameterized Constructor
        Smartphone proPhone = new Smartphone("Apple", 256);
        
        // Using Copy Constructor
        Smartphone replacementPhone = new Smartphone(proPhone);

        System.out.print("Phone 1: "); defaultPhone.displayInfo();
        System.out.print("Phone 2: "); proPhone.displayInfo();
        System.out.print("Phone 3: "); replacementPhone.displayInfo();
    }
}