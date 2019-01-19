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
	public Plane(String model,String name, double maxSpeed, double cruisingSpeed, int range, long price) {
		super();
		this.model = model;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.cruisingSpeed = cruisingSpeed;
		this.range = range;
		this.price = price;
	}
	
	// create string of plane parameters
	public String listFleet() {
		String s = "Model: " + this.model + " Name: " + this.name + " Max Speed: " + this.maxSpeed + " Cruising Speed: " + cruisingSpeed + " Range: " + this.range + " Price: " + this.price;
		
		return s;
	}

	// generate setters and getters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return maxSpeed;
	}

	public void setSpeed(double speed) {
		this.maxSpeed = speed;
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
