package com.skilldistillery.jets;

public class CargoPlane extends Plane {
	private int cargoWeight;

	public CargoPlane() {
		
	}

	public CargoPlane(String model, String name, double maxSpeed, double cruisingSpeed, int range, long price, int cargoWeight) {
		super(model, name, maxSpeed, cruisingSpeed, range, price);
		this.setCargoWeight(cargoWeight);
	}

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	@Override
	public String toString() {
		return super.toString() + " Max Cargo = " + cargoWeight;
	}

}
