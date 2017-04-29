package poly.overiding;

public class TestLib {

	public static void main(String[] args) {

		Library l1= new Library("sam raybun library","computers","textbook");
		Book bnew = new Book("java","james",3,"available");
		l1.setB1(bnew);
		l1.showDetails();
		Book bookDetails = l1.getB1();
		bookDetails.showDetails();
		System.out.println("/*************");
		l1.getB1().showDetails();
		System.out.println("/*************");
		l1.setType("journal");
		l1.showDetails();
		bookDetails.setStatus("not available");
		l1.getB1().showDetails();

	}

}
