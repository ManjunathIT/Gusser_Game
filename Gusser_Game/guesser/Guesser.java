package com.nextmile.guesser;

import java.util.Scanner;

public class Guesser {
	int guesserNumber;
	
	 public int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser, kindly guess a number(1-5)");
		guesserNumber = scan.nextInt();
		return guesserNumber;
	}
}
