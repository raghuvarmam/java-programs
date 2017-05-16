package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyData {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("F:\\sample.txt");
		FileOutputStream fout = new FileOutputStream("H:/copiednew.txt");
		byte b[]=new byte[fis.available()]; //using byte copy
		fis.read(b);
		fout.write(b);
		
//		int sdata=fis.read();    //using int 
//		while(sdata!= -1){
//			fout.write(sdata);
//			sdata=fis.read();
//		}
		System.out.println("written success");
		fis.close();
		fout.close();
		
		
		/*String data="hello copying succes"; //writing data using string
		fout.write('r');     //single int value
		byte b[]= data.getBytes();
		fout.write(b);
		fout.write(b, 0, 4);
		System.out.println("written success");
		*/
		
				
	}

}
