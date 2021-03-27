package encapsulationTest_1;

public class MsRamaiah_College extends UniversityA {

	String collegename;
	double collegeFees;
	String collegeAddress;
	private double AdmissionFee;

	public void CollegeName(String collegename) {
		System.out.println("your college name is="+" "+collegename);
	}
	public void collegeStrength(double Studentcounts) {
		System.out.println("College strength is="+" "+Studentcounts);
	}
	public void adminssionfee(double AdmissionFee) {
		this.setAdmissionFee(AdmissionFee);
		System.out.println("your college admission fee is="+" "+AdmissionFee);
	}
	public void University_address(String address) {
		System.out.println("your university address="+address);
	}
	public double getAdmissionFee() {
		return AdmissionFee;
	}
	public void setAdmissionFee(double admissionFee) {
		AdmissionFee = admissionFee;
	}
	public String getCollegeName() {
		return collegename;
	}

}
