package LogicalProgramming;

public class ReverseString_StringBuilder {

	public static void main(String[] args) {
		String rev = "Im Reversed";
		StringBuilder input1 = new StringBuilder();
		
		//now append into input1 reference class
		input1.append(rev);
		
		//now using the stringbuilder class u can use this inbuilt method to rev the string
		input1.reverse();
		
		System.out.println(input1);
		

	}

}
