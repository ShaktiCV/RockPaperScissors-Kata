package com.rpstest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.rps.GameDecisionMaker_RockPaperScissors;
import com.rps.RockPaperScissors.RoundWinners;

public class gameDecisionMaker_RockPaperScissors_Test {

	
	GameDecisionMaker_RockPaperScissors winner = new GameDecisionMaker_RockPaperScissors();	

	 @Test public void test_GameDecisionShouldBe_PLAYER1_WINS_WhenAll3RoundsAreWonByPlayer1() { 
		 
		String gameResults[] = {RoundWinners.PLAYER1_WINS.toString(),RoundWinners.PLAYER1_WINS.toString(),RoundWinners.PLAYER1_WINS.toString()};
		assertEquals(RoundWinners.PLAYER1_WINS.toString(), winner.gameDecider(gameResults));
	 }
	 
	 @Test public void test_GameDecisionShouldBe_TIE_WhenAll3RoundsAreTIE() { 
		 
			String gameResults[] = {RoundWinners.TIE.toString(), RoundWinners.TIE.toString(),RoundWinners.TIE.toString()};
			assertEquals(RoundWinners.TIE.toString(), winner.gameDecider(gameResults));
		 }
	 
	 @Test public void test_GameDecisionShouldBe_PLAYER1_WINS_When2RoundsAreTieAndOneRoundIsWonByPlayer1() { 
		 
			String gameResults[] = {RoundWinners.PLAYER1_WINS.toString(), RoundWinners.TIE.toString(),RoundWinners.TIE.toString()};
			assertEquals(RoundWinners.PLAYER1_WINS.toString(), winner.gameDecider(gameResults));
		 }
	 
	 @Test public void test_GameDecisionShouldBe_PLAYER2_WINS_When2RoundsAreWonByPlayer2And1RoundIsTIE() { 
		 
			String gameResults[] = {RoundWinners.PLAYER2_WINS.toString(), RoundWinners.TIE.toString(),RoundWinners.PLAYER2_WINS.toString()};
			assertEquals(RoundWinners.PLAYER2_WINS.toString(), winner.gameDecider(gameResults));
		 }
	 

	 @Test public void test_GameDecisionShouldBe_TIE_When1RoundsAreWonByPlayer1And1RoundIsTIEAnd1RoundIsWonByPlayer2() { 
		 
			String gameResults[] = {RoundWinners.PLAYER2_WINS.toString(),RoundWinners.PLAYER1_WINS.toString(),RoundWinners.TIE.toString()};
			assertEquals(RoundWinners.TIE.toString(), winner.gameDecider(gameResults));
		 }
	 

	 @Test public void test_GameDecisionShouldBe_PLAYER2_WINS_When2RoundsAreWonByPlayer2And1RoundIsWonByPlayer1() { 
		 
			String gameResults[] = {RoundWinners.PLAYER2_WINS.toString(),RoundWinners.PLAYER1_WINS.toString(),RoundWinners.PLAYER2_WINS.toString()};
			assertEquals(RoundWinners.PLAYER2_WINS.toString(), winner.gameDecider(gameResults));
		 }
	 
	 
	 
}
