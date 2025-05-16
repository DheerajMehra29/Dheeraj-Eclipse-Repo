package recursionprint;

import java.util.Scanner;

public class PrintPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ques = s.nextLine();
		PrintPermutations(ques, " ");
		s.close();
	}

	public static void PrintPermutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			PrintPermutations(roq, ans + ch);
		}

	}
}
