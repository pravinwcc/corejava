package basics.coupling.tightcoupling;

class Traveler {
	Car c = new Car();

	void startJourney() {
		c.move();
	}
}

class Car {
	void move() {
		// logic...
	}
}
