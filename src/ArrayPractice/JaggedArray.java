package ArrayPractice;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged array: students with different course counts
        String[][] courses = new String[4][1];

        courses[0] = new String[] {"Math", "Physics"};          // Student 1
        courses[1] = new String[] {"Biology", "Chemistry", "English"}; // Student 2
        courses[2] = new String[] {"History"};                  // Student 3
        courses[3] = new String[] {"History"}; 			
//        courses[4] = new String[] {"Computer"}; 		//arrayoutofindex
        
        
        // Display
        for (int i = 0; i < courses.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            for (String subject : courses[i]) {
                System.out.print(subject + " ");
            }
            System.out.println();
            
        }
        
        System.out.println("///////////////");
        System.out.println("Normal Example");
        System.out.println("//////////////");
        
        int[][] a= new int[3][];
    	
        a[0]=new int[]{1,2};
    	
        a[1]=new int[]{1,2,3,4,5};
    	a[2]=new int[]{1,2,3};
    		
    	for(int i=0;i<a.length;i++) {
    		for(int j=0;j<a[i].length;j++) {
    			System.out.print(a[i][j] + " ");
    		}
    		System.out.println();
    	}
    	System.out.println(a[0][0]);
    	System.out.println(a[0][1]);
    	System.out.println(a[1][0]);
    	System.out.println(a[1][1]);
    	System.out.println(a[1][2]);
    	System.out.println(a[1][3]);
    	System.out.println(a[1][4]);
//    	System.out.println(a[0][0]);
    }
}

