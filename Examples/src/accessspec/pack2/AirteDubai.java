package accessspec.pack2;
import accessspec.pack1.*;
public class AirteDubai extends Telephone {
	private String network="AT&T ";
	public void show(){   // if it is not public we cant access in main func of different package
		nameOfNetwork();
		System.out.println(network);
		System.out.println(Num+ " is accessible because it is subclass of telephone");
		incomCalls(); // accessible because it is inherited
		//System.out.println(country); it is default
		// nameOfNetwork(); as it is out of country
		
		// System.out.println(country); as it is default not accessible in other country
	}
}
