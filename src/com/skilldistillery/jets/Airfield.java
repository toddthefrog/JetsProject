package com.skilldistillery.jets;

public class Airfield {

	Plane[] planeArray = new Plane[100];

	public Airfield() {
		planeArray[0] = new FighterPlane("F22", 1000, 500, 1_000_000);
		planeArray[1] = new CargoPlane("C-130", 300, 500, 1_000_000);
	}

	public void listFleet() {

		for (Plane plane : planeArray) {
			if (plane != null) {
				System.out.println(plane.listFleet());
			} else {
				System.out.println("");
				break;
			}
		}
	}

}
