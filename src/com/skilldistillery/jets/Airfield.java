package com.skilldistillery.jets;

public class Airfield {

	Jet[] jetArray = new Jet[100];

	public Airfield() {
		jetArray[0] = new FighterJet("F22", 1000, 500, 1_000_000);
		jetArray[1] = new CargoPlane("C-130", 300, 500, 1_000_000);
	}

	public void listJets() {

		for (Jet jet : jetArray) {
			if (jet != null) {
				System.out.println(jet.getModel());
			} else {
				break;
			}
		}
	}

}
