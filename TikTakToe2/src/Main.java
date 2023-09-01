public class Main {

	public static void main(String[] args) {

		TicTacToe t = new TicTacToe();

		Player p1 = new HumanPlayer("Yashh", 'X');
		Player p2 = new HumanPlayer("Nithish", 'O');
		// Player p2 = new AIPlayer("Robot", 'O');

		Player cp;
		cp = p1;

		while (true) {
			TicTacToe.model();
			System.out.println(cp.name + "'s turn: ");
			cp.makeMove();
			TicTacToe.displayBoard();

			if (TicTacToe.checkWin()) {
				System.out.println(cp.name + " has won");
				break;
			} else if (TicTacToe.checkDraw()) {
				System.out.println("Game is draw :(");
				break;
			} else {

				if (cp == p1) {
					cp = p2;
				} else {
					cp = p1;
				}
			}
		}

	}

}
