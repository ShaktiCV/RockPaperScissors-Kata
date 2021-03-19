package com.rps;


public class GameDecisionMaker_RockPaperScissors {
	
	int player1_score = 0;
	int player2_score = 0;
	int numberOfTies = 0;
	
	public String gameDecider(String[] gameResults) {
		helperForDecisionMaking(gameResults);
		if(player1_score>player2_score) {
			return "PLAYER1_WINS";
		}
		else if(player2_score>player1_score) {
			return "PLAYER2_WINS";
		}
		return "TIE";
		
	}
 
	public void helperForDecisionMaking(String[] gameResults) {
		
		for(int i = 0 ; i< gameResults.length; i++ ) {
			if(gameResults[i].equalsIgnoreCase("PLAYER1_WINS")) {
				player1_score++;
			}
			else if(gameResults[i].equalsIgnoreCase("PLAYER2_WINS")) {
				player2_score++;
			}
			else if(gameResults[i].equalsIgnoreCase("TIE")) {
			 numberOfTies++;
			}
		}	
	}



}
