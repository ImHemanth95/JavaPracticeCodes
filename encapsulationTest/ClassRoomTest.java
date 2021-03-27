package encapsulationTest;

public class ClassRoomTest {

	public static void main(String[] args) {
		ClassRoom C1 = new ClassRoom();
		C1.setName("Hemanth");
		C1.setRollNo(250);
		C1.setStdID(12);
		System.out.println(C1.getName());
		System.out.println(C1.getRollNo());
		System.out.println(C1.getStdID());
	}

}
