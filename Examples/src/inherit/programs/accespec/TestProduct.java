package inherit.programs.accespec;
import inherit.programs.WashMachine;
public class TestProduct {

	public static void main(String[] args) {
		WashMachine voltas =new WashMachine("washing",24000,"whirlpool");
		voltas.showProduct();
		//voltas.test();
		Product tv =new Product("watching",75000,"samsung");
		tv.setBrand("onida");
		System.out.println(tv.getBrand());
		tv.showProduct();
		
		

	}

}
