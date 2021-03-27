//Q4.Define two methods to print the maximum and the minimum number respectively among three numbers entered.
package Assignment_15_02_2021;

public class Question_4 {
	public int maximum(int a,int b,int c) {
		System.out.println("This method will calculate the maximum number of 3");
		int Max;
		if(a>=b && a>=c) {
			System.out.println("the value"+" "+a+" "+"is"+" "+"Maximum");
			Max = a;
		}
			else if(b>=a && b>=c) {
				System.out.println("the value"+" "+b+" "+"is"+" "+"Maximum");
				Max = b;
			}
			else {
				System.out.println("the value"+" "+c+" "+"is"+" "+"Maximum");
				Max = c;
			}
		return Max;
	}
	public int minimum(int a1,int b1,int c1) {
		System.out.println("This method will calculate the minimum number of 3");
		int Min;
		if(a1<=b1 && a1<=c1) {
			System.out.println("the value"+" "+a1+" "+"is"+" "+"Minimum");
			Min=a1;
		}
			else if(b1<=a1&& b1<=c1) {
				System.out.println("the value"+" "+b1+" "+"is"+" "+"Minimum");
				Min=b1;
			}
			else {
				System.out.println("the value"+" "+c1+" "+"is"+" "+"Minimum");
				Min=c1;
				
			}
		return Min;
	}
		public static void main(String[] args) {
		//create an object for both the methods - max and min, but one object is enough
			Question_4 Q4 = new Question_4();
            //"Now get the max of 3 numbers";
			System.out.println(Q4.maximum(5, 15, 25));
			 //"Now get the min of 3 numbers";
			System.out.println(Q4.minimum(5, 15, 25));
			}

}
