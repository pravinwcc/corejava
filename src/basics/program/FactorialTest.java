package basics.program;

import java.util.Scanner;

class FactorialTest{  
    public static void main(String args[]){  
     int i,fact=1;  
     System.out.println("Please Enter value for Factorial !!");
     int number=new Scanner(System.in).nextInt();    
     /*for(i=1;i<=number;i++){    
         fact=fact*i;    
     } */   
     System.out.println("Factorial of "+number+" is: "+factorial(number));    
    }  
    public static int factorial(int n){
    	if (n ==0 || n==1) return 1;
    	else
    	return n*factorial(n-1);
    }
   }  

