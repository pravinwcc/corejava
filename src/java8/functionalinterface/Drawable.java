package java8.functionalinterface;


@FunctionalInterface
interface Drawable{  
    public void draw(); 
    //public void draw2(); //compile time error
    @Override
    public int hashCode();// Object class methods are allowed
    @Override
    public String toString();   //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);  //Overridden from Object class

  default void draw1(){
    	
    }
    
} 