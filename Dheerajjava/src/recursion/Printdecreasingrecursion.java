package recursion;

import java.util.Scanner;

public class Printdecreasingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PD(n);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
	
		System.out.println(n);
		PD(n - 1);

	}

}
