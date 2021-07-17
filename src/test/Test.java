package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	final void abc(){
		
	}
	
	public static String solution(String S, String T) {
	        // write your code in Java SE 8
	        char arrayS[] = S.toCharArray();
	        char arrayT[] = T.toCharArray();
	        int slenght=S.length();
	        int tlenght=T.length();
	            
	        if(S.equals(T)){
	            return "NOTHING";
	        }else if (slenght +1 == tlenght ){
	            int noMatchCnt=0; 
	            char ctemp='\u0000';
	            for (int i =0, j=0; i<arrayT.length; i++,j++) {
	             if (arrayT[i] != arrayS[j]) {
	                 noMatchCnt++;
	                 if(noMatchCnt==1) ctemp=arrayT[i];
	                 i++;
	             }
	            }
	            if(noMatchCnt==1) return "INSERT "+ctemp;
	        }else if (slenght -1 == tlenght ){
	            int noMatchCnt=0; 
	            char ctemp='\u0000';
	            for (int i =0, j=0; i<arrayS.length; i++,j++) {
	             if (arrayT[i] != arrayS[j]) {
	                 noMatchCnt++;
	                 if(noMatchCnt==1) ctemp=arrayS[i];
	                 j++;
	             }
	            
	            } if(noMatchCnt==1) return "DELETE "+ctemp;
	        }else if (slenght == tlenght ){
	            int noMatchCnt=0; 
	            char ctemp1='\u0000';
	            char ctemp2='\u0000';
	            int charNum=0;
	            for (int i =0; i<arrayS.length; i++) {
	             if (arrayS[i] != arrayT[i]) {
	                 noMatchCnt++;
	                 if (charNum+1 == i && ctemp1==arrayT[i]&& ctemp2==arrayS[i]) {
	                  continue;
	                 }
	                 ctemp1=arrayS[i];
	                 ctemp2=arrayT[i];
	                 charNum = i;                
	                 
	             }
	             if(noMatchCnt==2) return "SWAP "+ctemp1 +" " + ctemp2;
	            }
	        }
	        return "IMPOSSIBLE";
	    }
	
	public static void main(String[] args) {
	 /*Scanner in = new Scanner(System.in);
     int arr_rows = 0;
     int arr_cols = 0;
     arr_rows = Integer.parseInt(in.nextLine().trim());
     arr_cols = Integer.parseInt(in.nextLine().trim());

     int[][] arr = new int[arr_rows][arr_cols];
     for(int arr_i = 0; arr_i < arr_rows; arr_i++) {
         for(int arr_j = 0; arr_j < arr_cols; arr_j++) {
             arr[arr_i][arr_j] = in.nextInt();

         }
     }

     if(in.hasNextLine()) {
       in.nextLine();
     }*/
     int arr[][]= new int[][]{{1,0},{7,48},{1,30}};
     countNumbers(arr);
	}
	
	 static void countNumbers(int[][] arr) {
	        
	        int len= arr.length;
	        for (int i=0;i<len;i++){
	            int count=0;
	           int aa= arr[i][0];
	           int bb= arr[i][1];
	            for(; aa<=bb;aa++){
	                count++;
	                if(aa/10 > 0){
	                    
	                    String s =""+aa;
	                   
	                    int s1 = Integer.parseInt(s.substring(0, 1));
	                    int s2 = Integer.parseInt(s.substring(1, 2));
	                    if (s1==s2){
	                    	count--;
	                    }
	                    
	                }
	            }
	            System.out.println("Count for row "+i+"is as :"+count);
	        }

	    }
 }

