 
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args) 
	{
    	Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		int[] arr = new int[size];
		
		for(int i =0;i<size;i++){
		    arr[i]= obj.nextInt();
		}
		System.out.println(binarySearch(arr,obj.nextInt()));
		
	}
	
public static int	binarySearch(int[] arr, int ele){
	    
	    
	    int s =0,e=arr.length-1;
	    while(s<e){
	        
	        int mid = s+ (e-s)/2;
	        
	        if(arr[mid]==ele){
	            return mid;
	        }
	        
	        if(arr[mid]<ele){
	            s=mid+1;
	        }
	        else{
	            e = mid -1;
	        }
	    }
	    
	    return -1;
	}
}
