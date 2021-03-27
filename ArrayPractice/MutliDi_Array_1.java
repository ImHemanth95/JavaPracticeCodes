package ArrayPractice;

public class MutliDi_Array_1 {

	public static void main(String[] args) {
		//Multidimensional Arrays can be defined in simple words as array of arrays. 
		//Data in multidimensional arrays are stored in tabular form (in row major order).
		
		/*
		  Two dimensional array:
          int[][] twoD_arr = new int[10][20];

          Three dimensional array:
          int[][][] threeD_arr = new int[10][20][30];*/
	
		//ex1: TwoD
		int[][]two_D = new int [10][20];
		two_D[0][0]=1;
		
		System.out.println("arr[0][0]=" + two_D[0][0]);
	
	    int[][][]three_D = new int[10][20][30];
	    three_D[0][0][0]=1;
	    three_D[1][1][1]=2;
	    three_D[2][2][2]=3;
	    
	    System.out.println("--------------------------------");
	    
	    System.out.println("three_D[0][0][0]=" + three_D[0][0][0]);
	    System.out.println("three_D[1][1][1]=" + three_D[1][1][1]);
	    System.out.println("three_D[2][2][2]=" + three_D[2][2][2]);
	    
	   System.out.println("-----------------------------------------");
	   
	   int[][][] arr = {{{1,2,5},{3,4,6}},{{5,8,4},{7,5,9}}};
	   for(int i=0;i<2;i++) {
		   for(int j=0;j<2;j++) {
			   for(int k=0;k<2;k++) {
				   System.out.print(arr[i][j][k]+" ");
			   }
			   System.out.println();
		   }
		   System.out.println();
	   }
	    
	    
	}
	

}
