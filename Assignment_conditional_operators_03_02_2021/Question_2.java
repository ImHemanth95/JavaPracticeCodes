//Q2.Take four numbers from the user and print the greatest number. 
//Test data = 25,78,87,91

package Assignment_conditional_operators_03_02_2021;

public class Question_2 {

	public static void main(String[] args) {

		int i = 25;
		int j = 78;
		int k = 87;
		int m = 91;
		if(i>j && i>k) {
			System.out.println("i is greater");
		}
		if(j>k) {
			System.out.println("j is greater");
		}
		if(k>m) {
			System.out.println("k is greater");
		}
		if(m>i) {
			System.out.println("m is greater");
		}
		
	}

}
