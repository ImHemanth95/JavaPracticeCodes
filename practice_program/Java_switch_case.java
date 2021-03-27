package practice_program;

public class Java_switch_case {

	public static void main(String[] args) {
		int withdrawAmount = 600;
		switch (withdrawAmount) {
		case 100:
			System.out.println("You cant withdraw amount as the balance is less than 500");
			break;
		case 600:
			System.out.println("You can withdraw amount");
			break;
			
		default:
			System.out.println("Please deposit the amount as the balance is should be more than 500");
			break;
		}
		String stdname = "Hemanth";
		int ID = 255;
		switch (ID) {
		case 255:System.out.println("StudentID is:"+stdname);
		break;
		case 500:System.out.println("StudentID is = 500");
		break;
		default:System.out.println("Student ID not found");
		break;
		}
		//calender
		    int month=7; //here we are switching based on the month wise   
		    String monthString="";  //using this blank value under the string to replace every time with condition
		    //Switch statement  
		    switch(month){    
		    //case statements within the switch block  
		    case 1: monthString="1 - January";  
		    break;    
		    case 2: monthString="2 - February";  
		    break;    
		    case 3: monthString="3 - March";  
		    break;    
		    case 4: monthString="4 - April";  
		    break;    
		    case 5: monthString="5 - May";  
		    break;    
		    case 6: monthString="6 - June";  
		    break;    
		    case 7: monthString="7 - July";  
		    break; 
		    case 8: monthString="8 - August";  
		    break; 
		    case 9: monthString="9 - September";  
		    break; 
		    case 10: monthString="10 - October";  
		    break; 
		    case 11: monthString="11 - November";  
		    break;
		    case 12: monthString="12 - December";  
		    break; 
		    default:
		    	System.out.println("Please select the proper month");
		    }
		    System.out.println(monthString);
		    System.out.println("--------------------");

	String levelString="Expert";  
    int level=0;  
    //Using String in Switch expression  
    switch(levelString){    
    //Using String Literal in Switch case  
    case "Beginner": level=1;  
    break;    
    case "Intermediate": level=2;  
    break;    
    case "Expert": level=3;  
    break;    
    default: level=0;  
    break;  
    }    
    System.out.println("Your Level is: "+level);  
    System.out.println("---------------------------------");
    char branch = 'E';
    int collegeYear = 4;
    switch (collegeYear) {
	case 1:System.out.println("english,maths,science");
		break;
	case 2:switch(branch) {
	case 'C':System.out.println("OS,Java,DataStructure");
	break;
	case 'E':System.out.println("EC,dynamo,EcTech");
	break;
	case 'M':System.out.println("Wheel,Cumbussion,Measurement");
	break;
	}
	break;//this break is for the 2nd case
	case 3:switch(branch) {
	case 'C':System.out.println("Python,Scripting,DataStructure");
	break;
	case 'E':System.out.println("Magnet,switches,ElectricFlow");
	break;
	case 'M':System.out.println("Motion,Lift,Measurement");
	break;
	}
	break;
	case 4:switch(branch) {
	case 'C':System.out.println("Golang,Scripting,DataStructure");
	break;
	case 'E':System.out.println("AC,DC,ElectricFlow");
	break;
	case 'M':System.out.println("Friction,Motion,Lenght");
	break;
	}
	break;
	default:System.out.println("Branch and year not found");
		break;
	}
    int i = 9;
    switch(i) {
    case 0:
    	System.out.println("i is zero");
    	break;
    case 1:
    	System.out.println("i is one");
    	break;
    case 3:
    	System.out.println("i is three");
    	break;
    default:
    	System.out.println("i is greater than 3");
    }
}    
}   
