package basics.overridingexceptionrule;

import java.io.*;

class SupperParent {
	void msg() {
		System.out.println("SupperParent");
	}
}

class Parent extends SupperParent{
	void msg() {
		System.out.println("parent");
		super.msg();
	}
}

class TestExceptionChild1 extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
		super.msg();
	}

	public static void main(String args[]) {
		TestExceptionChild1 p = new TestExceptionChild1();
		p.msg();
	}
}