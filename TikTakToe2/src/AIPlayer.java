import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player {
	Random random = new Random();

	AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		do {
			row = random.nextInt(3);
			col = random.nextInt(3);
		} while (!isValidMove(row, col));

		TicTacToe.placeMark(row, col, mark);
	}

}
