package classes;

public class Account {

	private String num;
	private String cname;
	private String cnumber;
	private double balance;

	void showdetails(){
		System.out.println("account num is " +num);
		System.out.println("customer name is " +cname);
		System.out.println("balance is " +balance);
		System.out.println("customer number is " +cnumber);

	}

	public Account(){
		System.out.println("empty constructor called");
	}

	public Account(String nnum, double nbalance, String ncname)
	{
		num = nnum;
		balance = nbalance;
		cname =ncname;
	}
	void deposit(double depositamount){
		balance += depositamount;
		System.out.println("deposit of " +depositamount + " made. new balance is  "+ balance);
	}
	
	void setnum(String nnum){
		num = nnum;
	}
	void setcnum(String ncnumber){
		cnumber= ncnumber;
	}
	
	public String getnum(){
		return num;
	}
	public double getbal(){
		return balance;
	}
	public String getcname(){
		return cname;
	}

}
