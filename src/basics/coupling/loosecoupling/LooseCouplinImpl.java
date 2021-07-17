package basics.coupling.loosecoupling;

public class LooseCouplinImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traveler t= new Traveler();
		
		t.setV(new Car());
		t.startJourney();
		
		t.setV(new Bike());
		t.startJourney();
	}

}
