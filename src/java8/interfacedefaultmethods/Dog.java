package java8.interfacedefaultmethods;

public interface Dog {
	 static void move1(){
	        System.out.println("I am moving");
	    }
	 default void move(){
	        System.out.println("I am moving");
	    }
}
