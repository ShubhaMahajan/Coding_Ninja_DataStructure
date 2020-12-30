
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class powerUsingRecursion {
 
		static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {
			int x = s.nextInt();
			int n = s.nextInt();
			
			System.out.println( power(x, n));
		}
	 

		public static int power(int x, int n) {
		 
		    // if(n==0){
		    // return 1;
		    // }
	        // or
	        
	        if(n==1){
	            return x;
	        }
	      return x*power(x,n-1);
	       
	      
	}
	
	}
