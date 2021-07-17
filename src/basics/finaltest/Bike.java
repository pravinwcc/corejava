package basics.finaltest;

class Bike{  
    final int speedlimit=90;//final variable 
    final void finalrun(){
    	System.out.println("finalrun running...");
    	}  
    
    final static void staticrun(){
    	System.out.println("staticrun running...");
    	} 
    void run(){  
     //speedlimit=400;  compile time error
    }  
    public static void main(String args[]){  
    Bike obj=new  Bike();  
    obj.run();  
    }  
   }//end of class  