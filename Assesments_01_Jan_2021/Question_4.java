////Write a Java program to print the result of the following operations. Change your test data accordingly.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9 
//c. 20 + -3*5 / 8 
//d. 5 + 15 / 3 * 2 - 8 % 3 
//Expected Output :
//43 
//1 
//19 
//13

package Assesments_01_Jan_2021;

public class Question_4 {

	public static void main(String[] args) {
		//a -5+8*6
		int a = -5;
		int b = 8;
		int c = 6;
		
		System.out.println(b*c+a);
		
		//b.(55+9) % 9 
		int A = 55;
		int B = 9;
		int C = 9;
		System.out.println((A+B)%C);
		
		//c. 20 + -3*5 / 8
		int aa = 20;
		int ab = -3;
		int ac = 5;
		int ad = --ab*ac;
		System.out.println(aa+-ab*ac/ad);
		//As this gives the value with in decimals like 18.923 etc an as its an int it rounded of values
		
		//d.5 + 15 / 3 * 2 - 8 % 3 
		int bb = 5;
		int cc=15;
		int dd = 3;
		int ee = 2;
		int ff = 8;
		int gg = 3;
		System.out.println(bb+cc/dd*ee-ff%gg);
		

	}

}
