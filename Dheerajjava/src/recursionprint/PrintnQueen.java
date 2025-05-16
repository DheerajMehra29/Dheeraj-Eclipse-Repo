package recursionprint;

public class PrintnQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		PrintNQueens(board, 0, "");
	}

	public static void PrintNQueens(boolean[][]board,int row,String result) {
			if(row ==board.length) {
				System.out.println(result);
				return; 
				}
		
			for(int col = 0;col<board[row].length;col++) {
				if(IsItSafe(board,row,col)) {
					board[row][col]=true;
				PrintNQueens(board,row+1,result + "{"+(row + 1) + "-" + (col + 1) + "};");
					board[row][col] = false;
					
				}
			}
		
			}

	public static boolean IsItSafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;

			}
		}
		return true;
	}

}
