package metroNodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class List_practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> letterlist = new ArrayList<>();
		letterlist.add("a");
		letterlist.add("b");
		letterlist.add("c");
		letterlist.add("d");
		letterlist.add("e");
		letterlist.add("f");
		letterlist.add("g");
		
//		// print list of letter
//		System.out.println("the elements of the lsit are: "+letterlist);
//		
//		// remove 5th elements
//		
//		letterlist.remove(5);
//		System.out.println("the elements of the list less the 5th elements are: "+letterlist);
		
		// iterate through the list
//		System.out.println("=== Iterate using Java 8 forEach and lambda ===");
//		letterlist.forEach(a ->{
//			System.out.println(a);
//		});
//		
//		System.out.println("\n=== Iterate using an iterator() ===");
//		Iterator<String> iterletterlist = letterlist.iterator();
//		while(iterletterlist.hasNext()) {
//			String i = iterletterlist.next();
//			System.out.println(i);
//		}
//		
//		System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
//	
//		ListIterator<String> letteriter = letterlist.listIterator(letterlist.size());
//		while (letteriter.hasPrevious()) {
//			String a = letteriter.previous();
//			System.out.println(a);
//		}
//		
//		System.out.println("\n=== Iterate using simple for-each loop ===");
//		for(String a : letterlist) {
//			System.out.println(a);
//		}
		
		System.out.println("\n=== Iterate using for loop with index ===");
		for(int i=0; i<letterlist.size(); i++) {
			System.out.println(letterlist.get(i));
		}
		
		System.out.println("\n=== Iterate using for loop with index  backwards===");
		for(int i=(letterlist.size()-1); i>=0; i--) {
			System.out.println(letterlist.get(i));
		}
		
		// Check if an ArrayList contains a given element
		System.out.println("do the list has a \"n\"?");
		System.out.println(letterlist.contains("e"));
		
		// Find the index of the first occurrence of an element in an ArrayList
		System.out.println("Find the index of the first occurrence of an element in an ArrayList");
		System.out.println("indexOf \"e\" : "+letterlist.indexOf("e")); 
		
		
	}

}
