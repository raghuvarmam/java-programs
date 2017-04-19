package raghu.game;
import com.raghu.hw.vehicle;
public class TestVehicle {

	public static void main(String[] args) {

		vehicle v1 = new vehicle("benz",4,5,5000000);
		v1.showdetails();
		v1.testdrive();
		v1.setCost(650000000);
		System.out.println(v1.getCost());
		
		vehicle v2 =new vehicle("audi", 10000000);
		v2.showdetails();
		
		
		
	}

}
