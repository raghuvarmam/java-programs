package accessspec.pack1;

public class Telephone {

	public String Num="+91 9791573352";
	private String Emi;
	protected String network;
	String country= "india";
	
	protected void incomCalls(){
		System.out.println("all incoming calls are free");
	}
	private void emi(){
		System.out.println("only for this telephone");
	}
	 public void nameOfNetwork(){
		System.out.print("network name is ");
	}
	 
	
}
