package more_excersice;
import java.util.*;
public class ExceptTry {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean salir = true;
//		int i;
		int count = 0;
		
		do {
		
		try {
			salir = false;
			System.out.println("input a character");
			int i = keyboard.nextInt();
            System.out.println(i + " is a valid integer number"); 
           
		
		}catch(Exception  e){
			System.out.println( " is not a valid integer number"); 
			
			
			 count++;
			 salir = true;
		}
		
		}while(!salir );
	}
		
}
