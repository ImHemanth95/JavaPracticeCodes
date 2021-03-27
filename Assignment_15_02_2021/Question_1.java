//Q1.Write a program to print the sum of two numbers entered by defining your own method.

package Assignment_15_02_2021;

public class Question_1 {
	
	public void add(int a,int b) {
		System.out.println("The sum of two numbers:" +a+ "and" +b+ "="+(a+b));
	}

	public static void main(String[] args) {
		Question_1 q1 = new Question_1();
		q1.add(2,5);
		

	}

}
