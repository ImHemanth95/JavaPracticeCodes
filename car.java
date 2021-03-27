package AccessModifiers;

public class car {

	//same class i can every access modifiers
	String name;
	private String engine;
	public int price;
	protected String color;
	
	private void getEngine() {
		System.out.println("this is car engine");
	}
	public void getPrice() {
		System.out.println("Getting price of a car");
	}
	protected void getcarColor() {
		System.out.println("Getting the car color");
	}
	
	
	public static void main(String a[]) {
		car c = new car();
		c.name="Tesla";
		c.engine="TES22200TE";
		c.price=1222;
		c.color="Blue";
	}
	
	
}
