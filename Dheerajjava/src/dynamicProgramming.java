import java.util.Scanner;

public class dynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] strg = new long[n + 1];
		System.out.println(fibDP(n, strg));
		System.out.println(fibIS(n));

	}

	public static long fibDP(int n, long[] strg) {
		if (n == 1 || n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		long fnm1 = fibDP(n - 1, strg);
		long fnm2 = fibDP(n - 2, strg);
		long fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static long fibIS(int n) {
		long[] strg = new long[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

}
