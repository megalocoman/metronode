package metroNodes;
import java.util.*;
public class Arraylist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> coordini; // coordeniate of station initial 
		ArrayList<Integer> coordfin; // coordeniate of station final
		ArrayList<ArrayList<String>> network =
				new ArrayList<ArrayList<String>>();
		
		ArrayList<String> linea = new ArrayList<String>();
		linea.add("1");
		linea.add("a");
		linea.add("b");
		linea.add("c");
		linea.add("d");
		linea.add("e");
//		System.out.println(linea);
		
		ArrayList<String> lineb = new ArrayList<String>();
		lineb.add("2");
		lineb.add("f");
		lineb.add("g");
		lineb.add("c");
		lineb.add("h");
		lineb.add("i");
//		System.out.println(lineb);
		
		
		
		network.add(linea);
		network.add(lineb);
		System.out.println(network);
		
		String ast= "c";
		String tst= "i";
//		
		Station obj1 = new Station();
		Station obj2 = new Station();
		coordini = obj1.findCoord(network, ast);
		coordfin = obj2.findCoord(network, tst);
		
		System.out.println(coordini);
		System.out.println(coordfin);

		
		
		
		
		
	}

}
