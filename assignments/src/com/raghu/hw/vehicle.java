package com.raghu.hw;

public class vehicle {

	private String name;
	private int tyres;
	private int seats;
	private double cost;
	
	public void showdetails(){
		System.out.println("vehicle num is " +name);
		System.out.println("no of tyres " +tyres);
		System.out.println("no of seats " +seats);
		System.out.println("cost of the vehicle " +cost);
	}

	
	public vehicle(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}


	public vehicle(String name, int tyres, int seats, double cost) {
		super();
		this.name = name;
		this.tyres = tyres;
		this.seats = seats;
		this.cost = cost;
	}
	
	public void testdrive(){
		System.out.println(" vehicle is taken for test drive");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
