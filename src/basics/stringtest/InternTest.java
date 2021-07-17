package basics.stringtest;

// intern method is supposed to return the String from the String pool if the String is found in String pool,
//otherwise a new string object will be added in String pool and the reference of this String is returned. 
public class InternTest {

	public static void main(String[] args) {
		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();// reference of existing string return from string pool
		String s4 = new String("Rakesh");// new object created into heap
		String s5 = new String("Rakesh").intern();// reference of existing string return from string pool

		if ( s1 == s2 ){
		    System.out.println("s1 and s2 are same");  // 1.
		}

		if ( s1 == s3 ){
		    System.out.println("s1 and s3 are same" );  // 2.
		}

		if ( s1 == s4 ){
		    System.out.println("s1 and s4 are same" );  // 3.
		}

		if ( s1 == s5 ){
		    System.out.println("s1 and s5 are same" );  // 4.
		}

	}

}
