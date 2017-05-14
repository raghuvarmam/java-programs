package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExam {

	public static void main(String[] args) throws IOException {

		System.out.println("DEMO fileinpuStream");
		FileInputStream fis = null;
		int k;
		byte[] a = new byte[10];
		try
		{
			fis = new FileInputStream("F:\\sample.txt");
			try{
				while((k = fis.read()) != -1)
				{
					System.out.print((char)k);
				}
				fis.close();
			} catch(IOException e)
			{
				System.out.println("Some IO problem. " + e);
			}  

		}
		catch(FileNotFoundException e)
		{
			System.out.println("The source file does not exist. " + e);
		}          

		try
		{
			fis = new FileInputStream("F:\\sample.txt");
			try{
				fis.read(a);
				System.out.println("");
				for(byte b:a) {
					System.out.print((char)b);
				}
				fis.close();
			} catch(IOException e)
			{
				System.out.println("Some IO problem. " + e);
			}  

		}
		catch(FileNotFoundException e)
		{
			System.out.println("The source file does not exist. " + e);
		} 

		try
		{
			fis = new FileInputStream("F:\\sample.txt");
			try{
				fis.read(a, 2,1);
				System.out.println("");
				for(byte b:a) {
					System.out.print((char)b);
				}
				fis.close();
			} catch(IOException e)
			{
				System.out.println("Some IO problem. " + e);
			}  

		}
		catch(FileNotFoundException e)
		{
			System.out.println("The source file does not exist. " + e);
		}          



	}

}
