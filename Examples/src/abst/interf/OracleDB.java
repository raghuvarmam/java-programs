package abst.interf;

import java.util.Scanner;

public class OracleDB implements DBConnect {
	Scanner st= new Scanner(System.in);

	@Override
	public void connect() {
		System.out.println("press 1 if u want to connect to ORACLE DB ");
		String select =st.nextLine();
		if (select=="1")
			System.out.println("you have connected to sqldb");
		else
		System.out.println("you are not connected");
	}
	
	@Override
	public void execute() {
		System.out.println("you can run the database ");		
	}
	
	@Override
	public void disconnect() {
		 System.out.println("you are now disconnected to ORACLE");		
	}

}
