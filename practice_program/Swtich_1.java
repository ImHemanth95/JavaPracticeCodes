package practice_program;

public class Swtich_1 {

	public static void main(String[] args) {
		
		String name = "HEMANTH";
		switch (name.toLowerCase()) {
		case "hemanth":
			System.out.println("Its Hemanth here");
			break;
		case "Naveen":
			System.out.println("Its Naveen here");
			break;
		//case "Naveen": ---- If we write the same case then we get the error as duplicate case.
			//System.out.println("Its Naveen here");
			//break;
			
		default:
			System.out.println("Its no one here");
			break;
		}
	}

}

