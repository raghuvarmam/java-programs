package exception.handling;

public class BankOperation {
	double balence=0;
	double mDeposit;
	double mWithdraw;
	
	public double deposit(double mDeposit){
		balence+=mDeposit;
		System.out.println("amount deposited is " +balence);
		return balence;
	}
	
	public void withdraw(double mWithdraw) throws BankException{
		System.out.println(balence+" ");
		if(mWithdraw>balence){
			throw new BankException("insuff amount");
			//System.out.println("insuff amount to withdraw");
		}
		else{
			balence-=mWithdraw;	
		System.out.println("withdrawn amount is " +balence);
	}}

	public double getBalence() {
		return balence;
	}

	public double getmDeposit() {
		return mDeposit;
	}

	public double getmWithdraw() {
		return mWithdraw;
	}
	
	
	

}
