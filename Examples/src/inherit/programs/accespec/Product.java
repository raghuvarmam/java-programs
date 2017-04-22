package inherit.programs.accespec;


public class Product {

	String use;
	double cost;
	String brand;
	
	public void running(){
		System.out.println("product is working ");
	}
	
public void showProduct(){
	 System.out.println("this product is for " +use);
		System.out.println("cost of the product is " +cost);
		System.out.println(" brand of the product is " +brand);
}
	public Product(String use, double cost, String brand) {
		super();
		this.use = use;
		this.cost = cost;
		this.brand = brand;
	}


	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
