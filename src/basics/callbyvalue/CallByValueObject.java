package basics.callbyvalue;

public class CallByValueObject {
	int data = 50;

	void change(CallByValueObject op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		CallByValueObject obj = new CallByValueObject();

		System.out.println("before change " + obj.data);
		obj.change(obj);// passing object
		System.out.println("after change " + obj.data);

	}
}  
