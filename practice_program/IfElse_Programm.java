package practice_program;

public class IfElse_Programm {

	public static void main(String[] args) {
		//to find the the year is leap year or not
		int year = 2020;
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
			System.out.println("Its a leap year");
		}
		else {
			System.out.println("Its not an leap year");
		}
/*Using Ternary Operator --
We can also use ternary operator (? :) to perform the task of if...else statement. It is a shorthand way to check the condition. 
If the condition is true, the result of ? is returned. But, if the condition is false, the result of : is returned.*/
		int number = 13;
		String output = (number%2==0)?"even number":"odd number";
		System.out.println(output);
	

//No we will see how the if else if works/if else ladder
	int marks = 45;
	if(marks<50) {
		System.out.println("you marks scored = 3rdGrade");
	}
	else if(marks<30) {
		System.out.println("you marks scored = Failed");
	}
	else if(marks>=50 && marks<=65) {
		System.out.println("you marks scored = 2ndGrade");
	}
	else if(marks>=70 && marks<=100) {
		System.out.println("you marks scored = 4thGrade");
	}
	else {
		System.out.println("re-exam is needed");
	}
//Nester if
	int age=-1;
	int weight = 75;
	if(age>=18) {
		if(weight>=75) {
			System.out.println("you are eligble for tournament");
		}
		else {
			System.out.println("you are not eligble for tournament");
		}
		}
	else {
		System.out.println("Please come back after 18 years");
	}
	}
}


