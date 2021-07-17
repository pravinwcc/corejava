package basics.exceptiontest;

public class ExcpTest {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try{
			throw new OutOfMemoryError();
		}catch(OutOfMemoryError ex){
			ex.printStackTrace();
		}
		}
		

	}

}
