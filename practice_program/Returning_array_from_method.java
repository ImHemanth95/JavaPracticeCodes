package practice_program;

public class Returning_array_from_method {
	public static int[] getArray() {
		return new int[]{20,30,40};//we use this new keyword that is used to get back the new array
		
	}

	public static void main(String[] args) {
		int arr[] = getArray();//storing method inside the array that is returning array values
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);//getting the array values using index as i
		}
		

	}

}
