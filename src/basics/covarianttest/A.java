package basics.covarianttest;

public class A {
	A get(){
		System.out.println("I am in A class !!");
		return this;
		
	} 
	//The covariant return type specifies that the return type may vary in the same direction as the subclass.
	B get1(){
		System.out.println("I am in A class !!");
		return new B();
		
	} 
}
