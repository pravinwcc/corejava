package basics.abstracttest;

abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	Bike(int i) {
		System.out.println("bike is created");
	}
	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

