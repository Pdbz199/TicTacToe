import java.util.Scanner;

public class Game {
	public static void main (String[] args) {
		boolean player1 = true;
		boolean player2 = false;
		boolean winner = false;
		boolean invalid = false;
		int num = 0;
		Scanner input = new Scanner(System.in);
		String[][] board = {{" ", "|", " ", "|", " ", "\n"},
							{"-", "|", "-", "|", "-", "\n"},
							{" ", "|", " ", "|", " ", "\n"},
							{"-", "|", "-", "|", "-", "\n"},
							{" ", "|", " ", "|", " ", "\n"}};
		System.out.println("Do you want to play single or multiplayer?");
		String choice = input.nextLine();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
		}
		while (winner == false && choice.toLowerCase().equals("m")) {
			num = 0;
				if (player1) {
					num = 0;
				System.out.println("player 1's turn...");
				int row = input.nextInt();
				int col = input.nextInt();
				if (row == 1) {
					if (col == 1 && board[0][0].equals(" ")) {
						board[0][0] = "X";
					}
			
					else if (col == 2 && board[0][2].equals(" ")) {
						board[0][2] = "X";
					}
			
					else if (col == 3 && board[0][4].equals(" ")) {
						board[0][4] = "X";
					}
				}
		
				else if (row == 2) {
					if (col == 1 && board[2][0].equals(" ")) {
						board[2][0] = "X";
					}
			
					else if (col == 2 && board[2][2].equals(" ")) {
						board[2][2] = "X";
					}
			
					else if (col == 3 && board[2][4].equals(" ")) {
						board[2][4] = "X";
					}
				}
				else if (row == 3) {
					if (col == 1 && board[4][0].equals(" ")) {
						board[4][0] = "X";
					}
			
					else if (col == 2 && board[4][2].equals(" ")) {
						board[4][2] = "X";
					}
			
					else if (col == 3 && board[4][4].equals(" ")) {
						board[4][4] = "X";
					}
				}
				if ((board[0][0].equals("X") && board[0][2].equals("X") && board[0][4].equals("X")) || ((board[2][0].equals("X") && board[2][2].equals("X") && board[2][4].equals("X")) || (board[4][0].equals("X") && board[4][2].equals("X") && board[4][4].equals("X")) || (board[0][0].equals("X") && board[2][0].equals("X") && board[4][0].equals("X")) || (board[0][2].equals("X") && board[2][2].equals("X") && board[4][2].equals("X")) || (board[0][4].equals("X") && board[2][4].equals("X") && board[4][4].equals("X")) || (board[0][0].equals("X") && board[2][2].equals("X") && board[4][4].equals("X")) || (board[0][4].equals("X") && board[2][2].equals("X") && board[4][0].equals("X")))) {
					System.out.println("Player 2 is the winner!");
					winner = true;
				}
				for (int l = 0; l < board.length; l++) {
					for (int k = 0; k < board[l].length; k++) {
						if (board[l][k].equals("X") || board[l][k].equals("O")) {
							num++;
						}
					}
				}
				if (num == 9) {
					System.out.println("It was a cat's game newbs...");
					winner = true;
					player1 = false;
					player2 = false;
					break;
				}
				}
				player2 = true;
				player1 = false;
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j]);
					}
				}
				if (player2) {
					num = 0;
				System.out.println("player 2's turn...");
				int row = input.nextInt();
				int col = input.nextInt();
				if (row == 1) {
					if (col == 1 && board[0][0].equals(" ")) {
						board[0][0] = "O";
					}
			
					else if (col == 2 && board[0][2].equals(" ")) {
						board[0][2] = "O";
					}
			
					else if (col == 3 && board[0][4].equals(" ")) {
						board[0][4] = "O";
					}
				}
		
				else if (row == 2) {
					if (col == 1 && board[2][0].equals(" ")) {
						board[2][0] = "O";
					}
			
					else if (col == 2 && board[2][2].equals(" ")) {
						board[2][2] = "O";
					}
			
					else if (col == 3 && board[2][4].equals(" ")) {
						board[2][4] = "O";
					}
				}
			
				else if (row == 3) {
					if (col == 1 && board[4][0].equals(" ")) {
						board[4][0] = "O";
					}
			
					else if (col == 2 && board[4][2].equals(" ")) {
						board[4][2] = "O";
					}
			
					else if (col == 3 && board[4][4].equals(" ")) {
						board[4][4] = "O";
					}
				}
				if ((board[0][0].equals("O") && board[0][2].equals("O") && board[0][4].equals("O")) || ((board[2][0].equals("O") && board[2][2].equals("O") && board[2][4].equals("O")) || (board[4][0].equals("O") && board[4][2].equals("O") && board[4][4].equals("O")) || (board[0][0].equals("O") && board[2][0].equals("O") && board[4][0].equals("O")) || (board[0][2].equals("O") && board[2][2].equals("O") && board[4][2].equals("O")) || (board[0][4].equals("O") && board[2][4].equals("O") && board[4][4].equals("O")) || (board[0][0].equals("O") && board[2][2].equals("O") && board[4][4].equals("O")) || (board[0][4].equals("O") && board[2][2].equals("O") && board[4][0].equals("O")))) {
					System.out.println("Player 2 is the winner!");
					winner = true;
				}
				for (int l = 0; l < board.length; l++) {
					for (int k = 0; k < board[l].length; k++) {
						if (board[l][k].equals("X") || board[l][k].equals("O")) {
							num++;
						}
					}
				}
				if (num == 9) {
					System.out.println("It was a cat's game newbs...");
					winner = true;
				}
				player2 = false;
				player1 = true;
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j]);
					}
				}
				}
			}
		}
	}