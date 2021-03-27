package LogicalProgramming;

public class Fibonacci_Programm {
	
	static void Fibonacci(int N) {
		int num1=0,num2=1;
		int count  = 0;
		//interate till N
		while(count<N) {
			System.out.print(num1+" ");
			
			//now swap
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
			count = count+1;
		}
	}
	public static void main(String [] args) {
		int N = 10;
		Fibonacci(N);
		
	}

}
