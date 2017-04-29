package accessspec.pack1;

public class Airtel extends Telephone {
private String network= "airtel";
@Override
	public void nameOfNetwork() {
		// TODO Auto-generated method stub
		super.nameOfNetwork();
		System.out.println("overrided method");
	}
	void show(){
		nameOfNetwork();
		System.out.print(network);
		System.out.println(" "+Num+ " is accessible");
		incomCalls();
		 // emi(); as it is private
		System.out.println(country);
	}
}
