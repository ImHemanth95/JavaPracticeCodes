//Q1.Take three numbers from the user and print the greatest number. 
//Test Data : 25,78,87


package Assignment_conditional_operators_03_02_2021;

public class Question_1 {

	public static void main(String[] args) {
		
		int i = 25;
		int j = 78;
		int k = 87;
		if(i>j && i>k) {
			System.out.println("i is greater");
		}
		if(j>k) {
			System.out.println("j is greater");
		}
		if(k>i) {
			System.out.println("k is greater");
		}
		

	}

}
