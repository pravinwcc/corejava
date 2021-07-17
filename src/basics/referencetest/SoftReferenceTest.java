package basics.referencetest;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class SoftReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee();
    	a.setFname("Pravin");
    	a.setLname("Singh");;//Strong Reference
 
    	//Creating Soft Reference to A-type object to which 'a' is also pointing
 
    	SoftReference<Employee> softA = new SoftReference<Employee>(a);
 
        a = null;    //Now, A-type object to which 'a' is pointing earlier is available for garbage collection.
 
        a = softA.get();    //You can retrieve back the object which has been weakly referenced.
        System.out.println(a.getFname()+" "+a.getLname());

	}

}
