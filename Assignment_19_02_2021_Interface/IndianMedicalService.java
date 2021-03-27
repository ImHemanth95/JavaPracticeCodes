package Assignment_19_02_2021_Interface;

public interface IndianMedicalService extends WHO {
	int INDMED_FEE = 100;
	public void cancerTreatment();
	public void GeneralcheckupService();
	public void EmergencyService();
	
	public static void billing() {
		System.out.println("IndianStandard-Billing");
	}
	default void taxCollection() {
		System.out.println("IND-GST of 8%");
	}
	
	

}
