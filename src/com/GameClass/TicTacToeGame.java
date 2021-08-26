package com.GameClass;

import java.util.Scanner;

/**
 * @author jayeshkumar
 * This game has 9 block i.e 3*3
 * Player1 is user and Player2 is computer
 *
 */


public class TicTacToeGame {
	private char[] board = new char[10];
	private String player1;
	private String player2; //computer

	public static void main(String args[]) {

		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.initBoard();
		tictactoe.playerLetter();

	}
	
	
	/**
	 * @author jayeshkumar
	 * Initailizing the board to empty spaces
	 *
	 */
	public void initBoard() {

		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		
	}
	
	
	/**
	 * @author jayeshkumar
	 *Asking user to enter his choice
	 *Choice is either X or O
	 */
	
	public void playerLetter() {
		System.out.println("Choose your letter.I.e X or O");
		Scanner r=new Scanner(System.in);
		player1=r.nextLine();
		if(player1.equals("X")) {
			player2="O";
		}
		else if(player1.equals("O")) {
			player2="X";
		}
		else {
			System.out.println("Invalid input");
			
		}
		System.out.println("Player 1 choose "+player1);
		System.out.println("Player 2's Letter is "+player2);
		
		
		
		
	}

}
