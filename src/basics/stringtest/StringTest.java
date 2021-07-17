package basics.stringtest;

public class StringTest {

	/**
	 * Convert character array into string
	 */
	public static void main(String[] args) 
	{
		   String s1="Sachin";  
		   //String s8= s1.substring(1,2);
		  // String s9= new String(s1.substring(1,2));
		   String s2="Sachin";  
		   String s3=new String("Sachin").intern();  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   if(s1==s2) System.out.println("s1==s2");//The = = operator compares references not values. 
		   if(s1==s3) System.out.println("s1==s3");

	}

}
