package myFirstJavaProject;
import java.util.Scanner;

public class main {
      /* Starting point
       * 
       * Runner
       */
	public static void main(String[] args) {
		
		String name = "Adow was here";
		//Execute statement
		System.out.print("Hello!"+name);
		System.out.println();
		System.out.println();
	
		
		// int = whole numbers
		int number= 120;
		// wrapper class
		Integer num = 203;
		// storess fractional numbers
		double radius;
		radius =123;
		double area;
		
		// Assign a value
		radius = 20;
		
		// Compute area
		area = radius  * radius * 3.14159;
		// get the result
		System.out.println("The area is " + radius + "is" +area);
		
		// stores a single character
		char a = 'b';
		
		
		char singleValue = 'b';
		System.out.println(singleValue);
		// stores fractional numbers
		float paycheck =1234.8f;
		System.out.println();
		//slide 46 Assignment operators
		int x = 5;
		int result = x+5;
		System.out.println(result);
		
		result = x * 5;
		System.out.println(result);
		
		result = x / 5 ;
		System.out.println(result);
		
		result =  x -3;
		System.out.println(result);
		
		result =  x % 5;
		System.out.println(result);
		
		// math operators
		Math.floor(paycheck);
		Math.abs(singleValue);
		Math.random();
		System.out.println(Math.random());
		Math.round(paycheck);
		Math.sqrt(paycheck);
		
		// Relational operators
	   System.out.println(7==7);
	   System.out.println(7!=7);
	   System.out.println(7>=7);
	   System.out.println(7<=7);
	   
	   // Conditional/Logical Operators
	   // and && : both have to be true
	   System.out.println(6> 7 && 7 > 6);
	   // OR || : only one has to be true/false
	   System.out.println(6 > 7 || 7 > 6);
	 
	   // Create the scanner using the new keyword
	   Scanner userInput = new Scanner(System.in);
	   // ask user what you want to enter 
	   System.out.println("Enter your name: ");
	   // sort the value in a new variable
	   String firstName = userInput.nextLine();
	   // print out what the user entered
	   System.out.println("My name is " + firstName);
	
	   
	   
	   // close the scanner
	   userInput.close();
		
		
		
		

	}

}
