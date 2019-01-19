package com.skilldistillery.jets;

import java.util.Scanner;

public class Menu {
	public boolean showMenu(Scanner kb, Airfield af) {
		boolean loop = true;

		System.out.println("Please make a selection: ");
		System.out.println("\t1. List Jets\n");
		System.out.println("\t2. Fly All Jets\n");
		System.out.println("\t3. View Fastest Jet\n");
		System.out.println("\t4. View Jet With Longest Range\n");
		System.out.println("\t5. Load All Cargo Jets\n");
		System.out.println("\t6. Dogfight\n");
		System.out.println("\t7. Add A Jet To Fleet\n");
		System.out.println("\t8. Quit\n");

		int selection = kb.nextInt();

		switch (selection) {
		case 1:
			af.listJets();
			loop = subMenu(kb, af);
			break;
//		case 2:
//			af.flyJets();
//			break;
//		case 3:
//			af.viewFastest();
//			break;
//		case 4:
//			af.viewLongestRange();
//			break;
//		case 5:
//			af.loadCargo;
//			break;
//		case 6:
//			af.dogfight;
//			break;
//		case 7:
//			af.addJet;
//			break;
		case 8:
			System.out.println("Adios");
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
			break;
		case 2:
			System.out.println("Adios");
			loop = false;
			break;
			
		default:
			break;
		}
		return loop;
	}
}
