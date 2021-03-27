package practice_program;

public class Array_Copy_1 {

	public static void main(String[] args) {
		int a[] = {20,30,40,50};
		int b[]= new int[a.length];//we are using the a(array).length to get the length of an array b - using new keyword
		//now copy by assigning the value of array that needs 
		b=a;
		System.out.println("Components of an array");
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("---------------------");
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]+" ");
		}
		

	}

}
