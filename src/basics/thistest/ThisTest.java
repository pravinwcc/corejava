package basics.thistest;

class ThisTest {
	int rollno;
	String name;
	float fee;

	ThisTest(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
		
		//this.rollno = rollno;
		//this.name = name;
		//this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
	
	public static void main(String args[]) {
		ThisTest s1 = new ThisTest(111, "ankit", 5000f);
		ThisTest s2 = new ThisTest(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}

