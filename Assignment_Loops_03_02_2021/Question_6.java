//Q6. Print even number (0 2 4 6 8 10) using for/while/dowhile loop.
package Assignment_Loops_03_02_2021;

public class Question_6 {

	public static void main(String[] args) {
		//even num(0-10) using forloop
	     for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				
		}
	}		    System.out.println("---End-of-for-loop------");
			int a = 0;
		   while(a<=10) {
				if(a%2==0) {
					System.out.println(a);
				}
				a++;
			}
		    System.out.println("----Endof-while-loop------");
			int i =0;
			
			do {
				if((i%2==0)) {
					System.out.println(i);
					
				}
				i++;
			}
				while(i<=10);
			System.out.println("-----End-of-Do-while-loop--");
			}
	}

	



		
		



//while(i<=10) {
//	System.out.println(i);
//	i++;
//	if(i==7) {
//		break;
