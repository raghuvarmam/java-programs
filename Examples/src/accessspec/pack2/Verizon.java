package accessspec.pack2;
import accessspec.pack1.*;
public class Verizon {
	private String network="Verizon";
	private String newCountry="USA";
	public void show(){  // if it is not public we cant access in main func of different package 
		
		Telephone Veri= new Telephone();
		Veri.nameOfNetwork();
		System.out.println(network);
		System.out.println(Veri.Num+ " is accessible");
		// Veri.incomCalls(); as it is protected
		System.out.println("As it is "+newCountry +" network for num "+ Veri.Num+ " is not accessible");
	}
}
