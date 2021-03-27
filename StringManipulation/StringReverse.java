package StringManipulation;

import java.lang.*;
import java.io.*;
import java.util.*;

public class StringReverse {
	
	public static void main(String[] args) {
	
		//1.This is using the string builder class - to reverse a string
		
		String input = "Hey there its java lang here";
		//is a java built in class where you will reverse the string as the stringclass does not have reverse method
		StringBuilder data = new StringBuilder();
		//append the string to StringBuilder
		data.append(input);
		//now reverse the string using the string reverse method
		data.reverse();
		System.out.println(data);
		System.out.println("----------------------------end of try one--------------------------");
		//2.This is used to get the string reverse using- reverse string to character
		
		String str = "Hey there its java lang here";
		//now convert the string to character array object to reverse string one by one
		char[] str2 = str.toCharArray();
		//using the array now you loop into it to get the array printed in reverse order
		for(int i = str2.length-1;i>=0;i--) {
			System.out.print(str2[i]);//use the print to get the array printed in one line
		}
		 System.out.println();
		//3.To reverse a string by using stringbuffer method
		
		String str3 = "Hey there its java lang here";
		StringBuffer strbuf = new StringBuffer(str3);
		//to reverse a string
		strbuf.reverse();
		System.out.println(strbuf);
		}
		}



