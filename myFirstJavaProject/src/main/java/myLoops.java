package myFirstJavaProject;
import java.util .Scanner;
public class myLoops {

	public static void main(String[] args) {

		int num = 10;
		int otherNum = 7;

		//boolean
		boolean isEven =num%2==0;
		if((num % 2 ==0 )|| (num % 3==0)){
		System.out.println("even");

		// if and else
		int age = 16;

		if (age > 15 && age < 18){
		System.out.println("In range");
		}else if (age > 18 && age < 25) {
		System.out.println("Is age over the age of 18");
		}else{
		System.out.println("Not in range");
		}

		Scanner userInput = new Scanner(System.in);

		System.out.println("Hi, what is your name?");
		String userName = userInput.nextLine();

		System.out.println("what is your age");
		int userAge = userInput.nextInt();

		if(userAge > 17){
		System.out.println( userName + "you may pass");
		}


		int day = 5;
		switch (day) {
		case 1:
		 System.out.println("Monday");
		 break;
		 
		   case 2:
		  System.out.println("Tuesday");
		  break;
		 case 3:
		   System.out.println("Wednesday");
		   break;
		 case 4:
		   System.out.println("Thursday");
		   break;

		 default:  
		 System.out.println("I am on break");
		}    
		    // ternary operator
		 
		 //(run expression)? "yes" or "no";
		 
		boolean exp = (3>=0) ? true : false;
		System.out.println(exp);

		// loops
		// for while
		boolean flag = true;
		int count =1;
		    while(count < 20){
		System.out.println(count + "Welcome");

		//count = count + 1;
		 count ++;
		//for loop
		// break $ continue
		    }
		//do while loop
		//int count =3;
		   //this loop will run once it checks the condition
		//System.out.println(count);
		     // count++;
		  ///}while(count <=0);

		//for loop
		// for (initialize action: condition, after iteration)
		//for (start variable; condition to be met, add one to the iteration
		for(count = 0; count<10; count++ ) {
		System.out.println(count+ "count");
		}
		// nesting for loop
		for(int i =0; i < 10; i++) {
		System.out.println("count"+i);
		for(int j=1; j<=5; j++) {
		System.out.println(j);
		}}

		for(int i =3 ; i < 100; i++) {
		System.out.println(i);

	}

}
		      
}
	
}
		      
