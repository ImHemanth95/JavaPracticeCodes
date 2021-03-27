//Q2.Define a method that returns the product of two numbers entered 
package Assignment_15_02_2021;

public class Question_2 {
	public int product(int a,int b) {//return type is based on what we define here in the method
		int prod = a*b;
		System.out.println("We are taking two numbers and returning the product");
		return prod;//always we need to have the return type as int that is defined as method.
	}

	public static void main(String[] args) {
		// create an object for the methods that return
		Question_2 Q2 = new Question_2();
		System.out.println("This method will now returning the product of two numbers");
		int results  = Q2.product(5, 10);
		System.out.println(results);
		
		
		

	}

}
