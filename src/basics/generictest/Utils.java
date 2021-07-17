package basics.generictest;

public class Utils {
	public static <K, V> boolean compare(Entries<Integer, String> p1, Entries<Integer, String> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}

	public static void main(String args[]) {
		Entries<Integer, String> p1 = new Entries<>(1, "apple");
		Entries<Integer, String> p2 = new Entries<>(2, "pear");
		boolean same = Utils.compare(p1, p2);
		System.out.println(same);

	}
}
