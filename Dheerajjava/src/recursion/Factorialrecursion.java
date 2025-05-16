package recursion;

import java.util.Scanner;

public class Factorialrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int factorial = fact(n);
		System.out.println(factorial);
	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fnm1 = fact(n - 1);
		int facto = n * fnm1;
		return facto;
	}

}
