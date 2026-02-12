package OOPS;

class ReportCard {
    String grade;

    ReportCard(String grade) {
        this.grade = grade;
    }
}

class Students {
    String name;
    ReportCard report;

    // Parameterized Constructor
    public Students(String name, String grade) {
        this.name = name;
        this.report = new ReportCard(grade);
    }

    // COPY CONSTRUCTOR
    public Students(Students otherStudent) {
        this.name = otherStudent.name; // String is immutable, so this is fine
        
        // DEEP COPY: We create a new ReportCard object instead of 
        // just saying "this.report = otherStudent.report"
        this.report = new ReportCard(otherStudent.report.grade);
    }

    void showDetails() {
        System.out.println("Student: " + name + " | Grade: " + report.grade);
    }
    
}

public class CopyConstructors {
	public static void main(String[] args) {
        // 1. Create original student
        Students student1 = new Students("Alice", "A");

        // 2. Use Copy Constructor to create student2
        Students student2 = new Students(student1);
        
        // 3. Modify student2's grade
        student2.report.grade = "B";
        student2.name = "Bob";

        // 4. Check results
        System.out.println("--- Original Student ---");
        student1.showDetails(); // Remains Alice with an A
        
        System.out.println("--- Copied & Modified Student ---");
        student2.showDetails(); // Becomes Bob with a B
    }
}