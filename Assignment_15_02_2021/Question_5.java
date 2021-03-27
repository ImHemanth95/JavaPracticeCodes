//Q5.Define a program to find out whether a given number is even or odd.
package Assignment_15_02_2021;

public class Question_5 {
	//create a method for getting the numbers are "Even/Odd".
	public int Even(int num) {
		int even = 0;
		if(num%2==0) {
			even=num;
			System.out.println("yes this is an valid even number"+"="+num);
		}
		else {
			System.out.println("This number is not an even number, please enter an valid number");
			
		}
		return even;
	}
	public int Odd(int num1) {
		int odd = 0;
		if(num1%2!=0) {
			odd=num1;
			System.out.println("yes this is an valid odd number"+"="+num1);
		}
		else {
			System.out.println("This number is not an odd number,please enter an valid number");
		}
		return odd;
	}
	public static void main(String[] args) {
		//create a object
		Question_5 Q5 = new Question_5();
		System.out.println(Q5.Even(4));
		System.out.println(Q5.Odd(2));
		}
}
