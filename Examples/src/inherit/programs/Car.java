package inherit.programs;

 public class Car {
	String type;
	String fuel;
	int capacity;
	double cost;
	
	public Car() {
		super();
	}
	void testDrive(){
		System.out.println(" taken for test drive");
	}
	void sellCar(){
		System.out.println(" sold out");
	}
	
	
	public Car(String type, String fuel, int capacity, double cost) {
		super();
		this.type = type;
		this.fuel = fuel;
		this.capacity = capacity;
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	

}
