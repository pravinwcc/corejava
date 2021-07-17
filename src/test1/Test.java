package test1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation(100);
	}
	// if it multiple of 3 then fizz
	// if multiple of 5 buzz
	// if it is multiple of 3 & 5 both then fizz buzz
	// if not any of them then print the number itself

	public static void calculation(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % 3 == 0) {
				System.out.println("fizz");
			} else if (num % 5 == 0) {
				System.out.println("buzz");
			} else if ((num % 3 == 0) && (num % 5 == 0)) {
				System.out.println("fizz & buzz");
			} else {
				System.out.println(num);
			}
		}

	}

}
