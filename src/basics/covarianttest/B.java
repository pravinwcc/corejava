package basics.covarianttest;

public class B extends A{
	B get() {
		System.out.println("I am in B class !!");
		return this;
		
	}  
	//The covariant return type specifies that the return type may vary in the same direction as the subclass.
	//A get1() {return new A();} // Compile time error
	
	void message(){
		System.out.println("welcome to covariant return type");
	} 

	public static void main(String[] args) {
		A a= new B();
		A a1= new A();
		a.get();
		a1.get();
		
		a.get1();
		a1.get1();
		
		// Output
		//I am in B class !!
		//I am in A class !!
	}

}
