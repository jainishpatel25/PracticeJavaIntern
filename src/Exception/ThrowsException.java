package Exception;

public class ThrowsException {

    // Method declares it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above!");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);   // This will throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        checkAge(20);       // Safe case
    }
}

