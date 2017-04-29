package poly.overiding;

public class VeterDoctor {

	public void detailsOfAnimal(Animal a){
		a.animalProperties();
		a.action();
	}
	public int ageofAnimal(Animal a ){
		return a.calcAge();
	}
}
