//Q1.
package Assignment_Constructors_17_02_2021;
import java.util.*;

public class UniversityDetails {

	public static void main(String[] args) {
		University_1 d1 = new University_1();//default constructor calling
		System.out.println(d1);
		University_1 U1 = new University_1("Banglore University");
		System.out.println(U1);
		System.out.println("-----------------");
		//get method
		String UniName = U1.getUninversityName();
		System.out.println("Getting the universtiy name="+UniName);
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("MCA-Master of computer application");
		courses.add("BCA-Bachelor of computer application");
		courses.add("MTech-Computerscience");
		
		University_1 U2 = new University_1("BangloreUniversity","Inida","1980-02-01",courses);
		System.out.println("#####Getting the list of the course list from the university offerred#####");
		System.out.println(U2.courselist);
		
	

		}
		
       
	}


