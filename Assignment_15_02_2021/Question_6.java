//Q6.A person is elligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is elligible to vote.
package Assignment_15_02_2021;

public class Question_6 {
	String gender;
	public boolean vote(int age,String gender) {
		if(age>18) {
			System.out.println("Yes you are elgible for voting"+" and your gender is = "+gender+" "+"and your age is ="+age);
		}
		else {
			System.out.println("you are not elgible for the voting,as your age is under 18- Try next year...");
			return false;
			}
		return true;
		}

	public static void main(String[] args) {
    
		Question_6 Q6 = new Question_6();
		System.out.println(Q6.vote(25,"Male"));

	}

}
