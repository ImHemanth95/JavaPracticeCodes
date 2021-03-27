package encapsulationTest_1;

public class UniversityA extends Bangalore_central {
	private String UniverstiyName;
	private double Course_fees;
	private String address;
	String collegeName;
	
	public void UniVersityName(String UniverstiyName) {
		System.out.println("your current university name is = "+" "+UniverstiyName);
		this.UniverstiyName=UniverstiyName;
	}
	public void course_fee(double Course_fees) {
		System.out.println("your current university is charging fees = "+" "+Course_fees);
		this.Course_fees=Course_fees;
	}
	public void University_address(String address) {
		System.out.println("University is near ="+" "+address);
		this.address=address;
	}
	public void CollegeName(String collegeName) {
		System.out.println("Your college name is ="+" "+collegeName+"and your collegeUniversityname is = "+" "+UniverstiyName);
	}
	public void setcollgename(String collegeName) {
		this.collegeName=collegeName;
	}
	public String getUniverstiyName() {
		return UniverstiyName;
	}
	
	public void setUniverstiyName(String universtiyName) {
		UniverstiyName = universtiyName;
	}
	public double getCourse_fees() {
		return Course_fees;
	}
	public void setCourse_fees(double course_fees) {
		Course_fees = course_fees;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
