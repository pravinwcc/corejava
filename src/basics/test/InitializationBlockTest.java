package basics.test;

class InitializationBlockTest{  
    int speed;  
      
    InitializationBlockTest()
    {
    	System.out.println("Constructor"); 
    	try {
			throw new Exception("not valid");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
   
    {
    	System.out.println("aaaaaaaaaaaaa is "+speed);
    	speed=100;
    }  
       
    public static void main(String args[]){  
    	
    	try{
    		InitializationBlockTest b1=new InitializationBlockTest();  
    	}catch(ArithmeticException ex){
    		ex.printStackTrace();
    	}
    	//InitializationBlockTest b2=new InitializationBlockTest();  
    }      
} 

