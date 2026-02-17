package collectionexample;

import java.util.Comparator;

class DescendingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1 , Integer i2) {
		// TODO Auto-generated method stub
//		return i2.compareTo(i1);
//		return +1;   //in insertion order
//		return -1;   //reverse of insertion order
		return 0;    //first print other all are duplicate
	}

	
	
	
	

}
