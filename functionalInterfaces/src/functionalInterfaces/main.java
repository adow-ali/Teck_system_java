package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@FunctionalInterface
interface AddMethod{
//public void msg();
public int add(int a, int b);
}



public class main{

	public static void main(String[] args) {
		// functional programming 1 slide 3 - 6
		
		// stringJoiner 
		
		StringJoiner joinNames = new StringJoiner(",","[","]");
		
	// The add method from the StringJoiner 
	joinNames.add("Erik");
	joinNames.add("Brook");

		
		RunnablemyDemo runOne = new RunnablemyDemo("Thread-");
		runOne.start();
		RunnablemyDemo runTwo = new RunnablemyDemo("Thread-");
		runTwo.start();

	Sender send = new Sender();
	SendingThread sendOne = new SendingThread("Thread 1 sending"  , send);
	SendingThread sendTwo = new SendingThread("Thread 2 sending", send);
	
	sendOne.run();
	sendTwo.run();

	}
}
//	@Override
//	public void msg(String msg) {
//		System.out.println("Hello ");
//	}	
//	}

//}