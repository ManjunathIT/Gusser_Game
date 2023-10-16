package com.nextmile.player;

import java.util.Scanner;

public class Player {
	int playerNumber;
	
	public int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player, kindly guess a number(1-5s)");
		playerNumber = scan.nextInt();
		return playerNumber;
	}
}
