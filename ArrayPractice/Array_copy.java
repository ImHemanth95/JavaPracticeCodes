package ArrayPractice;

public class Array_copy {

	public static void main(String[] args) {
		///Method-1 for cpy of array,but its wrong one
		int a[]= {1,3,5};
		int b[]= {5,9,8};
		b=a;
		///this stores nly the array location to array b
		System.out.println(b);//stores location
		//now to increase when the copy of data is given as incremented
		b[0]++;
		
		System.out.println("Contents of a[]---------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		
		System.out.println("Contents of b[]---------");
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]+" ");
		}
		   //now for Method-2
			
			System.out.println("----END-OF-1st-Method---------");
			
			int H[] = {7,8,9};
			int F[] = new int[H.length];
			for(int k=0;k<H.length;k++)
				F[k]=H[k];
				F[0]++;
				System.out.println("Contents of H[]----------");
				for (int k = 0; k < H.length; k++)
		            System.out.print(H[k] + " ");
				 System.out.println("\n\nContents of F[]------");
		        for (int k = 0; k < F.length; k++)
		            System.out.print(F[k] + " ");
				
			}
}
