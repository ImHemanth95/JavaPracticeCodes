package ArrayPractice;

public class Array_Copy2 {

	public static void main(String[] args) {
		int[]a= {2,5,6};
		int[]b= new int[a.length];
		System.arraycopy(a, 0, b, 0, 3);
		b[0]++;
		System.out.println("contents of []");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n\n contents of b[]");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}

}
