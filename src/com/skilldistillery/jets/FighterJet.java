package com.skilldistillery.jets;

public class FighterJet extends Jet implements FighterInterface {

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, String name, double maxSpeed, double cruisingSpeed, int range, long price) {
		super(model, name, maxSpeed, cruisingSpeed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dogFight() {
		System.out.println(getName() + " is dogfighting.\n");		
	}
	
}
