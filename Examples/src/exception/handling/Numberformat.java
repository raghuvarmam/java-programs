package exception.handling;



public class Numberformat {

	public static void main(String[] args) {
		System.out.println("DEMO number formatException");{
			String s="-12g5";
			try {
				int num = Integer.parseInt (s) ;
				System.out.println(num);
			} catch(NumberFormatException e) {
				System.out.println(s+" is not a number");
				System.out.println(e);
				e.printStackTrace();
			}
			finally{
				System.out.println("demo of numberformat Exception");
			}
		}
		System.out.println("DEMO stringindexoutofbound");{
			String a = "raghu ";
			try {
				System.out.println("length of the string is "+a.length());
				char c = a.charAt(10);
				System.out.println(c);
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}


	}
}
