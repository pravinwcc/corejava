package basics.stringtest;

public class StringReverse {

	public static void main(String[] args) {
	
     System.out.println(reverseRecursively("PRAVIN"));

	}
	 public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str;
	        }

	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }
}
