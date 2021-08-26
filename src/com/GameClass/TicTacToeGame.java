package com.GameClass;

public class TicTacToeGame {
	public static char [] board=new char[10];
	public static void main(String args[]) {
		
		TicTacToeGame.useCase1();
		
	}
	
	public static void useCase1(){
		
		
		for(int i=0;i<board.length;i++)
		{
			board[i]=' ';
		}
	}

}
