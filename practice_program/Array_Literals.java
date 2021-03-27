package practice_program;

public class Array_Literals {

	public static void main(String[] args) {
		// ArrayLiterals
		int a[]= {10,20,30,25};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
/*If you try to print the array directly then you will get the address of the array, becuause
the array will store it as an physical memory or the location,as the array is not an object by itself, so we need
to use the array print by means of looping only.
1.
*/
