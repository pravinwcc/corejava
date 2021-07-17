package basics.stringtest;

class StringImutable{  
	 public static void main(String args[]){  
	  // String s="Sachin"; 
		 
		 String s1=new String("Sachin");
	     s1.concat(" Tendulakar");  
	     System.out.println(s1); 
	   
		 StringBuffer s=new StringBuffer("Sachin");
	     s.append(" Tendulkar");  
	     System.out.println(s);  
	 }  
	}