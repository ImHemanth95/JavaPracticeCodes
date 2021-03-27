package practice_program;

class student{
	public int rollno;
	public String name;
	student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
}
}
public class ArrayPractice {

	public static void main(String[] args) {
		
		student[]arr;
		arr = new student[5];
		arr[0]= new student(1,"test");
		arr[1]= new student(2,"test1");
		arr[2]= new student(3,"test2");
		arr[3]= new student(4,"test4");
		arr[4]= new student(5,"test5");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at " + i + " : " + 
                    arr[i].rollno +" "+ arr[i].name);
		}
		//for exception of arrayindexbound  -- and this is run time
//		int[] r = new int[2];
//		r[0]=10;
//		r[1]=20;
//		for(int i = 1;i<=r.length;i++) {
//			System.out.println(r[i]);
//		}
		
		}
		
		
		
		
		
		

	}



