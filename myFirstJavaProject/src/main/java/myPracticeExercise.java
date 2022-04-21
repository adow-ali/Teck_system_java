import java.util.Scanner;
public class myPracticeExercise {
	
	public static void main(String[] args) {
	// creates an object of Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
	// read input (line of text) from the keyboard
	String name = input.nextLine ();
//prints the name
	System.out.println("My name is '" +  name);
// close the scanner
	input.close();
	}

}
