package ArrayPractice;

public class Array_2 {

	public static void main(String[] args) {
	int arr[]= {3,5,6,9,7};
	Sum(arr);

	}
	public static void Sum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println("Sum of array value:"+sum);
		}
	}

}
