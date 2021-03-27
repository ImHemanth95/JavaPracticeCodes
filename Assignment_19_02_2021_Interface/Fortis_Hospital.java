package Assignment_19_02_2021_Interface;

public class Fortis_Hospital implements IndianMedicalService,UKMedicalService,UsMedicalService {

	@Override
	public void GynacologyService() {
		System.out.println("FORTIS-GynacologyService");
		
		
	}

	@Override
	public void CardioService() {
		System.out.println("FORTIS-CardioService");
		
		
	}

	@Override
	public void TransplantService() {
		System.out.println("FORTIS-TransplantService");
	}

	@Override
	public void chemotherapyService() {
		System.out.println("FORTIS-chemotherapyService");
	}

	@Override
	public void oncologyService() {
		System.out.println("FORTIS-oncologyService");
		
		
	}

	@Override
	public void pathologyService() {
		System.out.println("FORTIS-pathologyService");
		
	}

	@Override
	public void cancerTreatment() {
		System.out.println("FORTIS-cancerTreatment");
		
	}

	@Override
	public void GeneralcheckupService() {
		System.out.println("FORTIS-GeneralcheckupService");
	}

	@Override
	public void EmergencyService() {
		System.out.println("FORTIS-EmergencyService");
		
	}
	public void taxCollection() {
		System.out.println("Fortis-20% tax collection");
	}
	public void medicalInsurance() {
		System.out.println("Fortis-MedicalInsurance");
	}

	@Override
	public void CovidTest() {
		System.out.println("This is Fortis-CovidTest");
		
	}

	@Override
	public void GlobalPolio() {
		System.out.println("This is Fortis-GlobalPolio");
		
	}
	

}
