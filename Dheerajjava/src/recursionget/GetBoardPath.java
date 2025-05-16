package recursionget;

import java.util.ArrayList;
import java.util.Scanner;

public class GetBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int curr = s.nextInt();
		int end = s.nextInt();
		System.out.println(GetBoardPath(curr, end));

	}

	public static ArrayList<String> GetBoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = GetBoardPath(curr + dice, end);
			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		return mr;
	}

}
