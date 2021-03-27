package Assignment_arrays_07_02_2021;

public class Question_2 {

	public static void main(String[] args) {
		
//Question 2: Write a program to create a static Array, having following cricket data:
//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//--Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console using normal for/while loop and for each loop
		
		Object[] player_1 = {"Hemanth",25,"RCB","21-02-2021",'M',9.85,true};
		Object[] player_2 = {"Harish",24,"Chennai","22-02-2021",'M',2.5,false};
		Object[] player_3 = {"Venktesh",26,"Delhi","21-02-2020",'M',9,true};
		
//		//For loop
		for(int i=0;i<player_1.length;i++)
		{
			System.out.println(player_1[i]+" ");
		}
		System.out.println("");
		System.out.println("------------------For-Loop---------------------");
		
	//while loop
	int j=0;
	while(j<player_2.length) {
		System.out.println(player_2[j]+" ");
			j++;
			
		}
		System.out.println("");
		System.out.println("-----------------While-Loop----------------------");
		
		//Do while loop
		int k = 0;
		do {
			System.out.println(player_3[k]+" ");
			k++;
		}
		while(k<player_3.length);
		System.out.println("");
		System.out.println("-----------------do-While-Loop----------------------");
	}
	
}

	


	