package accessspec.pack1;

public class Airtel extends Telephone {
private String network= "airtel";
	void show(){
		nameOfNetwork();
		System.out.print(network);
		System.out.println(" "+Num+ " is accessible");
		incomCalls();
		 // emi(); as it is private
		System.out.println(country);
	}
}
