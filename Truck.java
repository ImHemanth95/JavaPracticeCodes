package AccessModifiers;

public class Truck {

	//same package but not the sub class, where you can access every thing but not private.
	public static void main(String[] args) {
		car c = new car();
		c.name= "test";
		c.getPrice();
		c.getcarColor();
		c.name="Green";
		c.price=4444;
		
		
	}

}
