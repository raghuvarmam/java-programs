package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("F:\\Raghuv.txt");
		BufferedWriter bw= null;
		String mycontent = "written to the specified File";
		bw = new BufferedWriter(fw);
		bw.write(mycontent);
		System.out.println("File written Successfully");	
		 if(bw!=null)   //if bw is null it shows error
			 bw.close();
		 fw.close();
	}
}

		/*     //this code is also working   //
		BufferedWriter bw = null;
	      try {
		 String mycontent = "hello how are you";
		 File file = new File("F:\\Raghu.txt");
		  if (!file.exists()) {
		     file.createNewFile();
		  }
		  FileWriter fw = new FileWriter(file);
		  bw = new BufferedWriter(fw);
		  bw.write(mycontent);
	          System.out.println("File written Successfully");

	      } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		}
	   */
	
