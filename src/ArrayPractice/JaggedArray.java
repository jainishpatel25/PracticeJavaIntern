package ArrayPractice;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged array: students with different course counts
        String[][] courses = new String[4][2];

        courses[0] = new String[] {"Math", "Physics"};          // Student 1
        courses[1] = new String[] {"Biology", "Chemistry", "English"}; // Student 2
        courses[2] = new String[] {"History"};                  // Student 3
        courses[3] = new String[] {"History"}; 
        
        
        // Display
        for (int i = 0; i < courses.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            for (String subject : courses[i]) {
                System.out.print(subject + " ");
            }
            System.out.println();
        }
    }
}

