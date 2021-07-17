package basics.test;


class Test1{
	 static void pritn(){
		 System.out.println("abc static");
	 }
	 void display(){
		 System.out.println("non static");
	 }
	 
}
public class StaticTest extends Test1{
	
	static void pritn(){
		System.out.println("StaticTest");
	}
	
	 void display(){
		 System.out.println("non static");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

