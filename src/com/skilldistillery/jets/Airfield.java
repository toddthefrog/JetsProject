package com.skilldistillery.jets;

import java.util.Scanner;

public class Airfield {

	// create array to store planes
	Jet[] jetArray = new Jet[100];

	// populate array
	public Airfield() {
		jetArray[0] = new FighterJet("P-40", "Warhawk", 362, 235, 850, 44_892);
		jetArray[1] = new CargoJet("B-17", "Flying Fortress", 300, 170, 1_850, 238_329, 6_981);
		jetArray[2] = new FighterJet("P-47", "Thunderbolt", 433, 250, 1_030, 83_000);
		jetArray[3] = new CargoJet("B-24", "Liberator", 290, 215, 2_100, 297_627, 18_500);
		jetArray[4] = new FighterJet("P-51", "Mustang", 437, 275, 1_000, 50_985);
		jetArray[5] = new CargoJet("B-25", "Mitchell", 328, 233, 2_500, 109_670, 6_746);
		jetArray[6] = new CargoJet("B-29", "Superfortress", 357, 220, 3_700, 639_188, 20_000);

	}

	// for loop to list all planes in planeArray
	public void displayFleet() {

		for (Jet jet : jetArray) {
			// check if array slot is null
			if (jet != null) {
				System.out.println(jet.toString());
				System.out.println("\n");
			} else {
				System.out.println("*** All prices are in 1945 dollars ***");
				System.out.println("");
				break;
			}
		}
	}

	public void fly() {
		for (Jet jet : jetArray) {
			// check if array slot is null
			if (jet != null) {
				System.out.println(jet.getName() + " taking off.");
				System.out.println("\n");
			} else {
				break;
			}
		}
	}

	public void loadCargoMethod() {
		for (Jet jet : jetArray) {
			if (jet instanceof CargoInterface) {
				((CargoInterface) jet).loadCargo();
			}
		}
	}

	public void dogFightMethod() {
		for (Jet jet : jetArray) {
			if (jet instanceof FighterInterface) {
				((FighterInterface) jet).dogFight();
			}
		}
	}

	public void addJet(Scanner kb, Airfield af) {
		int placeHolder = 0;
		
		for (Jet jet : jetArray) {
			if (jet != null) {
				placeHolder++;
			} else {
				jetArray[placeHolder] = new CargoJet();
			}
		}
		
		// String model, String name, double maxSpeed, double cruisingSpeed, int range,
		// long price
		// FighterJet("P-40", "Warhawk", 362, 235, 850, 44_892);
		System.out.println("Please enter the jet model: ");
		System.out.println("example -> P40");
		// save user input
		af.jetArray[placeHolder].setModel(kb.next());
		System.out.println("Please enter the jet name: ");
		System.out.println("example -> Warhawk");
		// save user input
		af.jetArray[placeHolder].setName(kb.next());
		System.out.println("Please enter the jet max speed in miles per hour: ");
		System.out.println("example -> 362");
		// save user input
		af.jetArray[placeHolder].setMaxSpeed(kb.nextDouble());
		System.out.println("Please enter the jet cruising speed in miles per hour: ");
		System.out.println("example -> 235");
		// save user input
		af.jetArray[placeHolder].setCruisingSpeed(kb.nextDouble());
		System.out.println("Please enter the jet range in miles: ");
		System.out.println("example -> 850");
		// save user input
		af.jetArray[placeHolder].setRange(kb.nextInt());
		System.out.println("Please enter the jet price in dollars: ");
		System.out.println("example -> 44892");
		// save user input
		af.jetArray[placeHolder].setPrice(kb.nextLong());

		System.out.println(af.jetArray[placeHolder].toString());
	}

	public void viewFastest() {
		int index = 0;
		int i = 0;
		for (Jet jet : jetArray) {
			// check if array slot is null
			if (jet != null) {
				if (jetArray[index].getMaxSpeed() < jetArray[i].getMaxSpeed())
					index = i;
				i++;
			} else {
				break;
			}
		}
		System.out.println(jetArray[index]);
		System.out.println("\n");

	}

	public void viewLongestRange() {
		int index = 0;
		int i = 0;
		for (Jet jet : jetArray) {
			// check if array slot is null
			if (jet != null) {
				if (jetArray[index].getRange() < jetArray[i].getRange())
					index = i;
				i++;
			} else {
				break;
			}
		}
		System.out.println(jetArray[index]);
		System.out.println("\n");
	}

}
