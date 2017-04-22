package inherit.programs;

public class ExInheritCar {

	public static void main(String[] args) {

		
		Audi a4= new Audi();
		a4.setCost(50000000);
		a4.setFuel("diesel");
		a4.setType("suv");
		a4.setCapacity(5);
		a4.showDetails();
		a4.testDrive();
		
		Car s3 =new Car("sedan","petrol",5,7000000);
		s3.sellCar();
		
		Benz c3 = new Benz();
		c3.ranking();
	}
}