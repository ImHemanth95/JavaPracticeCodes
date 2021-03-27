//Q5.Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered

package Assignment_Loops_03_02_2021;

public class Question_5 {

	public static void main(String[] args) {
		//1-10,quit if u encounter 7
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i==7) {
				break;
			}
		}

	}

}
//in the above i want to print at the line where it stops with the above print statement how i can?