//Write a Java program to update specific array element by given element.
package Assingment_09_02_2021;
public class Question_4 {

	public static void main(String[] args) {
    int[]arr = new int[3];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	System.out.println("value of array index of 2 is" +" "+ arr[2]);
	arr[2]=40;
	System.out.println("the updated value of array index of 2 is" + " " + arr[2]+" "+"now");
	
	
    for(int i = 0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    }
	

	}

}
