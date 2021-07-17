package basics.finalyblock;

public class FinalyBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc();

	}

	public static int abc() {
		try {

			return 1;
			// System.exit(0);
		} catch (Exception ex) {

		} finally {
			System.out.println("Finally block");
		}
		return 0;
	}

}
