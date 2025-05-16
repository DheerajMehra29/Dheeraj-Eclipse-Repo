package recursion;

import java.util.Scanner;

public class Fibonaccirecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fibonacci = fib(n);
		System.out.println(fibonacci);
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fibo = fnm1 + fnm2;
		return fibo;
	}

}
