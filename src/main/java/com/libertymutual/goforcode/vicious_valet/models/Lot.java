package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList; // declare variable
	private int capacity;

	public Lot(int capacity) {
		this.capacity = capacity;
		carList = new ArrayList<Car>(); // set the initial value of the var
	}

	//added list when changed to lot.size
	
	public void removeCarFromLot(int index) {
		carList.remove(index-1);
	}
	
	public int size() {
		return carList.size();
	}
	
	public void driveCarOnto(Car car) {
		// add car to lot if there is capacity
		if (!isLotFull()) {
			carList.add(car);

		}
	}

	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else {
			return true;
		}
	}

		
	public ArrayList<Car> getCarList() {
		return carList;
	}
}

