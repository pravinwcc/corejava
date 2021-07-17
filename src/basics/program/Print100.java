package basics.program;


public class Print100 {

	public static void main(String[] args) {
		
		printNos(100);
	}
	
	public static void printNos( int n)
	{
	  if(n > 0)
	  {
	    printNos(n-1);
	   
	  }
	  System.out.println(n);
	}
	

}
