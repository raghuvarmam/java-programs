package poly.overiding;

public class Animal {

	private int legs;
	private String name;
	private int age;
	
	public void animalProperties(){
		System.out.println("details of animal");
		System.out.println("name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The number of legs are "+legs);
					
	}
	void action(){
		System.out.println("animal runs");
	}
	
	public int calcAge(){
		System.out.println("age of the animal is ");
		return age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
