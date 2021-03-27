package ArrayPractice;

public class Array_Copy1 {

	public static void main(String[] args) {
		// Method-3
		int a[]= {1,2,5};
		int b[] = a.clone();
		//
        b[0]++;
        System.out.println("contents of a[]");
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
        System.out.println("\n\n contents of b[]");
        for(int i=0;i<b.length;i++)
        	System.out.print(b[i]+" ");

	}

}
