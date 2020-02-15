package more_excersice;
import java.util.Scanner; 
public class Ejercicio2 {
//	public static void main(String args[]){
	public static void metodo2(){
//		String nombre = "juan"
		// input name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("ingrese su nombre");
		String nombre = keyboard.next();
		System.out.println("ingrese su sexo");
		String sexo = keyboard.next();
		System.out.println("ingrese que servicio desea");
		String servicio = keyboard.next();

		
		if (sexo.equals( "hombre")) {
			System.out.println(nombre + "El banos esta al fondo a la izquierda.");
		}
		else if (sexo.equals("mujer") ) {
			System.out.println(nombre +  "El banos esta al fondo a la izquierda.");
		}
		else {
			System.out.println("opcion invalida");
		}
			
		if(servicio.equals("bano")) {
			System.out.println(" el valor del servicio es $250.");
		}
		else if(servicio.equals("ducha")) {
			System.out.println(" el valor del servicio es $2500.");
		}
		else {
			System.out.println("opcion invalida");
		}
	}
}