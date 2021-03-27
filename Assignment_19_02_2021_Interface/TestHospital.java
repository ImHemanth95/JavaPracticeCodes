package Assignment_19_02_2021_Interface;

public class TestHospital {
	public static void main(String[] args) {
		Fortis_Hospital FH = new Fortis_Hospital();
		FH.cancerTreatment();
		FH.CardioService();
		FH.chemotherapyService();
		System.out.println(IndianMedicalService.INDMED_FEE);
		IndianMedicalService.billing();
		
		
		IndianMedicalService IND = new Fortis_Hospital();
		System.out.println(IND.INDMED_FEE);
		IND.EmergencyService();
		IND.GeneralcheckupService();
		BGS_Hospital BGS = new BGS_Hospital();
		BGS.taxCollection();
		
	}

}
