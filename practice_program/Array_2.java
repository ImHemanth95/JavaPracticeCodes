package practice_program;

public class Array_2 {

	public static void main(String[] args) {
		//This is called as static array and this is can be of fixed size.
		int []i = new int[4];
		i[0]= 10;
		i[1]=11;
		i[2]=12;
		i[3]=40;
		System.out.println("this is called as a static array");
		//now we need to use for loop for getting printed with the values.
		for(int a=0;a<i.length;a++) {
			System.out.println("Index="+a+"Index values is=" + i[a]);
			}
		System.out.println("End of the for loop");

	    //for each loop,need to initialize the value to"b" as an int data type and then with "i" as the array(i)
	    for(int b : i) {
	    	System.out.println(b);
	    	}
	    System.out.println("This is the current length of an array =" + i.length);
	    System.out.println("---------------------------------------------------");
	    //double array
	    double total = 0;
	    double d1[] = {20.2,55.50,144.20};
	    for(int c=0;c<d1.length;c++) {
	    	total = total+d1[c];
}
	    System.out.println("Total="+total);
	    }
}
/*First value of array index is always starts with zero index
1.Length of the array is always size of the array +1 = array length. Ex:0-3is the index so index =3+1 is the lenght
2.highest index = length-1 (4-1 = 3), so 3 is the highest index.
3.If we are trying to get the array element that is out the range, that is i[4], which is not present in the array-"ArrayIndexBoundOfException".
4.Array is always a fixed size and easy for accessing the array, and its fast in the access.
5.Array is always a collection of diff data types and size and length.
6.If you to fetch the value if its not assigned that is i[2]= not defined and its an integer value,then you will get the default value =0, only
7.if your array size is of 4 and then if you have not declared the arr[2] then its 0, same works with diff size and the data types.
8.More usage of memory if you are using array sizee=4 and then not using it, will consume the memory.
if you have less space and then u want to store more data then you will not have size left
9. Default value for diff data types 
 A.Integer =0
 B.String =Null
 C.Double =00.0
 D.Char='\u0000'
 E.Boolean =False
10.Default value of "Object Array is = Null"(Non-Primitive data types)
11.Object is always an "Non-Primitive data types".
1
*/



