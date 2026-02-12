//package OOPS;
//
//public class Student {
//	
//	int roll;
//	String name;
//	
//	
//	private String grade;
//	
//	Student(int roll,String name){
//		this.roll = roll;
//		this.name = name;
//		this.grade = "Not Assigned";
//	}
//	
//	public void setGrade(String newGrade) {
//		if (newGrade == "A" || newGrade == "B" || newGrade == "C" || newGrade == "D" || newGrade == "F" ) {
//			this.grade = newGrade;
//			System.out.println("New Grade Successfully updated: "+newGrade);
//		}else {
//			System.out.println("Invalid Grade");
//		}
//	}
//	
//	public String getGrade() {
//		return this.grade;
//	}
//	
//
//	
//	void study() {
//		System.out.println(name+ " is the Name of Student & his roll no is : " +roll+ " and acheived the grade of maths is: " +grade);
//	}
//
//}
//
//class SciStudent extends Student{
//
//	private String labProject;
//	
//	SciStudent(int roll, String name,String labProject) {
//		super(roll, name);
//		this.labProject=labProject;
//	}
//	
//	public void project() {
//	 System.out.println(name+ " has The lab projest is: " +labProject);
//	}
//	
//}
