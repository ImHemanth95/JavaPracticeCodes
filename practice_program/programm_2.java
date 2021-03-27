package practice_program;

public class programm_2 {

	public static void main(String[] args) {
		
		//double d1 = 2.5;
		//if-else-if
		int a = 100;
		int b = 25;
		int c = 50;
		int large;
		
		if(a>=b) {
			if(a>=c) {
				large = a;
			}
			else {
				large = b;
				
			}
		}
		else {
			if(b>=c) {
				large = b;
			}
			else {
				large = c;
			}
			
		}
			System.out.println("Largest is " + large);	
		
		}
}

