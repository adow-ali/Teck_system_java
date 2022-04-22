package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main{ 
//Exceptions
	public static void main(String[] args )throws CustomExceptionFile{
		//Checked exception
		// FileNotFoundException
		
		try {
	    File myFile = new File("text.txt");
	    System.out.println();
	    
	    
	    FileReader fr  = new FileReader(myFile);
	    
	    int num[] = {1,2,3,4};
		System.out.println(num[7]);
		
	    
		}catch(FileNotFoundException e) {
			// TODO Auto-generated  catch block
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ea) {
			ea.printStackTrace();
		}finally {
			System.out.println("Everything is working");
		
		} 
		
	}
}
		
	
		
	    
		
	
		
 		
//		try{
			// try this
//		}catch{
			// catch Exception
		
		
	


