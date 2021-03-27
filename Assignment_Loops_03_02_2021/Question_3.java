//Q3.WAP to print 10 to 1 using for, while and do-while loop
package Assignment_Loops_03_02_2021;

public class Question_3 {

	public static void main(String[] args) {
		// for loop (10-1)
		for(int i =10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("---------end-of-for-loop---------");
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		System.out.println("---------end-of-while-loop---------");
		int k=10;
		do {
			System.out.println(k);
			k--;
		}
		while(k>=1);
		System.out.println("---------end-of-do-while-loop---------");
		}
}



