package practice_program;
import java.util.*;

public class ArrayList_1 {

	public static void main(String[] args) {
		// creating an arraylist
		ArrayList<Object> arr = new ArrayList<Object>();//arraylist is an object itself
		arr.add(1);
		arr.add("ABC");
		arr.add('c');
		System.out.println(arr.get(0));//to get the array list particular value
		System.out.println(arr.size());//to get the array list length-that is used to get the length,but in the array we use .lenght() method.
		
	   ArrayList<String> arr1 = new ArrayList<String>();// this is where we use this generic way to what type the arraylist belongs
	  arr1.add("STring");
	  arr1.add("yeah");
	  arr1.add("yeahhhh");
	  //to print all the arr1 element on the console using for each loop
	  for(String i:arr1) {
		  System.out.println(i);
	  }
	  
	   
	}
}
/*
1.The is the array list that is of not fixed size and this is not static in nature.
2.This arraylist will store any type of data types.
3.This arraylist will sort order type.
4.ArrayList is always an object itself
5.Object =  where it stores the methods and properties of the class methods and its properties and can be executed when it is invoked.

*/ 
