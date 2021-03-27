package encapsulationTest_1;

public class TestCollege {

	public static void main(String[] args) {
		MES_College MES = new MES_College();
		MES.setAdmissionFee(25000);
		MES.getAdmissionFee();
		MES.adminssionfee(12000);
		MsRamaiah_College MS = new MsRamaiah_College();
		MS.getCollegeName();
		MS.CollegeName("MSRamaiah");
		MS.getCollegeName();
		MS.CollegeName("MS_RAMAIAH_COLLEGE");
		MS.getCollegeName();
		//This is from Child to parent Top_casting,in this you can access only the parent elements.
		UniversityA UA = new MES_College();
		System.out.println(UA.collegeName);
		//This is from parent to child class casting-downcasting
		MES_College Mes = (MES_College) new UniversityA();
		Mes.University_address("TEST");
		
		
		

	}

}
