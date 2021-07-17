package basics.program;

import java.util.Scanner;

public class AmstrongTest {
	  public static void main(String[] args)  { 
		    int amst_num=0,rem_num,temp;  
		    int num=0;
		   Scanner in = new Scanner(System.in);
	       System.out.println("Input a number to check if it is an Armstrong number !!");      
	        num = in.nextInt();
		    temp=num;  
		    while(num>0)  
		    {  
		    	rem_num=num%10;  
		    	num=num/10;  
		    	amst_num=amst_num+(rem_num*rem_num*rem_num);  
		    }  
		    if(temp==amst_num)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		 
}
