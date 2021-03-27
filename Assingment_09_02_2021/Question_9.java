//Write a Java program of swap two elements in an array list.
package Assingment_09_02_2021;
import java.util.*;
public class Question_9 {
public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
	    arr.add("Tom");
		arr.add("Jerry");
		arr.add("Nick");
		arr.add("Doremon");
		System.out.println("Arraylist before swap:");
		//for each loop
		for(String e : arr) {
			System.out.println(e);
		}
		System.out.println("-------------------------");
		//Now we will swap the("Tom" to "Nick") that is 0->3/3->0
		Collections.swap(arr, 0, 3);
		System.out.print("Arraylist after swap:"+"\n");
		//for each loop
		for(String a :arr) {
			System.out.println(a);
		}
		}
}
