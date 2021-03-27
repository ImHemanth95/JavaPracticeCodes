//Q7.Print odd number (1 3 5 7 9) using for/while/dowhile loop.
package Assignment_Loops_03_02_2021;

public class Question_7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
				
		}
	}		    System.out.println("---End-of-for-loop------");
			int a = 1;
		   while(a<=10) {
				if(a%2==1) {
					System.out.println(a);
				}
				a++;
			}
		    System.out.println("----Endof-while-loop------");
			int i =1;
			
			do {
				if((i%2==1)) {
					System.out.println(i);
					
				}
				i++;
			}
				while(i<=10);
			System.out.println("-----End-of-Do-while-loop--");
		
	}

}
