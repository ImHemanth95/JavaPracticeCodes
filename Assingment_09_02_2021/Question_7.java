//Q7.Write a Java program to reverse elements in a array list
package Assingment_09_02_2021;
import java.util.ArrayList;
import java.util.*;
public class Question_7 {
public static void main(String[] args) {
		//Creating an ArrayList object         
        ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
        //Adding elements to ArrayList
        arrlist.add(20);         
        arrlist.add(30);        
        arrlist.add(40);
        arrlist.add(50);
        arrlist.add(60);         
        arrlist.add(70);
        //Display ArrayList Before Reverse         
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);
        /*Reversing the list using 
          Collections.reverse() method*/         
        Collections.reverse(arrlist);
         //Displaying list after reverse         
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
}
}