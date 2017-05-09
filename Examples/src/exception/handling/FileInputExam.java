package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExam {

	public static void main(String[] args) throws IOException {

		System.out.println("DEMO fileinpuStream");
		FileInputStream fis = null;
		int k;
		try
		{
			fis = new FileInputStream("abc.txt");
			try{
				while((k = fis.read()) != 5)
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




	}

}
