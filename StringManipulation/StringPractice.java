package StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		String a  ="100AA";
		String b = a.substring(0, 3);
		int i = Integer.parseInt(b); 
		System.out.println(i+20);
		//This is the only class that is available for adding the values at the end of the actual string
		//you can still replace the string character using the array index values
		StringBuilder str = new StringBuilder("TEST");
		str.append("TESTING");
		System.out.println(str);
		//String tokenizer class to print the string values as tokens
		StringTokenizer str1 = new StringTokenizer("Hello Geeks for Geeks");
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
		String input = "Hello Geeks for Geeks";
		char[] data = input.toCharArray();
		ArrayList<Character> data1 = new ArrayList<>();
		for(char c : data) {
			data1.add(c);
		}
		Collections.reverse(data1);//reverse the entire character
		ListIterator<Character> li = data1.listIterator();//list iterator uses the char index wise
		while(li.hasNext())//traverse into the arraylist characters index wise
			System.out.print(li.next());//li.next() mthod returns the next value of the string
		
	}
}
