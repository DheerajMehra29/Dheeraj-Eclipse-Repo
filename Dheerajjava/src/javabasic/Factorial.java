package javabasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		int fact = 1;
		while(num!=0) {
			fact = fact*num;
			num--;
		}
		System.out.println(fact);

	}

}
