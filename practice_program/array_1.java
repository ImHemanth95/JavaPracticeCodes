package practice_program;

public class array_1 {

	public static void main(String[] args) {
		double[]mylist = {1.90,2.5,14.2,0.50};
//		//start of for loop example1 printing all the values
//		for(int i = 0;i<mylist.length;i++)
//		{
//			System.out.println(mylist[i]);
//			}
//		//start of for loop example2 getting total value of list
//		double total = 0;
//		for(int j=0;j<mylist.length;j++)
//		{
//			total = total+mylist[j];
//			}
//		System.out.println("total is"+" " + total);
//		//start of for loop for getting the higest of all in array
		double max = mylist[0];
		for(int k=0;k<mylist.length;k++)
		{
			if(mylist[k]>max)
			{
				max = mylist[k];
			}
			//System.out.println("Max of array value is " + max);
		}
		System.out.println("Max of array value is " + max);
	}
	
}

