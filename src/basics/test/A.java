package basics.test;

 class A implements Cloneable
{  
	 
	//abstract void run();
	
	 public static void main(String args[]) throws Throwable
	 {  
	 System.out.println("jjjjjjjjjj"); 
	 A a=new A();
	 a.finalize();
	 a.clone();
	 }  
}
