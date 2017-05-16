package iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOExample {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("F:\\training java\\inheritance.mp4");
		BufferedInputStream bis= new BufferedInputStream(fis);

		FileOutputStream fout= new FileOutputStream("H:/ccopynew.mp4");
		BufferedOutputStream bout= new BufferedOutputStream(fout);
		System.out.println("copying started");
		byte Buffer[]=new byte[bis.available()];
		bis.read(Buffer);	
		bout.write(Buffer);	
		System.out.println(" success");
		bis.close();
		bout.close();
	}

}/*
FileInputStream fis = new FileInputStream("F:\\sample.txt");
BufferedInputStream bis= new BufferedInputStream(fis);

FileOutputStream fout= new FileOutputStream("H:/copiednew.txt");
BufferedOutputStream bout= new BufferedOutputStream(fout);
System.out.println("copying started");
//byte Buffer[]=new byte[bis.available()];
int tData =bis.read();
//bis.read();
while(tData!=-1){
	bout.write(tData);
	//System.out.println((char)tData);
	tData=bis.read();

}*/