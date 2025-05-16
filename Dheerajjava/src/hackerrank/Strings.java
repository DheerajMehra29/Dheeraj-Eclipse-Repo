package hackerrank;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
	        String A=s.next();
	        String B=s.next();
	        int a = A.length();
	        int b = B.length();
	        System.out.println(a+b);
	        int ans = A.compareTo(B);
	        if(ans>0) {
	        	System.out.println("Yes");
	        	
	        }
	        else {
	        	System.out.println("No");
	        	
	        }
	        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+ " " + B.substring(0,1).toUpperCase() + B.substring(1)); 
	}

}
