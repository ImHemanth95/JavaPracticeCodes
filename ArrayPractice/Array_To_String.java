package ArrayPractice;

import java.util.Arrays;

public class Array_To_String {

	public static void main(String[] args) {
		boolean [] bool = new boolean[] {true,false,true,false};
		char[] ch = new char[] {'A','B','C'};
		int[] arr = new int[] {22,55,88};
		Object [] obj = new Object[] {1,"TEST",true};
		System.out.println("Boolean Array:"+Arrays.toString(bool));
		System.out.println("Character Array:"+Arrays.toString(ch));
		System.out.println("Integer Array:"+Arrays.toString(arr));
		System.out.println("Object Array:"+Arrays.toString(obj));

	}
}
