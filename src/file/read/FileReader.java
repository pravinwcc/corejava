package file.read;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileReader implements Runnable{

	byte[] byteToRead = null;
	String partFileName=null;
	public FileReader(byte[] byteToRead,String partFileName){
		this.byteToRead=byteToRead;
		this.partFileName=partFileName;
	}
	
	@Override
	public void run() {

	    try {
	      OutputStream output = null;
	      try {
	        output = new BufferedOutputStream(new FileOutputStream(partFileName));
	        output.write(byteToRead );
	        System.out.println("Thread Writing Process Was Performed Successfully"); 
	      }
	      finally {
	        output.close();
	      }
	    }
	    catch(FileNotFoundException ex){
	     ex.printStackTrace();
	    }
	    catch(IOException ex){
	     ex.printStackTrace();
	    }
	 
		
	}
	
	

}
