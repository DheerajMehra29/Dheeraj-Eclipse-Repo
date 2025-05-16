package javabasic;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		 System.out.println(reverse(num));
		
	}
	public static boolean reverse(int num) {
		int palindrome=num;
		int rev = 0;
		while(palindrome!=0) {
			int rem = palindrome%10;
			rev = rev*10+rem;
			palindrome = palindrome/10;
		}
		if(num ==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
