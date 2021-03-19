package com.rpstest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rps.RockPaperScissors;
import com.rps.RockPaperScissors.RoundWinners;



public class RockPaperScissorsTest {	
	
	public enum PlayerChoice{
		ROCK, PAPER, SCISSORS
	}	

	
	RockPaperScissors rps = new RockPaperScissors();	
	
		@Test
		public void When_BothPlayersChooseRock_ShouldReturnDecisionAsTie() {		
			assertEquals(RoundWinners.TIE, rps.getWinner(PlayerChoice.ROCK, PlayerChoice.ROCK));
		}	
		
	
		@Test
		public void When_Player1ChoosesRock_Player2ChoosesScissors_Player1ShouldWin() {	
			assertEquals(RoundWinners.PLAYER1_WINS, rps.getWinner(PlayerChoice.ROCK,PlayerChoice.SCISSORS));				
		}
	
	
	  @Test public void when_Player1ChoosesPaper_Player2ChoosesRock_Player1ShouldWin() {		
		  assertEquals(RoundWinners.PLAYER1_WINS, rps.getWinner(PlayerChoice.PAPER,PlayerChoice.ROCK));	  
	  }
	  
	  @Test public void when_Player1ChoosesScissors_Player2Chooses_Player1ShouldWin() {			 
		  assertEquals(RoundWinners.PLAYER1_WINS, rps.getWinner(PlayerChoice.SCISSORS,PlayerChoice.PAPER));	  
	  }
	  
	  @Test public void when_Player1ChoosesRock_Player2ChoosesPaper_Player2ShouldWin() {		 
		  assertEquals(RoundWinners.PLAYER2_WINS, rps.getWinner(PlayerChoice.ROCK,PlayerChoice.PAPER)); 
	  }
	  
	  @Test public void when_Player1Choosespaper_Player2ChoosesScissors_Player2ShouldWin() {		 
		  assertEquals(RoundWinners.PLAYER2_WINS, rps.getWinner(PlayerChoice.PAPER,PlayerChoice.SCISSORS)); 
	  }
	  
	  @Test public void when_Player1ChoosesScissors_Player2ChoosesRock_Player2ShouldWin() {		 
		  assertEquals(RoundWinners.PLAYER2_WINS, rps.getWinner(PlayerChoice.SCISSORS,PlayerChoice.ROCK)); 
	  }
	  
	  
	 
	

}
