package homeworks;

public class Bank {

	public static void main(String[] args) {

		BankDetails b1 = new BankDetails();
		b1.name="SBI";
		b1.ceo="raghav";
		b1.hq="delhi";
		b1.revenue=3200000;
		b1.Bankproperties();
		b1.deposit(6000);
		System.out.println("*******************");
		
		BankDetails b2 =new BankDetails();
		b2.name="icici";
		b2.ceo="roy";
		b2.hq="bombay";
		b2.revenue=28000000;
		b2.Bankproperties();
		 b2.CreateAcnt();
				
		
		
	}

}

class BankDetails{
	String name;
	double revenue;
	String ceo;
	String hq;
	 int deposit( int n){
		System.out.println(" You want to deposit is " +n);
		
		return n;
	}
	void CreateAcnt(){
		System.out.println("what type of acnt?");
	}
	void TakeLoan(){
		System.out.println("which loan ?");
	}
	void Bankproperties(){
		System.out.println("Name is "+name);
		System.out.println("ceo is "+ceo);
		System.out.println("head quarters is "+hq);
		System.out.println("revenue is "+revenue);
}
}