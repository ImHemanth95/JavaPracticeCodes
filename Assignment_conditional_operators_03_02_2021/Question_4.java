//Q4. Write a Java program to test a person is eligible for vote
//TestData: 
//age is greater than equal to 18 and alive: eligible 
//age is less than to 18 and alive: not eligible
//if not alive: print person does not exist.


package Assignment_conditional_operators_03_02_2021;

public class Question_4 {

	public static void main(String[] args) {
		
		//int age = 18;
		int age = 17;
		String status = "Alive";
		
		if(age>=18 && status=="Alive" ) {
			System.out.println("You are eligible for vote");
		}
		else if(age<18 && status=="Alive" ) {
			System.out.println("You are not eligible for vote");
			
		}
		
	}

}
