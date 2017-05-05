package abst.interf;

public class TestDb {

	public static void main(String[] args) {

		MySQLDB db1= new MySQLDB();
		db1.connect();
		db1.disconnect();
		
		OracleDB db2= new OracleDB();
		db2.connect();
	}

}
