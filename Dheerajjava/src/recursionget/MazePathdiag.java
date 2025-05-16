package recursionget;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathdiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		
		int cr ;
		int cc ;
		int er ; 
		int ec;
		System.out.println(GetmazePathDiag(0, 0,r-1 ,c-1 ));

	}

	public static ArrayList<String> GetmazePathDiag(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = GetmazePathDiag(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = GetmazePathDiag(cr+1, cc , er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		ArrayList<String> rrd = GetmazePathDiag(cr+1, cc+1 , er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}
		return mr;
	}

}



