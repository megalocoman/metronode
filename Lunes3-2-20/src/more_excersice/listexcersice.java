package more_excersice;
import java.util.*;
public class listexcersice {

	public static void main(String[] args) {
		
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("gato");
		listStrings.add("pollo");
		listStrings.add("raton");
		listStrings.add("perro");
		
		System.out.println(listStrings);
		System.out.println(listStrings.getFirst());
		System.out.println(listStrings.getLast());
	}

}
