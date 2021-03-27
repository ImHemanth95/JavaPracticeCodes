package practice_program;

public class MultiDimenstionArray {

	public static void main(String[] args) {
		//Its an multi-dimension array or two dimension array
		//syntax is below
		int[][] arr = new int[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}

	}

}
