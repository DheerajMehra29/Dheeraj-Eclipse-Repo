package javabasic;

import java.util.Scanner;

public class FactRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s. nextInt();
		int ans = fact(n);
		System.out.println(ans);

	}
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n * fact(n-1);
					
	}

}
