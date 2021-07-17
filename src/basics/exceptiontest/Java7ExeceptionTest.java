package basics.exceptiontest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7ExeceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/test.txt")))// java7 features 
	        {
	            String sCurrentLine;
	            while ((sCurrentLine = br.readLine()) != null) 
	            {
	                System.out.println(sCurrentLine);
	            }
	        } 
	        catch (IOException | ArithmeticException e) // java7 features 
	        {
	            e.printStackTrace();
	        }

	}

}
