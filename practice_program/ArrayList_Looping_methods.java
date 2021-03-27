package practice_program;
import java.util.*;

public class ArrayList_Looping_methods {

	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Hemanth");
		s1.add("Aditya");
		s1.add("Gowtam");
		//iterate using for loop
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}
		System.out.println("------This is end of for loop-------");
		
		//for each loop
		for(String s: s1) {
			System.out.println(s);
		}
		System.out.println("-----This is end of for each loop------");
		//while loop
		int j = 0;
		while(s1.size()>j) {
			System.out.println(s1.get(j));
			j++;
			}
		System.out.println("-----This is end of while loop-----");
		//using iterator
		Iterator<String> iter = s1.iterator();
		while(iter.hasNext()) //.hasNext it iterates if the next element is present,instead of an exception
		{
			System.out.println(iter.next());
			
		}
		System.out.println("-----This is end of iterator loop------");
		
		}

}
