package StringManipulation;
//split/reverse/again_concatinate

public class ReverseStringFunc {

public static void main(String[] args) {
	String str = "IM_JAVA_I_CAN_GET_CODE_READY";
	System.out.println(str);
	String r = reverseStrSplit(str);
	System.out.println(r);
//	String rep = replce(str);
//	System.out.println(rep);
//	reverseStrSplit(rep);
//	
	
	
}
public static String reverseStrSplit(String str) {
	
	String words[] = str.split("_");
	String reverseword = "";
	for(String w:words) {
		StringBuilder sb = new StringBuilder(w);
		sb.reverse();
		reverseword = reverseword+ sb.toString();
		}
	return reverseword;
	
}
public static String replce(String re) {
	
	String rep = re.replace(reverseStrSplit(re), "_");
	return rep;
}

}
//
//}
//	 public static void reverseStrSplit(String str) {
//	 String words[] = str.split("_");
//	 int len = words.length;
//	 String rev = "";
//	 for(int i=len-1;i>=0;i--){
//	 rev = rev+rev.charAt(i);
//	 }
//	 System.out.println(rev);
//	 
//	 }
//}

	
