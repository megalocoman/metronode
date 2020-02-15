package more_excersice;
import java.util.Scanner;
public class Ejercicio5 {
//	public static void main(String[] args) {
	public static void metodo5() {
		int count =0;
		int acum =0;
		int number =0;
		boolean salir = true;
		Scanner keyboard = new Scanner(System.in);
		

		
		while( salir) {
			System.out.println("ingrese numero entero, si quiere salir, ingrese 0.");
			number = keyboard.nextInt();
			if (number ==0) {
				salir = false;
			}
			else {
				acum= acum+number;
			++count;
			}
			
		}
		
		if (count == 0) {
			System.out.println("no hay promedio.");
		}
		else {
			System.out.println("el promedio es "+ (acum/count));
		}
		
//		System.out.println(count);
		
		
	}
	

}
