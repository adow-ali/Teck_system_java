package main;

import java.util.Scanner;

public class GroupTwelveCustomeException extends Exception{

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter  7  digit value ");
        Long  value = Scanner.nextLong();

        if(value >= 7) {
        	
        	System.out.println("That is  correct"); 
        	
        	} else if (value <7) 
        		
        	System.out.println("That is not correct");

        	}
	}
	
     
	    
	  
    
	

	


