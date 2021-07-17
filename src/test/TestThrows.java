package test;

import java.io.IOException;

public class TestThrows {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//test();
	}
	public static void test() throws IOException {
		int i=0;
		int jj=0;
		try{
			int k= i/jj;
		}catch(ArithmeticException |NullPointerException ex){
		//ex.printStackTrace();	
		}
		
	}

}
