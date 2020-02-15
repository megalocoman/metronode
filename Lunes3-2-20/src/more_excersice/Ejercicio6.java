package more_excersice;
import java.util.Scanner;
public class Ejercicio6 {
	static String clue;
//	public static void main(String[] args) {
	public static void metodo6() {
		int count =0;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("ingresa un nombre, que empieze con j");
			 clue =  keyboard.nextLine();
			 ++ count;
		}while(!clue.equalsIgnoreCase("juan"));
		System.out.println("adivinazte el nombre");
		System.out.println("numero de intentos:" + count);
	}
}
