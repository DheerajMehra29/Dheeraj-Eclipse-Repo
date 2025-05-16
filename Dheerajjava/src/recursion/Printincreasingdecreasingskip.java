package recursion;

import java.util.Scanner;

public class Printincreasingdecreasingskip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PDIskip(n);
	}
	public static void PDIskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);

		}
		PDIskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);

		}

	}
}