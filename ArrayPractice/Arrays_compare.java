package ArrayPractice;

import java.util.Arrays;

public class Arrays_compare {

	public static void main(String[] args) {
		// Array compare
		int arr1[]= {2,6,8};
		int arr2[]= {5,8,7};
		if(arr1==arr2) {
			System.out.println("yes its same");
		}else {
			System.out.println("Yes its not same");
		}
		System.out.println("----------------");
		int a[] = {5,9,8};
		int b[] = {8,5,9};
		if(Arrays.equals(a, b)) {
			System.out.println("Yes its same");
		}else {
			System.out.println("Yes its not same");
		}
	}
	
	

}
