package fileIOproject1;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
////		Java files and java 10:slide 7
//     Absolute Path
//    Relative path
//
//    Byte streams perform in and out of 8-bit bytes
//
//		FileReader in = null;
//		FileWriter out = null;
//		try {
//		in= new FileReader("input.txt");
//		out= new FileWriter("output.txt");
//		
//		int num;
//		while((num = in.read()) != -1){
//			out.write(num);
//		    }
//		}finally {
//			if(in != null) {
//				in.close();
//			System.out.println("ran in");
//		}
//		if(out !=null) {
//				out.close();
//			   System.out.println("ran out");
//			}
//	}

//	InputStreamReader streamIn = null;
//	try{
//	
//		streamIn = new InputStreamReader(System.in);
//		System.out.println("Enter Q to Quiet");
//
//		char Q;
//		do {
//			Q = (char) streamIn.read();
//			System.out.println(Q);
//		} while (Q != 'Q');
//	}finally
//	{
//		if (streamIn != null) {
//			streamIn.close();
//		}
//	}
//    Character streams
//    Standard streams
//    Reading and writing Files
      // created a CSV file
//		String path = "newfile.csv";
	// Try to run this code first
//		try {
//			// created a file obj
//		File file = new File(path);
//		// scanner to read this and print it out in the consol
//		Scanner input = new Scanner(file);
//		// Arraylist using the obj of course
//		ArrayList<Course> data = new ArrayList<>();
//		
//		while(input.hasNextLine()) {
//			String Line = input.nextLine();
//			data.add(new Course(line[0], line[1], line[2](","), 0);
//		}
//           for(Course l : data){
//        	   System.out.println(l[0] + " | " + "| "  + l[2]);
//           }
//		String inputLine = input.nextLine();
//		
//// String inputLine = input.nextLine();
//	}catch(
//
//	FileNotFoundException e)
//	{
//		System.out.println("No file here");
//		e.printStackTrace();
	}

//		System.out.println(file.isDirectory());
//		// return a an of files
//		File[] Filewithpath = file.listFiles();
	   try {
		   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);
		   System.out.println("what is your name?");
		   String name = reader.readLine();
		   
		   System.out.println("what is your job?");
		   String job = reader.readLine();
		   System.out.format("%s, %s", name, job);
		   
		   
	   }catch(Exception ioe) {

		   System.out.println( "IO in bufferedReader in main");
		   ioe.printStackTrace();
		   
}

}
}