//Q1.Template for University class
package Assignment_Constructors_17_02_2021;
import java.util.ArrayList;

public class University {
	String name;
	String country;
	String EstablishedDate;
	
	public University() {
		System.out.println("This is top university");
	}
	public University(String name) {
		this.name=name;
		System.out.println("University name="+name);
		
	}
	public University(String country,String EstablishedDate ) {
		this.country=country;
		this.EstablishedDate=EstablishedDate;
		System.out.println("University belongs to this country ="+country+" "+"and was Established at="+EstablishedDate);
	}
	public University(String name,String country,String EstablishedDate ) {
		this.name=name;
		this.country=country;
		this.EstablishedDate=EstablishedDate;
		System.out.println("University belongs to this country ="+country+" "+"and was Established at="+EstablishedDate+" "+"University name is = "+name);
	}
	public String getUninversityName( ) {
		return name;
	}
	public String getUninversityCountry( ) {
		return country;
	}
	public String getUninversityEstablishedDate( ) {
		return EstablishedDate;
	}
	public ArrayList<String> UniversityCourses() {
		ArrayList<String> course = new ArrayList<String>();
		course.add("MCA-Master of computer application");
		course.add("BCA-Bachelor of computer application");
		course.add("MTech-Computerscience");
		return course;
	}
	
	

}
