package javabasic;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String str = s.next();
		int counter = 0;
		int pointer = str.length()-1;
		while(counter<=pointer) {
			if(str.charAt(counter)!=str.charAt(pointer)) {
				System.out.println("Not a Palindrome");
				return;
			}
			counter++;
			pointer--;
		}
		System.out.println("Palindrome");
		s.close();

	}


}
