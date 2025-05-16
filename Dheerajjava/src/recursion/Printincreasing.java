package recursion;

import java.util.Scanner;

public class Printincreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PI(n);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
		
	}

}
