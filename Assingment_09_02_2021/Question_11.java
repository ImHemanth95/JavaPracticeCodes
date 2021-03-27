//Q11.Write a Java program to trim the virtual capacity of an array list the current list size.
package Assingment_09_02_2021;
import java.util.*;

public class Question_11 {

	public static void main(String[] args) {
		//used array size is 10 and now utilized is only 5 the 5 is not used
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		arr.add(10);//0
		arr.add(20);
		arr.add(100);
		arr.add(888);
		arr.add(0);
		System.out.println(arr);
		System.out.println(arr.size());
		//trim the arraylist size to the actual size then
		//from 0-9(index) or size 10 of default it trims to actual
		arr.trimToSize();
		System.out.println(arr);
			
}

}
