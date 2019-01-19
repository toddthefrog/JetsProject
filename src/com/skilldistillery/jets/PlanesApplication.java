package com.skilldistillery.jets;

import java.util.Scanner;

public class PlanesApplication {

	// main
	public static void main(String[] args) {
		PlanesApplication app = new PlanesApplication();
		Scanner kb = new Scanner(System.in);
		app.runApp(kb);
		
		kb.close();
	}

	// create new airfield
	private void runApp(Scanner kb) {
		Airfield af = new Airfield();
		Menu menu = new Menu();
		
		boolean loop = true;
		
		// while loop is true show menu
		while (loop) {			
			loop = menu.showMenu(kb, af);
		}

	}
}
