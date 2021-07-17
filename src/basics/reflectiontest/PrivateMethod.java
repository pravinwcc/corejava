package basics.reflectiontest;

public class PrivateMethod {
	@SuppressWarnings("unused")
	private void message() {
		System.out.println("hello java");
	}
	@SuppressWarnings("unused")
	private void add(int i,int j) {
		System.out.println("Addition of 2 numbers-"+ i+j);
		System.out.println(i+j);
	}
}
