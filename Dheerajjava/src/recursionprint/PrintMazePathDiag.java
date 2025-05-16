package recursionprint;

import java.util.Scanner;

public class PrintMazePathDiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int cr = s.nextInt();
		int cc = s.nextInt();
		int er = s.nextInt();
		int ec = s.nextInt();
		PrintMazePathsDiag(cr, cc, er, ec, "");

	}

	public static void PrintMazePathsDiag(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		PrintMazePathsDiag(cr, cc + 1, er, ec, "H" + ans);
		PrintMazePathsDiag(cr + 1, cc, er, ec, "V" + ans);
		PrintMazePathsDiag(cr + 1, cc + 1, er, ec, "D" + ans);
	}

}
