package com.rps;

import com.rpstest.RockPaperScissorsTest.PlayerChoice;

public class RockPaperScissors {
	
	public enum RoundWinners{
		PLAYER1_WINS, PLAYER2_WINS, TIE
	}
	
	
	public Object getWinner(PlayerChoice player1Choice, PlayerChoice player2Choice) {
		if(player1Choice == player2Choice) {
			return RoundWinners.TIE;
		}
		
		else if(isPlayer1Winning(player1Choice, player2Choice)){
			
			return RoundWinners.PLAYER1_WINS;
		}		
		
		 return RoundWinners.PLAYER2_WINS;
	}


	public boolean isPlayer1Winning(PlayerChoice player1Choice, PlayerChoice player2Choice) {
		return (player1Choice==PlayerChoice.ROCK && player2Choice == PlayerChoice.SCISSORS)
				||(player1Choice==PlayerChoice.PAPER && player2Choice == PlayerChoice.ROCK)
				||(player1Choice ==PlayerChoice.SCISSORS && player2Choice == PlayerChoice.PAPER);
	}
	





}
