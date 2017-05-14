package exception.handling;

public class TestBank {

	public static void main(String[] args) throws BankException {
		
		BankOperation sbi = new BankOperation();
		sbi.deposit(500);
		sbi.withdraw(550);
		//throw new BankException("thjkk");
			
		
	}

}
