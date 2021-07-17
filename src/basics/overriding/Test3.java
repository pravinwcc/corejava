package basics.overriding;

public class Test3 implements Test1, Test2 {

	@Override
	public void eat() {
		System.out.println("Test 3");

	}

	public static void main(String args[]) {
		Test3 tt= new Test3();
		tt.eat();
	}
}
