package accessspec.pack1;
import accessspec.pack2.*;
public class TestTelephone {

	public static void main(String[] args) {

		Verizon v1= new Verizon();
		v1.show();
		System.out.println(" ");
		Airtel a1=new Airtel();
		a1.show();
		System.out.println(" ");
		Idea i1=new Idea();
		i1.show();
		System.out.println(" ");
		AirteDubai att= new AirteDubai();
		att.show();
	}

}
