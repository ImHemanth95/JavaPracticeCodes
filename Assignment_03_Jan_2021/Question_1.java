//How to print the ASCII values for a-z,using for loop

package Assignment_03_Jan_2021;

public class Question_1 {

	public static void main(String[] args) {
		//we will take the values of the a-z(97 to 122) instead
	    //for (int a=97;a<=122;) {
		//System.out.println("ASCII values for" +" "+(char)a + ":" + a);
		//a++;
		
		for(char c = 'a';c<='z';c++) {
			System.out.println((int)c);
		
	    }
	}
}



//int charac = 0;
//int ascii = charac;
//for (char c ='a';c<='z';c++) {
//	int ToAscii = (int)charac;
//	System.out.println("ASCII values of" + c + ascii);
//	
