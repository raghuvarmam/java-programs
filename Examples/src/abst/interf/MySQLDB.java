package abst.interf;

import java.util.Scanner;
public class MySQLDB implements DBConnect {
	Scanner st= new Scanner(System.in);
	@Override
	public void connect() {
		System.out.println("press 1 if u want to connect to mysql ");
		String select =st.nextLine();
		if (select=="1"){
			System.out.println("you have connected to sqldb");
		}
	}
	
@Override
public void execute() {
	System.out.println("you can run the database ");
}

@Override
public void disconnect() {
 System.out.println("you are now disconnected to db");
}
}
