package com.skilldistillery.jets;

import java.util.Scanner;

public class Menu {
	public boolean showMenu(Scanner kb, Airfield af) {
		boolean loop = true;

		System.out.println("The Aircraft of World War 2 Catalog\n");
		System.out.println("Please make a selection: ");
		System.out.println("\t1. List Fleet\n");
		System.out.println("\t2. Fly All Aircraft\n");
		System.out.println("\t3. View Fastest Aircraft\n");
		System.out.println("\t4. View Aircraft With Longest Range\n");
		System.out.println("\t5. Load All Cargo Aircraft\n");
		System.out.println("\t6. Dogfight\n");
		System.out.println("\t7. Add An Aircraft To The Fleet\n");
		System.out.println("\t8. Quit\n");

		int selection = kb.nextInt();

		switch (selection) {
		case 1:
			clearScreen();
			af.displayFleet();
			loop = subMenu(kb, af);
			break;
		case 2:
			clearScreen();
			af.fly();
			loop = subMenu(kb, af);
			break;
		case 3:
			clearScreen();
			af.viewFastest();
			loop = subMenu(kb, af);
			break;
		case 4:
			clearScreen();
			af.viewLongestRange();
			loop = subMenu(kb, af);
			break;
		case 5:
			clearScreen();
			af.loadCargoMethod();
			loop = subMenu(kb, af);
			break;
		case 6:
			clearScreen();
			af.dogFightMethod();
			loop = subMenu(kb, af);
			break;
		case 7:
			clearScreen();
			af.addJet(kb, af);
			loop = subMenu(kb, af);
			break;
		case 8:
			System.out.println("Come back now, ya hear?");
			System.exit(0);

		default:
			break;
		}
		return loop;
	}

	private boolean subMenu(Scanner kb, Airfield af) {
		boolean loop = true;

		System.out.println("Please make a selection: ");
		System.out.println("\t1. Return To Main Menu");
		System.out.println("\t2. Quit");
		int selection = kb.nextInt();
		

		switch (selection) {
		case 1:
			loop = true;
			clearScreen();
			break;
		case 2:
			clearScreen();
			System.out.println("Adios");
			loop = false;
			break;

		default:
			break;
		}
		return loop;
	}
	
//	private boolean addJet(Scanner kb, Airfield af) {
//		boolean loop = true;
//
//		System.out.println("Please enter the jet model: ");
//		// save user input
//		System.out.println("Please enter the jet name: ");
//		// save user input
//		System.out.println("Please enter the jet name: ");
//		
//		int selection = kb.nextInt();
//		
//
//		switch (selection) {
//		case 1:
//			loop = true;
//			clearScreen();
//			break;
//		case 2:
//			clearScreen();
//			System.out.println("Adios");
//			loop = false;
//			break;
//
//		default:
//			break;
//		}
//		return loop;
//	}

	private void clearScreen() {
		for (int i = 0; i < 20; i++) {
			System.out.println("\n");
		}
	}

}
