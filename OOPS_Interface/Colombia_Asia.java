package OOPS_Interface;

public class Colombia_Asia extends Medical implements IndianMedical,UsMedical,UKMedical  {//now we have two class as parent classes

	
	@Override
	public void cardio() {
		System.out.println("CA-CardioServices");
		
		
	}

	@Override
	public void Emergencyservice() {
		System.out.println("CA-Emergencyservice");
		
		
	}

	@Override
	public void ICU() {
		System.out.println("CA-ICU Services");
		
	}

	@Override
	public void orthoservice() {
		System.out.println("CA-OrthoServices");
		
	}

	@Override
	public void GeneralCheckup() {
		System.out.println("CA-GeneralCheckup");
		
	}

	@Override
	public void ENTService() {
		System.out.println("CA-ENTService");
		
	}

	@Override
	public void pysiotreatment() {
		System.out.println("CA-pysiotreatment");
		
	}

	@Override
	public void cancertreatment() {
		System.out.println("CA-cancertreatment");
		
	}
	//these are the separate methods that are used
	public void EyeTreatments() {
		System.out.println("CA-EyeTreatments");
	}

	@Override
	public void CovidTest() {
		System.out.println("CA-CovidTest");
		
	}
	
	
    

}

