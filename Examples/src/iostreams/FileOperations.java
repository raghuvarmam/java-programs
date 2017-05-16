package iostreams;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws Exception {
		/*
		File f = new File("F:\\softwares\\new");
		//creating a directory
        Boolean bool = f.mkdir();        
        System.out.print("Directory created? "+bool);
        
        //creating a new file
		f=new File("F:/sample.txt");
		f.createNewFile();
		
		//rename the file
		 f = new File("F:/sample.txt");
         File f1 = new File("F:/samplenew.txt");
         bool = f.renameTo(f1);
		System.out.println("***********8");
		*/
		File nf = new File("F:/");
		
		 if(nf.exists())
	        {      
	            String arr[]=nf.list();
	            int n=arr.length;
	            for (int i = 0; i < n ; i++) {
	                System.out.println(arr[i]);               
	                File[] fList = nf.listFiles();
	                for (File file : fList){
	                	 if (file.isFile()){
	 	                	System.out.println("  "+file.getName()+" is file");
	 	                } else if (file.isDirectory()){
	 	                	System.out.println("  "+file.getAbsolutePath()+ " is directory");
	   	 	            }
	                }	               
	            }
	            System.out.println("No of entries in this directory "+n);
	        }
	        else
	            System.out.println("Directory not found");
		
	}

}
