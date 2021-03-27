package practice_program;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = {20,202,120,320};
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
/*The current array size=4, but the length =3, and 0-3 is the index's. 
 but here if you see we are comparing it with i<=arr.length that is upto 3 and checking 4=4 then it says
 there is no such index exists. and hence this error*/

