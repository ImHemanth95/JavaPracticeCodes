package Assignment_19_02_2021_Interface;

public class BGS_Hospital extends Medical,Fortis_Hospital implements UKMedicalService,UsMedicalService,IndianMedicalService{

	@Override
	public void cancerTreatment() {
		System.out.println("BGS_Hospital-cancerTreatment");
		
	}

	@Override
	public void GeneralcheckupService() {
		System.out.println("BGS_Hospital-GeneralcheckupService");
		
	}

	@Override
	public void EmergencyService() {
		System.out.println("BGS_Hospital-GeneralcheckupService");
		
	}

	@Override
	public void GynacologyService() {
		System.out.println("BGS_Hospital-GynacologyService");
		
	}

	@Override
	public void CardioService() {
		System.out.println("BGS_Hospital-CardioService");
		
	}

	@Override
	public void TransplantService() {
		System.out.println("BGS_Hospital-TransplantService");
		
	}

	@Override
	public void chemotherapyService() {
		System.out.println("BGS_Hospital-chemotherapyService");
	}

	@Override
	public void oncologyService() {
		System.out.println("BGS_Hospital-oncologyService");
		
	}
	@Override
	public void pathologyService() {
		System.out.println("BGS_Hospital-pathologyService");
		
	}

	@Override
	public void CovidTest() {
		System.out.println("BGS_Hospital-CovidTest");
		
	}

	@Override
	public void GlobalPolio() {
		System.out.println("BGS_Hospital-GlobalPolio");
		
	}

}
