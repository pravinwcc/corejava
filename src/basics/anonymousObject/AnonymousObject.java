package basics.anonymousObject;

public class AnonymousObject{

	public static void main(String[] args) {
		new AnonymousObject() {
		    public void doStuff() {
		       System.out.println("Anonymous Objects in Java");
		    }
		}.doStuff();

	}

}
