package ArrayPractice;

 class ObjectArray {

	 String s;
	 int id;
	 
	public static void main(String[] args) {
		
		ObjectArray[] oa= new ObjectArray[3];
		
		oa[0] = new ObjectArray();
		oa[0].s = "jainish";
		oa[0].id = 101;
		
		oa[1] = new ObjectArray();
		oa[1].s = "patel";
		oa[1].id = 102;
		
//		oa[2] = new ObjectArray();
//		oa[2].s = "patel";
//		oa[2].id = 102;
		
//		
//		oa[3] = new ObjectArray();
//		oa[3].s = "patel";
//		oa[3].id = 102;
		
		for(ObjectArray o: oa)
		System.out.println("Id: " +o.s+ "and Name: " +o.id);
		
//		oa[0]=12;
		
//		System.out.println(oa[0]);
	}
}
 

