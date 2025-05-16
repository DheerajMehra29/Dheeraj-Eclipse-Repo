package recursionprint;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cr = s.nextInt();
		int cc = s.nextInt();
		int er = s.nextInt();
		int ec = s.nextInt();
		PrintMazePaths(cr, cc, er, ec, "");

	}

	public static void PrintMazePaths(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		PrintMazePaths(cr, cc + 1, er, ec, "H" + ans);
		PrintMazePaths(cr + 1, cc, er, ec, "V" + ans);
	}

}
