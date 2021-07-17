package basics.instanceoftest;

class Dog extends Animal {  
	  void method(Animal a) {  
		 Dog d=(Dog)a;//run time error  Animal cannot be cast to instanceofTest.Dog
	    if(a instanceof Dog){  
	       //Dog d=(Dog)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	    }  
	  }  
	   
	  public static void main (String [] args) {  
		  Dog d=null;
		  System.out.println(d instanceof Dog);  
		  Dog a=(Dog) new Animal();  
	    a.method(a);  
	  }  
	    
	 }  