package ArrayPractice;

import java.util.Arrays;

public class Array_Compare_ByObjects {

	public static void main(String[] args) {
		//Compare arrays using two objects
		int[]a= {2,6,8};
		char[]b= {'A','B','C'};
		Object arr1[] = {a};
		Object arr2[] = {b};
		//you can use this deep comparison for check one to one element present in the array
		//if(Arrays.deepEquals(arr1, arr2))
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Yes its same");
		}else {
			System.out.println("Yes its not same");
		}

	}

}
