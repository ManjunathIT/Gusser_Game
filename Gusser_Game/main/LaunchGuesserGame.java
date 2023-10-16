package com.nextmile.main;

import com.nextmile.umpire.Umpire;

public class LaunchGuesserGame {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();
	}
}
