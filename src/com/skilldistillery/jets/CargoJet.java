package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoInterface {

	private int cargoWeight;

	public CargoJet() {

	}

	public CargoJet(String model, String name, double maxSpeed, double cruisingSpeed, int range, long price,
			int cargoWeight) {
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
		return super.toString() + " [max cargo] " + cargoWeight;
	}

	@Override
	public void loadCargo() {
		System.out.println(getName() + " loading cargo.\n");
	}
}
