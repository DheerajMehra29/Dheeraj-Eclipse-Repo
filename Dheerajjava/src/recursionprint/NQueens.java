package recursionprint;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[2][2];
		System.out.println(CountNQueens(board, 0));
	}

	public static int CountNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + CountNQueens(board, row + 1);
				board[row][col] = false;

			}
		}
		return count;
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		if (isValidPosition(row - 2, col - 1, board.length) && board[row - 2][col - 1]) {
			return false;
		} else if (isValidPosition(row - 2, col + 1, board.length) && board[row - 2][col + 1]) {
			return false;
		} else if (isValidPosition(row - 1, col - 2, board.length) && board[row - 1][col - 2]) {
			return false;
		} else if (isValidPosition(row - 1, col + 2, board.length) && board[row - 1][col + 2]) {
			return false;
		} else if (isValidPosition(row + 1, col - 2, board.length) && board[row + 1][col - 2]) {
			return false;
		} else if (isValidPosition(row + 1, col + 2, board.length) && board[row + 1][col + 2]) {
			return false;
		} else if (isValidPosition(row + 2, col - 1, board.length) && board[row + 2][col - 1]) {
			return false;
		} else if (isValidPosition(row + 2, col + 1, board.length) && board[row + 2][col + 1]) {
			return false;
		}

		return true;
	}
	public static boolean isValidPosition(int row, int col, int N) {
		return row >= 0 && row < N && col >= 0 && col < N;
	}
}