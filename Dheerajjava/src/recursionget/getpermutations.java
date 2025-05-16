package recursionget;

import java.util.ArrayList;
import java.util.Scanner;

public class getpermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(GetPermutations(str));

	}

	public static ArrayList<String> GetPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = GetPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			for (int i = 0; i < rrs.length(); i++) {
				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(val);
			}

		}
		return mr;
	}
}
