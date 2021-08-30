package com.GameClass;

import java.util.Scanner;

/**
 * @author jayeshkumar This game has 9 block i.e 3*3 Player1 is user and Player2
 *         is computer
 *
 */


public class TicTacToeGame {
	private char[] board = new char[10];
	private char player1;
	private char player2; // computer
	private char turn=' ';

	public static void main(String args[]) {

		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.initBoard();
		tictactoe.playerLetter();
		tictactoe.getToss();
		tictactoe.showBoard();
		//tictactoe.userMove();
		//tictactoe.showBoard();
		//tictactoe.getToss();
		//char win=tictactoe.isWins();
		//System.out.println(win);
		tictactoe.checkWinner();
	}

	/**
	 * @author jayeshkumar Initailizing the board to empty spaces
	 *
	 */
	public void initBoard() {

		for (int i = 0; i < board.length; i++) {
			if(i%2==0) {
				board[i] = 'O';
			}
			else {
				board[i] = 'X';
			}
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
		player1 = r.next().charAt(0);
		if (player1=='X' || player1=='x') {
			player1='X';
			player2 = 'O';
			flag=1;
		} 
		else if (player1=='O' || player1=='o') {
			player1='O';
			player2 = 'X';
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
		
		System.out.println(board[1]+ " | "+board[2]+" | "+board[3]);
		System.out.println("-----------");
		System.out.println(board[4]+ " | "+board[5]+" | "+board[6]);
		System.out.println("-----------");
		System.out.println(board[7]+ " | "+board[8]+" | "+board[9]);
		
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
			if(index>9 || index <=0) {
				System.out.println("Invalid index.Choose between 1 to 9");
				flag=0;
			}
			else {
				flag=1;
			}
			if(flag !=0) {
			
			if(board[index]==' ') {
				System.out.println("Index is free and you can make move");
				board[index]=player1;//TODO make player1 and player2 char.
				
				flag=1;
			}
			else {
				System.out.println("Index is full and you cannot make move to that index");
				flag=0;
			}
			}
		}while(flag==0);
		
		
	}
	
	public void getToss() {
		System.out.println("Head or Tail\n 1 for Head\n 0 for Tail");
		Scanner r=new Scanner(System.in);
		int tossCall=r.nextInt();
		int tossResult= (int) (Math.floor(Math.random()*10) %2);
		if(tossCall==tossResult)
		{
			System.out.println("You have won the toss");
			turn='p';
			userMove();
		}
		else {
			System.out.println("You have loss the toss.Computer will make the firt move");
			turn='c';
			computerMove();
			
		}
		
	}

	public void computerMove() {
		
	}
	
	/**
	 * @return X if user wins,returns O if computer wins,returns t if its a tie,returns n if no winner
	 * and empty space available.
	 */
	public char isWins() {
		String combination=null;
		int i,j;
		for(i=1;i<=9;i++)
		{
			switch(i)
			{
			case 1:
					combination="" + board[1] + board[2] + board[3];
					break;
			case 2:
					combination="" + board[4] + board[5] + board[6];
					break;
			case 3:
					combination="" + board[7] + board[8] + board[9];
					break;
			case 4:
					combination="" + board[1] + board[4] + board[7];
					break;
			case 5:
					combination="" + board[2] + board[5] + board[8];
					break;
			case 6:
					combination="" + board[3] + board[6] + board[9];
					break;
			case 7:
					combination="" + board[1] + board[5] + board[9];
					break;
			case 8:
					combination="" + board[3] + board[5] + board[7];
					break;
					
			}
			if(combination.equals("XXX"))
			{
				return 'X';
			}
			else if(combination.equals("OOO")) {
				return 'O';
			}
		}
		for(j=1;j<=9;j++)
		{
			if(board[j]==' ') {
				//return 'n';
				break;
			}
		}
		
		if(j==10)
		{
			return 'T';
		}
		else
			return 'N';
		
	}
	
	public void checkWinner() {
		
		char result = isWins();
		
		if(result == Character.toUpperCase(player1)) {
			System.out.println("Congratulations.. You won the game");
			
		}
		else if(result == Character.toUpperCase(player2))
		{
			System.out.println("Sorry you lost the game.. Better luck next time");
		}
		else if(result == 'T') {
			System.out.println("Its a tie");
		}
		else if(result == 'N')
		{
			if(turn == 'p')
			{
				turn ='c';
				
			}
			else
			{
				turn ='p';
			}
		}
		
	}
	
	
	
	
	
	

	}


