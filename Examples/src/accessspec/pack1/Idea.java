package accessspec.pack1;

public class Idea {
	private String network="idea";

	void show(){
		
		Telephone idea = new Telephone();
		idea.nameOfNetwork();
		System.out.println(network);
		System.out.println(idea.Num+ " is accessible");
		// idea.emi(); as it is private
		idea.incomCalls(); 
		System.out.println(idea.country);
	}
}
