package basics.finaltest;

public class StaticFinalTest {

	static final int data1=10;
	static final int data;// static blank final variable
	//static final int data-100;// static blank final variable
	static {
		data = 50;
		//data1=20;
	}
	
	

	public static void main(String args[]) {
		System.out.println(StaticFinalTest.data);
	}
}
