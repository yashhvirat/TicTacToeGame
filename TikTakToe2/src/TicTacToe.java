
public class TicTacToe {

	static char[][] board;

	TicTacToe() {
		board = new char[3][3];
		initBoard();
	}

	void initBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	static void displayBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	static void placeMark(int row, int col, char mark) {
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			board[row][col] = mark;
		}
	}

	static boolean checkWin() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]
					&& board[i][0] == board[i][2]) {
				return true;
			}
			if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]
					&& board[0][i] == board[2][i]) {
				return true;
			}
			if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
					&& board[0][0] == board[2][2]) {
				return true;
			}
			if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]
					&& board[0][2] == board[2][0]) {
				return true;
			}
		}
		return false;
	}

	static boolean checkDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	static void model() {
		int num = 1;
		System.out.println("Position Guide");
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(num);
				System.out.print(" | ");
				num++;
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
}
