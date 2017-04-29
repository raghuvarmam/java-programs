package poly.overiding;

public class Cat extends Animal {
	String name="tommy";
	int age=5;
@Override
	void action() {
		System.out.println("cat meows");
	}	
@Override
public int calcAge() {
	
	System.out.println("cat age is " +age);
	return age;
}
@Override
public void animalProperties() {
	System.out.println("cat name is " +name);
	super.animalProperties();
}
}
