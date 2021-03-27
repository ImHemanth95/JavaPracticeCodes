//Q6.Write a Java program to search an element in a array list.

package Assingment_09_02_2021;
import java.util.ArrayList;

public class Question_6 {

	
	public static void main(String[] args) {
		ArrayList<Boolean> arr = new ArrayList<Boolean>();
		arr.add(false);
		arr.add(true);
		if(arr.get(0).equals(false)) {
			System.out.println("Yes we found the 1st array value=" +" "+arr.get(0));
		}else {
			System.out.println("Not its not found");
		}
	}
}

