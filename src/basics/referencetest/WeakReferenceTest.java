package basics.referencetest;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

	public static void main(String[] args) {
		Employee a = new Employee();
    	a.setFname("Pravin");
    	a.setLname("Singh");;//Strong Reference
 
        //Creating Weak Reference to A-type object to which 'a' is also pointing.
 
        WeakReference<Employee> weakA = new WeakReference<Employee>(a);
 
        a = null;    //Now, A-type object to which 'a' is pointing earlier is available for garbage collection.
 
        a = weakA.get();    //You can retrieve back the object which has been weakly referenced.
        System.out.println(a.getFname()+" "+a.getLname());

	}

}
