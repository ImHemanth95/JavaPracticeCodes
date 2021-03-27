//Q8.Write a Java program to extract a portion of a array list.
package Assingment_09_02_2021;
import java.util.ArrayList;
import java.util.*;
public class Question_8 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(200);
		arr.add(500);
		arr.add(1000);
		arr.add(2000);
		arr.add(4000);
		System.out.println("This is the current list");
		System.out.println(arr);
		//Create an sublist for the current list
		List<Integer> arr_1 = arr.subList(0,2);
		//Now print the list that contains the portion of the array list
		System.out.println("This is some portion of the current list from range 0-2");
		System.out.println(arr_1);
		}
}
