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
		
		ArrayList<ArrayList<String>> combnekwork =
				new ArrayList<ArrayList<String>>();
		
// call whole metro network	
		Combination obj1 = new Combination();
		network = obj1.network();
//		network.forEach(a ->{
//			System.out.println(a);
//		});
		combnekwork = obj1.CombNetwork();
		combnekwork.forEach(a ->{
			System.out.println(a);
		});
		
		
//		String ast= "zapadores";
//		String tst= "lo ovalle";
//		
//		Station obj2 = new Station();
//		Station obj3 = new Station();
//		coordini = obj2.findCoord(network, ast);
//		coordfin = obj3.findCoord(network, tst);
//		
//		System.out.println(coordini);
//		System.out.println(coordfin);
//		
//		if (coordini.get(0)==coordfin.get(0)) {
//			Insideline obj4 = new Insideline();
//			stationtravelled = obj4.FindStastion(coordini.get(0), coordini.get(1), coordfin.get(1), network );
//		}
//
//		System.out.println(stationtravelled);
	
	}
}
