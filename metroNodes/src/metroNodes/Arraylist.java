package metroNodes;
import java.util.*;
public class Arraylist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> coordini; // coordeniate of station initial 
		ArrayList<Integer> coordfin; // coordeniate of station final
		ArrayList<ArrayList<String>> network =
				new ArrayList<ArrayList<String>>();
		ArrayList<String> stationtravelled = null;
		
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
		
		ArrayList<ArrayList<String>> combinationlist = new ArrayList<ArrayList<String>>();
		ArrayList<String> comb1 = new ArrayList<String>();
		comb1.add("c");
		comb1.add("1");
		comb1.add("2");
		
		ArrayList<String> comb2 = new ArrayList<String>();
		comb2.add("c");
		comb2.add("2");
		comb2.add("1");
		
		network.add(linea);
		network.add(lineb);
		System.out.println(network);
		
		String ast= "c";
		String tst= "a";
//		
		Station obj1 = new Station();
		Station obj2 = new Station();
		coordini = obj1.findCoord(network, ast);
		coordfin = obj2.findCoord(network, tst);
		
		System.out.println(coordini);
		System.out.println(coordfin);
		
		if (coordini.get(0)==coordfin.get(0)) {
			Insideline obj3 = new Insideline();

			stationtravelled = obj3.FindStastion(coordini.get(0), coordini.get(1), coordfin.get(1), network );
		}


		System.out.println(stationtravelled);
	
	}
}
