package backtracking;

public class QueenCombination {
static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueenCombinations(new boolean[4], 0, 2, "",-1);
	}

	public static void QueenCombinations(boolean[] board, int qpsf, int tq, String ans,int lastboxused) {
		if (qpsf == tq) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = lastboxused + 1; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenCombinations(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ",i);
				board[i] = false;
			}
		}
	}

}



