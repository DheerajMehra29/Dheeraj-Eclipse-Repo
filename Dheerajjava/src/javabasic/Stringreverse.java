package javabasic;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String str = s.next();
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
		rev +=str.charAt(i); 
		}
		System.out.println(rev);

	}

}
