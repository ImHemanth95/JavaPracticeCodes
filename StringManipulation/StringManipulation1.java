package StringManipulation;

public class StringManipulation1 {

	public static void main(String[] args) {
		String s = "Hello Hi this is my javas code";
		System.out.println(s.length());//provides the length
		System.out.println(s.charAt(5));//prints the character at 5th position
		//System.out.println(s.charAt(23));//if you ttry to access the element that is not present in the string then exce
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 23
		System.out.println(s.indexOf("i"));//to get the index of the particular string or first occurence
		System.out.println(s.indexOf("s", 4));//to start searching the character and at the specified position
		System.out.println(s.indexOf("s", s.indexOf("s")+1));//2nd occurence
		System.out.println(s.indexOf("s", s.indexOf("s")+4));//3rd occurenc
		System.out.println(s.indexOf("code"));
		System.out.println(s.indexOf("byee"));
		//this is the where we find the element that is not present but we will not get the execption instead we get index as -1
		String s1 = "Hello code";
		if(s1.indexOf("code")>0) {
			System.out.println("code is present");
		}
		else {
			System.out.println("code is not present");
		}
		if(s1.equals("Hello code")) {
			System.out.println("Hello code is present");
		}
		else {
			System.out.println("Hello code is not present");
			
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		 
		//trim sa
		String s2 = "   Hello code";
		System.out.println(s2);//before trim 
		System.out.println(s2.trim());//after trim
		
		//String comparision
		String a = "Hii";
		String b = "Byee";
		String c = "Hii";
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
		//same string comparision with some spaces,it gives false space also not inclued
		String a1 = "Hii";
		String b1 = "  Byee";
		System.out.println(a1.equals(b1));
		
		//contains
		String message = "Hi hemanth this is netra here";
		System.out.println(message.contains("hemanth"));
		if(message.contains("netra")) {
			System.out.println("Hi netra");
			}
		else {
			System.out.println("bye netra");
		}
		
		//concatinate
		String a2 = "Hi Mr.";
		String b2 = "Hemanth";
		System.out.println(a2+b2);
		System.out.println(a2.concat(b2));
		
		//substring method- is used to get the values from the desired index values starting
		
		String m = "Your password is 1112000 ";
		System.out.println(m.substring(2));
		//output = ur password is 1112000
		System.out.println(m.substring(2, 10));//range from and to[2,10]
		//how to capture only 1112000 in the string, in this case we will check the starting index from "is+space"-0,1,2=3(so,+3), till with end of the index
		System.out.println(m.substring(m.indexOf("is")+3,m.length()).trim());
		System.out.println(m.substring(m.indexOf("is")+2,m.length()).trim());
		System.out.println(m.substring(m.indexOf("is")+3).trim());
		
		//split
		String lang = "Hi_My_name_is_Hemanth";
		//lang.split("_");//return type of split method will always provide an array so store in the array4
		String[] lang1 = lang.split("_");
		System.out.println(lang1.length);//eliminates _ then prints only string value, but as array, length gives you lenght -5(0,1,2,3,4)
		for(String e:lang1) {
			System.out.println(e);//prints the array values
		}
		String Userdata = "Tom;peter;25-02-2021;IND;USA;77998";
		String [] UserInfo= Userdata.split(";");
		for(String e:UserInfo) {
			System.out.println(e);
		}
		
		String test = "xXTestingxXXJavaXxXseleniumXxpython";
		String mytest[] = test.split("xX");
		System.out.println(mytest[0]);//for this you will get the value blank or no output as becuase while split it splitted xX
		System.out.println(mytest[1]);//output=Testing
		System.out.println(mytest[2]);//output=XJavaX, as the xX is removed, so it strts form XjavaX
		System.out.println(mytest[3]);//output= seleniumX, as the start-xX will be removed and 
		//System.out.println(mytest[4]);-- gets the arrayindexbound of exception here
		
		String testing = "Hi|Bye|tata";
		System.out.println(testing.split("\\|")[0]);//Hi-output
		
		//split by space
		String testing11 = "Hi Testing Eng";
		System.out.println(testing11.split(" ")[2]);//Eng -output
		System.out.println(testing11.split(" ")[1]);//Testing -output
		
		//split by dots
		String testng = "Hi.myname.is.hemanth";
		System.out.println(testng.split("\\.")[1]);
		
		//parsemethods to convert the string values to integer and so on
		String x = "100";
		System.out.println(x+120);//100120
//now convert the it 
		int i = Integer.parseInt(x);
		System.out.println(i+200);//300
		//String to double
		String d = "25.555";
		System.out.println(d+100);
		double d2 = Double.parseDouble(d);
		System.out.println(d2);
		
		//boolean conversion check
		String f = "true";
		if(Boolean.parseBoolean(f)) {
			System.out.println("Yes its true");
		}
		//converting string that contains both "String"+"integers"
		//String ab = "250AA";
		//int k = Integer.parseInt(ab);
		//System.out.println(k);
/* Below is the out put if we try to parse the partial format of string
 Exception in thread "main" java.lang.NumberFormatException: For input string: "250AA"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at StringManipulation.StringManipulation1.main(StringManipulation1.java:132) */
		
		//Q3.Try to remove the string value AA from the below string and then you need to reverse the string
		//String bb = "250AA";
		
		
//Q4. Integer to STring
		int total = 1000;
		String tt = String.valueOf(total);
		System.out.println(tt+""+1200);
		
		
		
		}
	
}
