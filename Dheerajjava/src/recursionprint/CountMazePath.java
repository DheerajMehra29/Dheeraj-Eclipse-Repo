package recursionprint;

import java.util.Scanner;

public class CountMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int cr = s.nextInt();
		int cc = s.nextInt();
		int er = s.nextInt();
		int ec = s.nextInt();
		System.out.println(PrintMazePaths(cr, cc, er, ec));
	}

	

	public static int PrintMazePaths(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
		
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		
		int ch = PrintMazePaths(cr, cc + 1, er, ec );
		 int cv = PrintMazePaths(cr + 1, cc, er, ec);
	
	return ch + cv;

}
}



