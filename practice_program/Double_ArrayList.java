package practice_program;
import java.util.*;

public class Double_ArrayList {

	public static void main(String[] args) {
	ArrayList<Double> d1 = new ArrayList<Double>();
	d1.add(20.52);
	d1.add(256.02);
	d1.add(44.25);
	d1.add(70.02);
	System.out.println("This is double arrayList");
	for(int a=0;a<d1.size();a++) {
		System.out.println(d1.get(a));
	}
	System.out.println("End of for loop---");
	for(Double d:d1) {
		System.out.println(d);
	}
	System.out.println("End of for-each-loop---");
	d1.remove(0);
	
	

	}
	//To remove the element of the array


}
//Array List is the default class in java.
//maintains the indexing(order).
