package com.skilldistillery.jets;

public class Airfield {

	// create array to store planes
	Plane[] planeArray = new Plane[100];

	// populate array
	public Airfield() {
		planeArray[0] = new FighterPlane("P40", "Warhawk", 362, 235, 850, 44_892);
		planeArray[1] = new CargoPlane("B17", "Flying Fortress", 300, 170, 1_850, 238_329, 6_981);
		planeArray[2] = new FighterPlane("P47", "Thunderbolot", 433, 250, 1_030, 83_000);
		planeArray[3] = new FighterPlane("B-24", "Liberator", 290, 215, 2_100, 297_627);
	}

	// for loop to list all planes in planeArray
	public void displayFleet() {

		for (Plane plane : planeArray) {
			// check if array slot is null
			if (plane != null) {
				System.out.println(plane.toString());
				System.out.println("\n");
			} else {
				System.out.println("*** All prices are in 1945 dollars ***");
				System.out.println("");
				break;
			}
		}
	}

}
