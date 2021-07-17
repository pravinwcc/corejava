package basics.interfacetest;

public class BTest extends ATest{

	/*@Override
	public static void show() {
	System.out.println("I am fromm BTest !!");
	}*/
	public  void show() {
		System.out.println("I am fromm BTest !!");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BTest bbb=new BTest();
		bbb.show();
		
		
		ATest bb= new BTest();
		//bb.show(); compile time error
		
		
		ATest b1= new ATest();
		//b1.show();compile time error
		
		ATest cc=null;
		//cc.show();compile time error

	}

}
