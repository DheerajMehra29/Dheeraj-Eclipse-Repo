package recursionprint;

import java.util.Scanner;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int curr = s.nextInt();
		int end = s.nextInt();
		System.out.println(CountBoardPaths(curr, end));
	}

	public static int CountBoardPaths(int curr, int end) {
		if (curr == end) {			
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count+= CountBoardPaths(curr + dice, end);
		}
		return count;

	}
}


