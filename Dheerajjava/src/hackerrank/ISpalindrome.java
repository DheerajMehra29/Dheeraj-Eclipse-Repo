package hackerrank;

import java.util.Scanner;

public class ISpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String A=s.next();
        int a_counter = 0;
        int b_counter = A.length()-1;;
        while(a_counter<=b_counter) {
        	if(A.charAt(a_counter)!=A.charAt(b_counter)) {
        		System.out.println("No");		
        	return;
        	}
        	a_counter++;
        	b_counter--;
        }
        System.out.println();
	}

}
