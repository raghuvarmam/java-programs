package poly.overiding;

public class Dog extends Animal {
String name="snoopy";
int age=10;
@Override
void action() {
	// TODO Auto-generated method stub
	System.out.println(" dog barks");
	
}
@Override
	public void animalProperties() {
		// TODO Auto-generated method stub
	System.out.println("name of dog is "+name);
	System.out.println("dog age is "+age);
		super.animalProperties();
	}
}

