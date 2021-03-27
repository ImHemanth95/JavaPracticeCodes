package practice_program;

public class Interview_question {
	String name;
	int age;
	String city;
   public static void main(String[] args) {
	   //1st object
	   Interview_question U1 =  new Interview_question();
	   U1.name="Myname_is_Hemanth";
	   U1.age=25;
	   U1.city="Bangalore";
	   //2nd Object
	   Interview_question U2 =  new Interview_question();
	   U2.name="Myname_is_Adhi";
	   U2.age=25;
	   U2.city="Bangalore";
	   //3rd Object
	   Interview_question U3 =  new Interview_question();
	   U3.name="Myname_is_gowtham";
	   U3.age=25;
	   U3.city="Bangalore";
	   
	   //Assign the values of one object to another
	   //U1=U2;
	   //U1=U3;
	   //U2=U3;
	    U3=U1;
	   
	   System.out.println("MyName"+" "+U1.name+" "+U1.age+" "+"from"+U1.city);
	   System.out.println("MyName"+" "+U2.name+" "+U2.age+" "+"from"+U2.city);
	   System.out.println("MyName"+" "+U3.name+" "+U3.age+" "+"from"+U3.city);
	   
	   }
}
