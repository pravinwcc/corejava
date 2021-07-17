package basics.staticblock;

class StaticBlockTest extends ParentClass {
	static int ii = 10;
	int aa = 10;

	public StaticBlockTest() {
		ii = 11;
		aa=90;
		System.out.println("Static BlockTest class cunstructor is invoked-->" + ii);
		System.out.println("Static BlockTest class cunstructor is invoked-->" + aa);
	}

	static {
		System.out.println("Main class static block is invoked");
	}

	{
		System.out.println("Main class anonymous block invoked");
	}

	public static void main(String args[]) {
		// aa=12;
		new StaticBlockTest();
		System.out.println("Hello main");
	}
}