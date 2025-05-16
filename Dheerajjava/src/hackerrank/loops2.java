package hackerrank;

import java.util.Scanner;

public class loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			for (int j = 0; j < n; j++) {
				a = a + b;
				if (j > 0) {
					System.out.print(" ");
				}
				System.out.print(a);
				b = b * 2;
			}
			System.out.println();
		}

}
}