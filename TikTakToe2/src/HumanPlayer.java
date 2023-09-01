import java.util.Scanner;

public class HumanPlayer extends Player {

	HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		char c;

		do {
			do {
				System.out.println("Enter position: ");
				c = sc.next().charAt(0);
			} while (c <= '1' && c >= '9');

			if (c == '1') {
				row = 0;
				col = 0;
			} else if (c == '2') {
				row = 0;
				col = 1;
			} else if (c == '3') {
				row = 0;
				col = 2;
			} else if (c == '4') {
				row = 1;
				col = 0;
			} else if (c == '5') {
				row = 1;
				col = 1;
			} else if (c == '6') {
				row = 1;
				col = 2;
			} else if (c == '7') {
				row = 2;
				col = 0;
			} else if (c == '8') {
				row = 2;
				col = 1;
			} else {
				row = 2;
				col = 2;
			}

		} while (!isValidMove(row, col));

		TicTacToe.placeMark(row, col, mark);
	}

}
