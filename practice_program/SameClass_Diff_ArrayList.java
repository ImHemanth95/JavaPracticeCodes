package practice_program;
import java.util.*;

public class SameClass_Diff_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> s1 =  new ArrayList<String>();
		s1.add("String_1");
		s1.add("String_2");
		s1.add("String_3");
		for(String st:s1) {
			System.out.println(st);
		}
		ArrayList<Integer> a =  new ArrayList<Integer>();
		a.add(20);
		a.add(120);
		a.add(520);
		for(Integer t1 :a) {
			System.out.println(t1);
		}
		ArrayList<Boolean> b1 =  new ArrayList<Boolean>();
		b1.add(false);
		b1.add(true);
		b1.add(true);
		for(Boolean b :b1) {
			System.out.println(b);
		}
		
		
		
		
		
		

	}

}
