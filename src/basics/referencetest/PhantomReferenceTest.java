package basics.referencetest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
	    public static void main(String[] args)
	    {
	    	Employee a = new Employee();
	    	a.setFname("Pravin");
	    	a.setLname("Singh");;//Strong Reference
	 
	    	ReferenceQueue<Employee> refQueue = new ReferenceQueue<Employee>();
	    	 
	        //Creating Phantom Reference to A-type object to which 'a' is also pointing
	 
	        PhantomReference<Employee> phantomA = new PhantomReference<Employee>(a, refQueue);

	 
	        a = null;    //Now, A-type object to which 'a' is pointing earlier is available for garbage collection.
	 
	        a = phantomA.get();    //You can retrieve back the object which has been weakly referenced.
	        System.out.println(a.getFname()+" "+a.getLname());
	    }
	
}
