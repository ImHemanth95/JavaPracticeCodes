package practice_program;

public class Array_copy_2 {

	public static void main(String[] args) {
		// string copy from one array to another array
		String a[] = {"Hi","Hello","This_is_java"};
		String b[] = new String[a.length];
		b=a;// you can use still a.clone() method to copy the array from one to another
		System.out.println("----This programm is used to copy from one array to another array-----");
		for(int i = 0;i<a.length;i++) {
		System.out.println(a[i]+" ");
		}
		System.out.println("-----Now copying from a to b------------");
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]+" ");
		}
		System.out.println("-----copied from a to b------------");
		}
	}


