package AccessModifiers;

public class Benz extends car {

	public static void main(String[] args) {
		Benz b = new Benz();
		b.color="Black";
		//you can get the price of the car as this is in same package
		//but you cant access the private variables
		//private methods are also only accessable to the only class
		b.getPrice();
		//b.getEngine(); -- this method still we cannot access 
		b.getcarColor();
	
	    //private cant be accessed
		car c = new car();
		//c.engine; -- as this is still private in the car class it cannot be accessed
		c.getPrice();
		
		

	}

}
