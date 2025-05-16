package recursionget;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cr = s.nextInt();
		int cc = s.nextInt();
		int er = s.nextInt();
		int ec = s.nextInt();
		System.out.println(GetmazePath(cr, cc, er, ec));

	}

	public static ArrayList<String> GetmazePath(int cr, int cc, int er, int ec) {
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
		ArrayList<String> rrh = GetmazePath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = GetmazePath(cr+1, cc , er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		return mr;
	}

}
