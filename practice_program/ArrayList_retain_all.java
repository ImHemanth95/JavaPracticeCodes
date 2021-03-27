package practice_program;

import java.util.*;

public class ArrayList_retain_all {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ravi");  
		arr.add("Vijay");  
		arr.add("Ajay"); 
		System.out.println(arr);
		  ArrayList<String> arr_1 =new ArrayList<String>();  
		  arr_1.add("Ravi");  
		  arr_1.add("Hanumat");  
		  arr_1.retainAll(arr);
		  System.out.println("iterating the elements after retaining the elements of arr");
		  System.out.println(arr_1);
		  
		  

	}

}
