package com.GameClass;

public class TicTacToeGame {
	private char[] board = new char[10];

	public static void main(String args[]) {

		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.initBoard();

	}

	public void initBoard() {

		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		
	}

}
