//Q5.Write a Java program to remove the third element from a array list. 
package Assingment_09_02_2021;
import java.util.ArrayList;
public class Question_5 {

	public static void main(String[] args) {
		ArrayList<Object>arr = new ArrayList<Object>();
        arr.add(20);
        arr.add(100);
        arr.add(100.20);
        System.out.println(arr);
        //forloop logic
//        for(int i = 0;i<=arr.size();i++) {
//        	if(arr.get(2).equals(100.20)) {
//        		arr.remove(arr.get(2));
//        	System.out.println(arr.get(i));
//        		break;
         //arr.remove(2); -- index wise.
        //-- now u can use this method to remove value instead of index
        arr.remove(100.20); 
         System.out.println(arr);
         }
	}

