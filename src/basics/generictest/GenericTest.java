package basics.generictest;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box nonGen = new Box();

		// Box<Double> objGen= new Box<Integer>();//error
		Box<Integer> objGen = new Box<Integer>();
		nonGen = objGen;
		objGen = nonGen;
		System.out.println(objGen);
		///////////////////////////////////////////////////////////
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("Hello", "world");
		System.out.println(p1);
		System.out.println(p2);

	}

}
