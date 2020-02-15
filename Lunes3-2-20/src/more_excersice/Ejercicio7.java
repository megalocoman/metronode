package more_excersice;
import java.util.*;
/**
*
* @author Cristian Jofre
*@since 07/02/20
* @version 1.0 
*/
public class Ejercicio7 {
	/**
	 * prueba I: ejercicio 7.
	 * funcion: ingresa diez palabras 
	 * indicando la cantidad de veces que estan repetidas
	 * y tambien indica si estas no se repiten
	 * @author Cristian Jofre
	 * @version 1.0 0/2/20
	 * 
	 */
	
	public static void main(String[] args) {
//	public static void metodo7() {
		
		/*
		 * definicion de variables
		 */
		
		Scanner keyboard = new Scanner(System.in); /* ingreso de teclado*/
		List<String> listname =  new ArrayList<String>(); /*lista de nombre*/
		String name; /* nombres a comparar*/
		
		int number = 10; /*  numero de nombres a comparar,  no se debe cambiar */
		
		String repetead= "";

		
		/*
		 * ingresa los nombres a la lista
		 */
		
		for(int i= 0; i<10; i++) {
			System.out.println("ingrese un nombre: ");
			name = keyboard.nextLine();
			listname.add(name);
		}
		
		/*
		 * ordena la lista para poder contarla
		
		 */
		Collections.sort(listname); 
		System.out.println(listname);
		
		
		/*
		 * bloque que cuenta cada nombre comparado con la lista 
		 * sumando la cantidad repetida y  si el elemento no se repite
		 * imprimiendo los resultados
		 */
		
		for (int j = 0; j<10; j++ ) {
			if (listname.get(j).equals(repetead)) {
				continue;
			}
			else {
				int count = 0;
				
				for(int k = 0; k<10; k++) {
					if (listname.get(j).equals(listname.get(k))){
						count++;
					}
				
				}
				if(count>1) {
					System.out.println(listname.get(j)+ " se repite "+count+ " veces." );
					
				}
				else {
					System.out.println(listname.get(j)+ " no se repite");
				}
				
				repetead = listname.get(j);
			}
			 

		}
			
				
	}
	
}
