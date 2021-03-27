package practice_program;

public class NullPointer_exception {
	String name;
	int age;
	public static void main(String[] args) {
		NullPointer_exception NEW = new NullPointer_exception();
		NEW.name="Hemanth";
		NEW.age=20;
		System.out.println(NEW.age);
		System.out.println(NEW.name);
		//Now assign the values to NULL to get the null pointer exception
		NEW=null;
		System.out.println(NEW);
		System.out.println(NEW.age);
		}

}
