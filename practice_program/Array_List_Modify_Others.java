package practice_program;
import java.util.*;

public class Array_List_Modify_Others {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(100);
		arr.add(1250);
		arr.add(474);
		System.out.println("This is before changing the values of the current arraylist");
		System.out.println(arr);
		//To set an particular values to an another in an arrayList
		arr.set(0, 50);
		System.out.println("This is after changing the values of the current arraylist");
		System.out.println(arr);
		System.out.println("This is the arrayList after removing an index-0 value");
		arr.remove(0);
		System.out.println(arr);
		System.out.println("Current size of the arraylist is="+arr.size());//get the size of the arraylist
		//This is to remove all the elements in the arrayList
		//arr.clear();
		//System.out.println(arr);
		
		
		
		}
	}
/*
 1.ArrayList and linked list uses the interface - List, so that they are almost listed
 2.The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
 3.The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. 
 4.This means that you can add items, change items, remove items and clear the list in the same way.
 5.However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
 
# How the ArrayList works
1.The ArrayList class has a regular array inside it. 
2.When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one.
3.And the old one is removed.

#How the LinkedList works
1.The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. 
2.To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

#When To Use-Array/ArrayList
1.It is best to use an ArrayList when:
-You want to access random items frequently
-You only need to add or remove elements at the end of the list

2.It is best to use a LinkedList when:
-You only use the list by looping through it instead of accessing random items
-You frequently need to add and remove items from the beginning, middle or end of the
list.





*/

