package ListsAndArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListsAndArrays {

	public static void main(String[] args) {
//    List<Integer> myNumberList;
	int sum = 0;	
   ArrayList<Integer> myList = new ArrayList<Integer>();
   // This loop is adding 1-10 to the list
   for (int i = 0; i <10; i++) {
	   myList.add(i);
   }
//    System.out.println(myList.indexOf(50));
//    System.out.println(myList.contains(80));
//    System.out.println(myList.indexOf(180));
//    boolean success = myList.remove((Integer)80);
//    System.out.println(success);
//    success = myList.remove((Integer)180);
//    System.out.println(success);
//    
//    System.out.println(myList.indexOf(80));
   
   // taking in the myList and adding values
	for(Integer i : myList) {
		// adding the values of the list
	//	sum = sum + i;
		sum+=i;
		
	}
	System.out.println("my sum: " + sum);
	// Java collection classes slide 22...
	myList.sort((x,y) -> x.compareTo(y)); 
	List<Double> ListOfDoubles = Arrays.asList(2.0,2.7,6.0,3.0);
	System.out.println(ListOfDoubles.getClass().getName());
	
	List<String> str = new ArrayList<>();
	str.add("a string");
	System.out.println(str.get(0));
	
	}
}
