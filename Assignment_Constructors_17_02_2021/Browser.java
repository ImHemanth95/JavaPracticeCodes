package Assignment_Constructors_17_02_2021;

import java.util.ArrayList;

public class Browser {
	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String>plugins_supported;
	
	public Browser() {
		System.out.println("This is a Browser");
	}
	public Browser(String browserName) {
		this.browserName=browserName;
		System.out.println("This current browserName="+browserName);
		
	}
	public Browser(String browserName,String vendorName,double currentVersion,ArrayList<String>plugins_supported ) {
		this.browserName=browserName;
		this.vendorName=vendorName;
		this.currentVersion=currentVersion;
		this.plugins_supported=plugins_supported;
//		System.out.println("University belongs to this country ="+country+" "+"and was Established at="+EstablishedDate+" "+"University name is = "+name);
	}
	public String getBrowserName( ) {
		return browserName;
	}
	public String getvendorName( ) {
		return vendorName;
	}
	public double getcurrentVersion( ) {
		return currentVersion;
	}

}
