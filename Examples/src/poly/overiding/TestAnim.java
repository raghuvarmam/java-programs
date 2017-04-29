package poly.overiding;

public class TestAnim {
public static void main(String[] args) {
	VeterDoctor doc= new VeterDoctor();
	Animal a1 = new Dog();
	a1.setLegs(4);
	doc.detailsOfAnimal(a1);
	
	Animal a2 =new Cat();
	a2.setLegs(4);
	doc.ageofAnimal(a2);
	doc.detailsOfAnimal(a2);
	
}
	
	
}
