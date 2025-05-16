package javabasic;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int fn = 0;
		int sn  = 1;
		int sum = 0;
		if(n==0) {
			System.out.println("0");
		}
		else {
		for(int i = 0;i<n;i++) {
			System.out.print(fn + " ");
			sum = fn ;
			int fib = fn+sn;
			fn = sn;
			sn = fib;
			sum = sum + fn;
		}
		}
		System.out.println();
		System.out.println(sum-1);
		if(n==0) {
			System.out.println("0");
		}
		else {
System.out.println(fn);
	}

}
}
