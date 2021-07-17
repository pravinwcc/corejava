package basics.immutableclass;

/*String is immutable for several reasons, here is a summary:
•	Security: 
			parameters are typically represented as String in network connections, database connection urls, usernames/passwords etc.
		 	If it were mutable, these parameters could be easily changed.
•	Synchronization and concurrency:
 			making String immutable automatically makes them thread safe thereby solving the synchronization issues.
•	Caching: 
			when compiler optimizes your String objects, it sees that if two objects have same value (a="test", and b="test")
			and thus you need only one string object (for both a and b, these two will point to the same object).
•	Class loading: 
			String is used as arguments for class loading. If mutable, it could result in wrong class being loaded (because mutable objects change their state).
*/

//public  final class ImmutableClass {// no one can extends it to break the serialization
public  class ImmutableClass {

    private final String name;
    private  final String mobile1;

       
    public ImmutableClass(String name, String mobile) {
        this.name = name;
        this.mobile1 = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile1;
    }
}



