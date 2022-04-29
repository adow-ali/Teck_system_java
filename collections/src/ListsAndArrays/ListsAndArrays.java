package ListsAndArrays;

import java.time.DayOfWeek;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EnumMap;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;

import java.util.*;

public class ListsAndArrays {

	private static ArrayList<Integer> setHashList;

	public static void main(String[] args) {
//    List<Integer> myNumberList;
		int sum = 0;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		// This loop is adding 1-10 to the list
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}
		System.out.println(myList.indexOf(50));
		System.out.println(myList.contains(80));
		System.out.println(myList.indexOf(180));
		boolean success = myList.remove((Integer) 80);
		System.out.println(success);
		success = myList.remove((Integer) 180);
		System.out.println(success);
		System.out.println(myList.indexOf(80));

		// taking in the myList and adding values
		for (Integer i : myList) {
			// adding the values of the list
			// sum = sum + i;
			sum += i;

		}
		System.out.println("my sum: " + sum);
		// Java collection classes slide 22...
		myList.sort((x, y) -> x.compareTo(y));
		List<Double> ListOfDoubles = Arrays.asList(2.0, 2.7, 6.0, 3.0);
		System.out.println(ListOfDoubles.getClass().getName());

		List<String> str = new ArrayList<>();
		str.add("a string");
		System.out.println(str.get(0));
		// Collections
		// More others
		LinkedList<Integer>LinkOne = new LinkedList<Integer>();
		System.out.println(LinkOne.add(23));
//		LinkOne.add(23);
//		LinkOne.add(12);
//		LinkOne.add(4,56);
//		LinkOne.get(4);
//		LinkOne.set(0,98);
//		LinkOne.indexOf(12);
//		LinkOne.remove(3);
//		LinkOne.size();
		LinkOne.contains(34);
		
		// key, value pairs
		// id, employee
		
	//	Map slide 48
//		EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
//		map.put(DayOfWeek.FRIDAY, 23);
//		
//		HashMap<Integer, String> cars = new HashMap<>();
//		cars.containsKey(cars);

        HashSet<String> setHashList = new HashSet<String>();
        setHashList.add("one");
        setHashList.add("Two");
        setHashList.add("Adow");
        setHashList.add("Asha");
        setHashList.add("Two");
        Iterator<String>itr=setHashList.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        	
        }
        
	}
}
