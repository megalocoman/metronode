package metroNodes;
import java.util.ArrayList;
import java.util.List;
public class PrincipalExecMetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stationfirst;
		String stationtarget;
		int sumst= 0;
		
		stationtarget = "a";
		stationfirst = "i";
//		
//		String arr1[][]= {{"a","1", null}, {"b", "1", null}, {"e", "1", "2" }, {"f", "1", null}, {"i", "1", null} };
//		String arr2[][]= {{"c","2", null}, {"d", "2", null}, {"e", "2", "1"}, {"g", "2",null }, {"h", "2", null}};
//		
		String arr1[]= {"a", "b", "e" , "f", "i" };
//							{"c", "d", "e", "g" , "h"}};
		
		
		try {
			for (int i =0; i<5; i++) {
				if (arr1[i].equals(stationfirst)) {
					while(i<5) {
						++sumst;
						++i;
					
						if (arr1[i].equals(stationtarget)) {;
						break;
						}
					}
				}
				
			}
			System.out.println(sumst);
		}catch(Exception e){
			sumst =0;
			for (int i =4; i>=0; i--) {
				
				if (arr1[i].equals(stationfirst)) {
					while(i>=0) {
						++sumst;
						--i;
						if (arr1[i].equals(stationtarget)) {;
						break;
						}
					}
				}
			}
			System.out.println(sumst);
		}
		

	
	}	
}