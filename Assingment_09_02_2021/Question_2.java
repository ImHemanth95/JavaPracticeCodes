//Q2.Write a Java program to insert an element into the array list at the first and last positions.
package Assingment_09_02_2021;
import java.util.ArrayList;
//trimtosize

public class Question_2 {

	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<Object>(3);
		
		arr.add(1);//0 index
		arr.add(2);//1 index
		arr.add(3);//2 index
		arr.add(4);//3 index
		System.out.println(arr);//prints all the array values
		//now to add the values to the arr 1st index and last index
		arr.add(0,11);
		arr.add(4,44);
		System.out.println(arr);
		}

}
