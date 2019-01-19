package com.skilldistillery.jets;

abstract public class Plane {

	private String model;
	private String name;
	private double maxSpeed;
	private double cruisingSpeed;
	private int range;
	private long price;

	// default constructor
	public Plane() {
		super();
	}

	// all parameters constructor
	public Plane(String model, String name, double maxSpeed, double cruisingSpeed, int range, long price) {
		super();
		this.model = model;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.cruisingSpeed = cruisingSpeed;
		this.range = range;
		this.price = price;
	}
	
	public String toString() {
		return "Model: " + model + " Name: " + name + " Max Speed: " + maxSpeed + " Cruising Speed: "
				+ cruisingSpeed + " Range: " + range + " Price " + price;
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
