package Assignment_Constructors_17_02_2021;

import java.util.ArrayList;

public class University_1 {
		String name;
		String country;
		String EstablishedDate;
		ArrayList<String>courselist;
		
		public University_1() {
			System.out.println("This is top university");
		}
		public University_1(String name) {
			this.name=name;
			System.out.println("University name="+name);
			
		}
		public University_1(String name,String country,String EstablishedDate,ArrayList<String>courselist ) {
			this.name=name;
			this.country=country;
			this.EstablishedDate=EstablishedDate;
			this.courselist=courselist;
//			System.out.println("University belongs to this country ="+country+" "+"and was Established at="+EstablishedDate+" "+"University name is = "+name);
		}
		public String getUninversityName( ) {
			return name;
		}
		public String getUninversityCountry( ) {
			return country;
		}
		public String getUninversityEstablishedDate( ) {
			return EstablishedDate;
		}
		
	}

