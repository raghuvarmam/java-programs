package classes;

public class banking {

	public static void main(String[] args) {

		Account b1= new Account();
		b1.showdetails();
		b1.deposit(430000);
		Account b2 = new Account("1234",900000,"raghu");
		b2.setcnum("214-906-6438");
		b2.showdetails();
	}

}
