package more_excersice;
import java.util.Scanner;
public class Ejercicio4 {

//	public static void main(String[] args) {
	public static void metodo4() {
		// TODO Auto-generated method stub
		String[] num = new String[] {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
//		for(int i=0; i< num.length; i++) {
//			System.out.println(num[i]);
//		}
//		System.out.println(num.length);
		
	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("ingrese un numero entre el uno y diez");
		int inde = keyboard.nextInt();
		System.out.println(num[inde-1]);
					
		
	}

}
