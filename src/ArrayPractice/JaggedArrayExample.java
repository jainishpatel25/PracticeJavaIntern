package ArrayPractice;

import java.util.Arrays;

public class JaggedArrayExample {
	public static void main(String[] args) {
		
	int[][] arr1 = {
			{1,2,3},
			{1,2,3,4}
	};
	
//	System.out.println(Arrays.toString(arr1));
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
//			System.out.print("[" + arr1[i][j] + "," + arr1[i][j+1] + "] ");
			
			
			
			
			
			System.out.println("Array [" +i+ "] & [" +j+ "] : " +arr1[i][j]);
		}
	}
	System.out.println(arr1.length);
	System.out.println(arr1[0].length); // 2
	System.out.println(arr1[1].length); // 4
	}
}

