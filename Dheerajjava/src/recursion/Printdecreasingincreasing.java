package recursion;

import java.util.Scanner;

public class Printdecreasingincreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PDI(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);

	}

}
