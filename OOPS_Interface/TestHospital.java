package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {
		Colombia_Asia c = new Colombia_Asia();
		c.cardio();
		c.cancertreatment();
		c.Emergencyservice();
		c.EyeTreatments();//these is the separate method or not overrided method of colombia class
        //Topcasting :child class object is refered to Parent class
		IndianMedical In = new Colombia_Asia();
		In.cardio();
		In.ICU();
		UKMedical UK = new Colombia_Asia();
		UK.cancertreatment();
		c.RD();//Now we can access the RD method using the Medical class.
		//UsMedical.min_fee=1200; you cannot change the static v
		
		
        
	}

}
