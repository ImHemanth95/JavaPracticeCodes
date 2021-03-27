package practice_program;

public class Adding_of_2_matrices {

	public static void main(String[] args) {
		//now we are adding the 2 matrices
		//create the two arrays
		int a[][]= {{1,3,5},{1,3,5}}; //2rows*3coloumns matrices
		int b[][]= {{1,3,5},{1,3,5}};
		//now create one more variable to get the array added
		int c[][]=new int[3][3];
		//adding and printing the values
		for(int i=0;i<2;i++) {//as this is the with 2 rows
			for(int j=0;j<3;j++) {//as this is with 3 coloumns
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
