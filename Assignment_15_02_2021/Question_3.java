/*Q3.Write a program to print the circumference and area of a circle of radius entered by defining your own method*/
package Assignment_15_02_2021;

public class Question_3 {
	//creating an method for getting the circumference of the circle
	static double pi =3.1415;
	public double circumference(int radius) {
		System.out.println("This method calculates the circle circumference");
		double cir = 2*pi*radius;
		return cir;
}
public static void main(String[] args) {
	//object creation
	Question_3 Q3 = new Question_3();
	System.out.println("Now we are getting the circle circumference");
	System.out.println(Q3.circumference(5));
	
	
		

	}

}
