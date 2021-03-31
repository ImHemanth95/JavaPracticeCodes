package SeleniumSession;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//its an collection
		//stores in the format of key and value pair
		//can have only null key
		//can have any number of null values
		//Map - An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value. 
        //This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface. 
		//duplicate values will be taken but the latest value will be fetched first
		//("name","Tom")- this is called as keyset
		Map<String,String> empMap = new HashMap<String,String>();
		empMap.put("name","Tom");
		empMap.put("ID", "555");
		empMap.put("city", "Banglore");
		empMap.put("country","India");
		empMap.put(null, "Selenium");
		empMap.put(null,"QTP");
		empMap.put("address", null);
		System.out.println(empMap.get("ID"));
		System.out.println(empMap.get(null));
		//System.out.println(empMap.get("address").length());//this address with having value null will give you null pointer exception
		
		
	//how to iterate the hashmap - using entryset
		for(Map.Entry<String,String> entry : empMap.entrySet()) {
			System.out.println("key="+entry.getKey() + "value=" + entry.getValue());
		}
		System.out.println("--------------------------------");
	//KeySet() printing
		for(String str:empMap.keySet())
			System.out.println("Key = "+str);
		System.out.println("--------------------------------");
	//valueSet() printing
		for(String val:empMap.values())
			System.out.println("values = "+val);
		System.out.println("--------------------------------");
		
	//lamda
		empMap.forEach((k,v)->System.out.println("key = "+ k +","+" value = " +v));
		
		
 //virtual capactiy of HashMap = 16 and default time is 0.75secs
//Null will be given as the first pref for the elements in the hasmap
//hashcode for null value is "zero"
//hascode will be stored for every element and some with segments
//ex:  hascode / modulus operation = index() will be created and assigned
//so for every ele there will be hascode associated
//16 defualt segments is the virtual capacity for the hashcode
		
		
		
		

	}

}
