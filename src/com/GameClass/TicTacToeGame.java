package com.GameClass;

import java.util.Scanner;

/**
 * @author jayeshkumar This game has 9 block i.e 3*3 Player1 is user and Player2
 *         is computer
 *
 */


public class TicTacToeGame {
	private char[] board = new char[10];
	private String player1;
	private String player2; // computer

	public static void main(String args[]) {

		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.initBoard();
		tictactoe.playerLetter();
		tictactoe.showBoard();
		tictactoe.userMove();
		tictactoe.showBoard();

	}

	/**
	 * @author jayeshkumar Initailizing the board to empty spaces
	 *
	 */
	public void initBoard() {

		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}

	}

	/**
	 * @author jayeshkumar Asking user to enter his choice Choice is either X or O
	 */

	public void playerLetter() {
		int flag=1;
		do {
		System.out.println("Choose your letter.I.e X or O");
		Scanner r = new Scanner(System.in);
		player1 = r.nextLine();
		if (player1.equals("X")) {
			player2 = "O";
			flag=1;
		} 
		else if (player1.equals("O")) {
			player2 = "X";
			flag=1;
		} 
		else {
			System.out.println("Invalid input");
			flag=0;
		}
		}while(flag==0);
		System.out.println("Player 1 choose " + player1);
		System.out.println("Player 2's Letter is " + player2);
	}
	
	
	/**
	 * @author jayeshkumar
	 *Displaying the board in 3*3 manner.
	 */
	public void showBoard() {
		int count = 1;
		while (count !=10) {
			for (int i = 1; i <= 3; i++) {
				System.out.print(board[count]);
				if (i % 3 == 0) {
					count++;
					System.out.println();
					break;
				}
				count++;
				System.out.print(" | ");
			}
			if(count==10) {
				break;
			}
			System.out.println("----------");
			}
		}
	
	
	
	/**
	 * Asking user to make a move and validating if its a valid move or not.
	 */
	public void userMove() {
		Scanner r=new Scanner(System.in);
		int index;
		int flag=1;
		do
		{
			
			System.out.println("Enter the index between 1 to 9 to which you wanna move");
			index=r.nextInt();
			if(index>9 || index <0) {
				System.out.println("Invalid index.Choose between 1 to 9");
				flag=0;
			}
			else
				flag=1;
			if(flag !=0) {
			
			if(board[index]==' ') {
				board[index]=player1.toCharArray()[0];
				System.out.println("Index is free and you can make move");
				flag=1;
			}
			else {
				System.out.println("Index is full and you cannot make move to that index");
				flag=0;
			}
			}
		}while(flag==0);
		
		
	}
	
	

	}


