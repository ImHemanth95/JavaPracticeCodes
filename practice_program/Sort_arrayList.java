package practice_program;
import java.util.*;

public class Sort_arrayList {

	public static void main(String[] args) {
		//sort an given arraylist
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(500);
		arr.add(2000);
		arr.add(120);
		System.out.println("this is before sorting the arraylist");
		System.out.println(arr);
//		for(Integer i:arr) {
//			System.out.println(i);
//		}
		System.out.println("this after sorting the arraylist");
		Collections.sort(arr);
		System.out.println(arr);
		

	}

}
