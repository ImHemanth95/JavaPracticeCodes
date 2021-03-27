// Write a Java program to retrieve an element (at a specified index) from a given array list.

package Assingment_09_02_2021;

import java.util.ArrayList;

public class Question_3 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>(3);
		
		arr.add("Test");//0 index
		arr.add("Testing");//1 index
		arr.add("Tested");//2 index
		arr.add("Not Tested");//3 index
		
		System.out.println(arr.get(3));
	}

}
