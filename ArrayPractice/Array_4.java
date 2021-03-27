package ArrayPractice;

public class Array_4 {

	public static void main(String[] args) {
		int arr1[]= {1,2,4,6};
		//to cpy the array from one to another using the clone method
		int clonearr1[]= arr1.clone();
		System.out.println(arr1 == clonearr1);
		for(int i=0;i<clonearr1.length;i++) {
		   System.out.print(clonearr1[i]+" ");
		}
		
	}

}
