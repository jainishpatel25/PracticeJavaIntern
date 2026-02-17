package ComparableExample;

class Student implements Comparable<Student>{

	int id;

	String name;

	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		return Integer.compare(this.id,s.id);
	}
	
	public static void displayComparison(Student first,Student second ) {
		
		int result = first.compareTo(second);
		
		System.out.print("Compare " + first.name + " with " +second.name+ " : ");
		
	
		
		if(result<0) {
			System.out.println(first.name+ " come before " +second.name);
			System.out.println("----------------------------------------");
		}else if(result>0) {
			System.out.println(first.name+ " come after " +second.name);
			System.out.println("---------------------------------------");
		}else {
			System.out.println(first.name+ " Both Are Equal " +second.name);
		}
	}
	
	
	public static void  main(String[] args) {
		
		Student s1 = new Student(1,"Jainish");
		Student s2 = new Student(2,"Patel");
		Student s3 = new Student(3,"Joy");
		Student s4 = new Student(4,"Jenis");
		Student s5 = new Student(5,"Yash");
		Student s6 = new Student(6,"Rana");
		
		
		
		displayComparison(s1, s2);
		displayComparison(s5, s6);
		displayComparison(s3, s6);
		displayComparison(s4, s1);
		
	}
}

// Comparing the Object With Name(String)

//package ComparableExample;
//
//class Student implements Comparable<Student>{
//
//	int id;
//
//	String name;
//
//	
//	Student(int id,String name){
//		this.id = id;
//		this.name = name;
//	}
//	
//	@Override
//	public int compareTo(Student s) {
//		return this.name.compareTo(s.name);     //compare with String
//	}
//	
//	public static void displayComparison(Student first,Student second ) {
//		
//		int result = first.compareTo(second);
//		
//		System.out.print("Compare " + first.name + " with " +second.name+ " : ");
//		
//	
//		
//		if(result<0) {
//			System.out.println(first.name+ " come before " +second.name);
//			System.out.println("----------------------------------------");
//		}else if(result>0) {
//			System.out.println(first.name+ " come after " +second.name);
//			System.out.println("---------------------------------------");
//		}else {
//			System.out.println(first.name+ " Both Are Equal " +second.name);
//		}
//	}
//	
//	
//	public static void  main(String[] args) {
//		
//		Student s1 = new Student(1,"Jainish");
//		Student s2 = new Student(2,"Patel");
//		Student s3 = new Student(3,"Joy");
//		Student s4 = new Student(4,"Jenis");
//		Student s5 = new Student(5,"Yash");
//		Student s6 = new Student(6,"Rana");
//		
//		displayComparison(s1, s2);
//		displayComparison(s5, s6);
//		displayComparison(s3, s6);
//		displayComparison(s4, s1);
//		
//	}
//}
