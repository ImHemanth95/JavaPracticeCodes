/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.- */
package Assignment_15_02_2021;

public class Question_8 {
	//create a factorial method
	public int Factorial(int number,int factorial ) {
		for(int i=1;i<=number;i++) {
			factorial = factorial*i;
		}
		return factorial;
}
   public static void main(String[] args) {
		Question_8 Q8 = new Question_8();
		System.out.println(Q8.Factorial(4, 1));
		

	}

}
