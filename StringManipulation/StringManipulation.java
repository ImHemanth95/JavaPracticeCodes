package StringManipulation;

public class StringManipulation {
	

	public static void main(String[] args) {
		getInfo("Username");//calling this method we will get the output = //input[@id='Username']
	}
	public static void getInfo(String value) {
		String xpath = "//input[@id='"+value+"']";
		System.out.println(xpath); 
	}

}
