package basics.abstracttest;

abstract class AbstractTest {
	//abstract void abc();
	public static void main(String args[])
	{
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}