//Q12.Write a Java program to print all the elements of a ArrayList using the position of the elements
package Assingment_09_02_2021;
import java.util.*;
public class Question_12 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4500);
		arr.add(4750);
		arr.add(7800);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
			
		}
		
	}

}
