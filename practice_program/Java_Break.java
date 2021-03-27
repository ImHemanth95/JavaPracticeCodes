package practice_program;

public class Java_Break {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		int j = 1;
		while(j<=10) {
			if(j==5) {
				j++;
				break;
			}
			System.out.print(j);
			j++;
		}

	}

}
