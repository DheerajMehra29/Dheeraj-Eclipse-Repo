package recursionprint;

import java.util.Scanner;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int curr = s.nextInt();
		int end = s.nextInt();
		PrintBoardPaths(curr, end, "");
	}

	public static void PrintBoardPaths(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			PrintBoardPaths(curr + dice, end, ans + dice);
		}

	}
}
