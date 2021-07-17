package java8.stringjoinmethod;

public class JoinTest {

	public static void main(String[] args) {
		//public static String join(CharSequence delimiter, CharSequence... elements)  
		//public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
		
		String joinString1=String.join("-","welcome","to","javatpoint","javatpoint","javatpoint");  
		System.out.println(joinString1);

	}

}
