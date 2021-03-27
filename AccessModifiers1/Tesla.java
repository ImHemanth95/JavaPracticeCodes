package AccessModifiers1;

import AccessModifiers.car;

public class Tesla {

	public static void main(String[] args) {
		
		//diff package but no sub class
		car c1= new car();
		c1.price=22222;
		c1.getPrice();//as this is public we will be able to access
		//c1.color="TesT";
		//other than the public rest other - private,protected,default will be hided to access in this type of class
		
		

	}

}
