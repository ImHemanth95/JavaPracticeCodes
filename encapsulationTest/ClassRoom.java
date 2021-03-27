package encapsulationTest;

public class ClassRoom {

private String StdName;
private int StdRollNo;
private int StdID;

public void setName(String StdName) {
	this.StdName= StdName;
}
public void setRollNo(int StdRollNo) {
	this.StdRollNo=StdRollNo;
}
public void setStdID(int StdID) {
	this.StdID=StdID;
}
public String getName() {
	System.out.println("your name is="+StdName);
	return StdName;
}
public int getRollNo() {
	System.out.println("your RollNo="+StdRollNo);
	return StdRollNo;
}
public int getStdID() {
	System.out.println("your StudentID="+StdID);
	return StdID;
}

}
