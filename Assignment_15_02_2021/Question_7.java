/*Q7.Write a program which will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */
package Assignment_15_02_2021;

public class Question_7 {
	public String Marks(int marks) {
		String grade = null;
		if(marks>=91 && marks<=100) {
			grade="AA";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
		}
		else if(marks>=81 && marks<=90) {
			grade="AB";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
			}
		else if(marks>=71 && marks<=80) {
			grade="BB";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
		}
		else if(marks>=61 && marks<=70) {
			grade="BC";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
			}
		else if(marks>=51 && marks<=60) {
			grade="CD";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
			}
		else if(marks>=41 && marks<=50) {
			grade="CD";
			System.out.println("your marks is="+marks+" "+"your grade is = "+grade);
			}
		else if(marks<=40) {
			grade="Failed";
			System.out.println("your marks is"+"="+" "+marks+" "+"your grade is = "+grade);
			}
		else {
			System.out.println("You have not entered the marks,please enter the marks");
		}
		return grade ;
		}
	public static void main(String[] args) {
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("Enter your marks here:");
//		 int marks = myObj.nextInt();
		 Question_7 m = new Question_7();
		 m.Marks(25);
		 }
}
