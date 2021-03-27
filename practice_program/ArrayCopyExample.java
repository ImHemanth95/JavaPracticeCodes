package practice_program;
import java.util.*;

public class ArrayCopyExample {
	

	public static void main(String[] args) {
		//First array that is called as the source file
		String Source[] = {"String","Hi","Bye","zero"};
		//destination array that needs to be copied with an empty array
		String destination[]= new String[2];
		//Now copy from the source to destination array from array index 0-2 values only to destination
		System.arraycopy(Source, 2, destination, 0, 2);
		//Now print the value of the copied array to destination
		System.out.println(String.valueOf(destination));
		}
	}
/*
 Copies an array from the specified source array, beginning at the specified position, 
 to the specified position of the destination array. 
 A subsequence of array components are copied from the source array referenced by src to the destination array referenced by dest.
 The number of components copied is equal to the length argument. 
 The components at positions srcPos through srcPos+length-1 in the source array are copied into positions destPos through destPos+length-1, 
 respectively, of the destination array. 
 */
