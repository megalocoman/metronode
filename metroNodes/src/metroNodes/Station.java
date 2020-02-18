package metroNodes;

import java.util.ArrayList;

public class Station {
	int sumst;
	int index_fst; // index of initial station in the line
	int index_fline; // index of line
	ArrayList<Integer> station = new ArrayList<Integer>();	
	
	
	public  ArrayList<Integer> findCoord( ArrayList<ArrayList<String>> network, String st 	) {
		
		for (Integer i= 0; i< network.size(); ++i ) {
			if (network.get(i).indexOf(st) == -1) {
				continue;
			}else{
				index_fst= Integer.valueOf(network.get(i).indexOf(st));
				index_fline = i;
				break;
			}				
		}	
	station.add(index_fline);
	station.add(Integer.valueOf(index_fst));
	
	return station;		
	}
}
