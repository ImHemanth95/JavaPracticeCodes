//Q9.Write a Java program to empty an array list.
package Assingment_09_02_2021;
import java.util.*;

public class Question_10 {

	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<Double>();
		arr.add(20.55);
		arr.add(45.11);
		arr.add(77.20);
		System.out.println("Current arraylist");
		System.out.println(arr);
		arr.removeAll(arr);
		System.out.println("Current arraylist after removal of arraylist elements");
		System.out.println(arr);
		

	}

}
