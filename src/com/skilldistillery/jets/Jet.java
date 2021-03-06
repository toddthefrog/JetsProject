package com.skilldistillery.jets;

abstract public class Jet {

	private String model;
	private String name;
	private double maxSpeed;
	private double cruisingSpeed;
	private int range;
	private long price;

	// default constructor
	public Jet() {
		super();
	}

	// all parameters constructor
	public Jet(String model, String name, double maxSpeed, double cruisingSpeed, int range, long price) {
		super();
		this.model = model;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.cruisingSpeed = cruisingSpeed;
		this.range = range;
		this.price = price;
	}

	// default Plane toString
	// to be overridden by subclasses if new parameters are added
	public String toString() {
		return "[model] " + model + " " + name + " [max speed] " + maxSpeed + " [cruising speed] " + cruisingSpeed
				+ " [range] " + range + " [price] " + price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getCruisingSpeed() {
		return cruisingSpeed;
	}

	public void setCruisingSpeed(double cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
