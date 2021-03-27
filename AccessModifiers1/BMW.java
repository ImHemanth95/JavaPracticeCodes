package AccessModifiers1;

import AccessModifiers.car;
//for the class with diff package if we need to access those class then you need to use the import of car

public class BMW  extends car{

	public static void main(String[] args) {
		
		BMW BM = new BMW();
		BM.color="Yellow";
		//but still you can access private variables
		//in diff pacakage, but sub class we can access only proteced and public
		//BM.name="BMW"; --- this is still not accessable as this is restriced
		BM.getcarColor();
		BM.getPrice();
		BM.price=45555;
		
		
		
	}

}
