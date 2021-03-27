package practice_program;

public class Employee_class {
	//Class is always the blue print of the objects that are getting created and that is used for diff ways
	//Its an category of all objects
	//It acts as an template for every objects that is created
	String name;
	int ID;
	int age;
	double salary;
	String company;
	long phonenumber;
	//This above called as the class variables
	public static void main(String[] args) {
		//to access the class vairables - we need to create an object of that class, using class name
		Employee_class E1 = new Employee_class();
	  //Employee_class- is the class name 
	 //E1 is the class reference
	//new is a keyword that indicates that its an newly used.
	//new Employee_class(); - is called as the actual object creation that contains all the class variables for objects
	//() - this indicatest that it can consists of any parameters, that can be passed as parameters
	E1.name="Hemanth";
	E1.age=20;
	E1.salary=25500.50;
	E1.company="Amazon";
	E1.phonenumber=90668303;
	E1.ID=2021;
	System.out.println("Age of employee ID ="+" "+E1.ID+" "+"is"+" "+E1.age);
}

}
