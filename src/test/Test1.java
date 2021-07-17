package test;

public class Test1 extends Test{


public static void main(String... aa){
	try{
		int sum=10;
		for(int i=-1;i<3;++i){
			sum=(sum/i);
			System.out.println(i);
		}
		
	}catch(ArithmeticException ex){
		System.out.println("World");
	}
	
}
}
