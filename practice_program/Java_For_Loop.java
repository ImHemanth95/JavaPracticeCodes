package practice_program;

public class Java_For_Loop {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" ");
		}
		System.out.println("///////////////////////");
		for(int j=1;j<=3;j++) {
			for(int k=1;k<=3;k++) {
				System.out.println(j+" "+k);
			}
		}
		//Pyramid example in increasing order
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
	//pyramid patter in decreasing order
	int pattern = 6; 
	for(int i=1;i<=pattern;i++) {
		for(int j=pattern;j>=i;j--) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	//break statement
	for(int i=0;i<10;i++) {
		if(i==5)
			break;
		System.out.println("i: "+i);
	}
	System.out.println("Loop is completed");
	for(int i=0;i<10;i++) {
		if(i%2==0)
			continue;
		System.out.print(i+" ");
	}
}
}