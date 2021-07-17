package basics.boxing;

class Autooxing{  
	  public static void main(String args[]){  
	        int a=50;  
	        
	        Integer a2=new Integer(a);//Boxing  
	  
	        Integer a3=5;//Boxing  
	       // a3.compareTo(a);
	          
	        System.out.println(a2+" "+a3);  
	        
	 }   
	} 
