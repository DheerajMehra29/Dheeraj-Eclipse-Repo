package recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int pow = power(x, n);
		System.out.println(pow);
	}

	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int pnm1 = power(x,n-1);
				int pn = x*pnm1;
		return pn;
		}

}


