package com.nextmile.umpire;

import com.nextmile.guesser.Guesser;
import com.nextmile.player.Player;

public class Umpire {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	public void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNumber();
	}
	
	public void collectNumberFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numberFromPlayer1 = p1.guessNumber();
		numberFromPlayer2 = p2.guessNumber();
		numberFromPlayer3 = p3.guessNumber();
	}
	
	public void compare() {
		System.out.println("Number guessed by the guesser is " + numberFromGuesser);
		if(numberFromGuesser == numberFromPlayer1 && numberFromGuesser == numberFromPlayer2
				&& numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player1, player2 and player3 are the winners");
		}
		else if(numberFromGuesser == numberFromPlayer1 && numberFromGuesser == numberFromPlayer2) {
			System.out.println("Player1 and player2 are the winners");
		}
		else if(numberFromGuesser == numberFromPlayer1 && numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player1 and player3 are the winners");
		}
		else if(numberFromGuesser == numberFromPlayer2 && numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player2 and player3 are the winners");
		}
		else if(numberFromGuesser == numberFromPlayer1) {
			System.out.println("Player1 wins");
		}
		else if(numberFromGuesser == numberFromPlayer2) {
			System.out.println("Player2 wins");
		}
		else if(numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player3 wins");
		}
		else {
			System.out.println("Game lost. Try again!!!");
		}
	}
}












