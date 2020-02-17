package metroNodes;

import java.util.ArrayList;
import java.util.Collections;

public class Insideline {
	
	int a;
	int b;
	int c;
	public  ArrayList<String> FindStastion(Integer inline, Integer stin, Integer stfin , ArrayList<ArrayList<String>> line ){
		ArrayList<String> stations = new ArrayList<String>();
		a = inline.intValue();
		b = stin.intValue();
		c = stfin.intValue();
		if (c>b) {
			for(int i =b; i<=c; i++) {
				stations.add(line.get(a).get(i));		
			} 
			
		}else {
			for(int i =b; i>=c; i--) {
				stations.add(line.get(a).get(i));
			}
//			Collections.reverse(stations);
		}
		return stations;		
	}
	
}
