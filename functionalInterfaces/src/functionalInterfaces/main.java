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
		
//		StringJoiner joinNames = new StringJoiner(",","[","]");
//		
//		// The add method from the StringJoiner 
//		joinNames.add("Erik");
//		joinNames.add("Brook");
//		joinNames.add("Yusuf");
//		joinNames.add("Sara");
//		
//		
//		StringJoiner joinName2 = new StringJoiner("-","(",")");
//		joinName2.add("Joe");
//		joinName2.add("Dana");
//		
//		
//		StringJoiner m = joinName2.merge(joinNames);
//		
//		System.out.println(m);
//		
//		StringBuffer sb = new StringBuffer("Core Java ");
//		sb.append("True");
//		sb.insert(3, "false");
//		sb.replace(0, 1, "jav");
//		sb.delete(0, 4);
//		sb.reverse();
//		System.out.println(sb);
		
//		AddMethod me = new AddMethod();
//		String say = "Hello";
//		
//		AddMethod me =()->{
//			System.out.println(say);
//		};
//		
//		me.msg();
		
		
		// with the method code block
//		AddMethod addOne = (a,b)->{
//			System.out.println(a+b);
//		};
//		
//		addOne.add(35, 25);
		
		
		// make it one line
//		AddMethod addOne = (a,b)->(a+b);
//			System.out.println(addOne.add(10, 40));
////			
////		lambda expression
////		(prams) ->{
//			code block
//	        }
//	        
//	        List<String> listOne = new ArrayList<>();
//	        listOne.add("Erik");
//	        listOne.add("Brook");
//	        listOne.add("Yusuf");
//	        listOne.add("Sara");
//	        
//	        listOne.forEach((n)-> System.out.println(n));
	       
	// New thread() -> start run()
		
		RunnablemyDemo runOne = new RunnablemyDemo("Thread-");
		runOne.start();
		RunnablemyDemo runTwo = new RunnablemyDemo("Thread-");
		runTwo.start();

}

//	@Override
//	public void msg(String msg) {
//		System.out.println("Hello ");
//		
//	}
}
