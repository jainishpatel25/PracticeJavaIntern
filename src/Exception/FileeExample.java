package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
public class FileeExample {

    // Method declares it may throw FileNotFoundException
    static void openFile() throws FileNotFoundException {
        // Trying to open a file that may not exist
        FileInputStream fis = new FileInputStream("test.txt");
        System.out.println("File opened successfully!");
    }

    public static void main(String[] args) {
        try {
            openFile();   // Must handle FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

