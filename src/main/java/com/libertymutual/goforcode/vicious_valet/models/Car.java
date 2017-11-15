package com.libertymutual.goforcode.vicious_valet.models;

public class Car {
	private String license;
	private String licenseState;
	private String make;
	private String model;
	private String color;

	// parameter below - instance field above
	public Car(String license, String licenseState, String make, String model, String color) {
		this.make = make;
		this.license = license;
		this.licenseState = licenseState;
		this.color = color;
		this.model = model;
	}

	public String getLicense() {
		return license;
	}

	public String getLicenseState() {
		return licenseState;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

}
