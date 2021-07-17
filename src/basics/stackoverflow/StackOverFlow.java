package basics.stackoverflow;

public class StackOverFlow {
	public static void print(){
		System.out.println("Implementing stack overflow !!");
		print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Main method calls");
			print();
			
		}
	}

}
