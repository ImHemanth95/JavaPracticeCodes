package practice_program;
import java.util.*;
import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) {
//	LinkedList<String> test = new LinkedList<String>();
//	test.add("test1");
//	test.add("test2");
//	test.add("test3");
//	// Use addFirst() to add the item to the beginning
//	test.addFirst("adding");
//	System.out.println(test);
//	// Use addLast()to add the item to the Last arraylist
//	test.addLast("ImatLast");
//	System.out.println(test);
//	//Now use removeFirst() to remove the item from the first element
//	test.removeFirst();
//	System.out.println(test);
//	//Now use removeLast() to remove the item from the last element
//	test.removeLast();
//	System.out.println(test);
		ArrayList<String> str =  new ArrayList<String>();
		System.out.println(str.isEmpty());
		str.add("Testdata");
		str.add("Testdata_1");
		str.add("Testdata_1");
		str.add("Testdata_1");
		System.out.println("below is the actual arraylist");
		System.out.println(str);
		System.out.println(str.isEmpty());
		}
}
//Arraylist and LinkedList works on the index based.
//arraylist .isEmpty is checking the arraylist is empty or not.

