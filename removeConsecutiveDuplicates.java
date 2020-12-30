
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class binarySearch {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println(removeConsecutiveDuplicates("ssshubha"));

	}

	public static String removeConsecutiveDuplicates(String str) {
        
        if(str.length()<=1){
            return str;
        }
        
        if(str.charAt(0)==str.charAt(1)){
            return removeConsecutiveDuplicates(str.substring(1));
        }
        else{
            return  str.charAt(0)+removeConsecutiveDuplicates(str.substring(1));
        }
        
	}}
