package more_excersice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuFinal {
	
	 
	 
	 
	    public static void main(String[] args) {
	 
	        Scanner keyboard = new Scanner(System.in);
	        boolean salir = true;
	        int option; //Guardaremos la opcion del usuario
	 

	        while( salir) {
//	    		
	    		try {
	    			System.out.println("selecione una opcion.");
	    			option = keyboard.nextInt();

	    						
	    			
	    			switch(option) {
	    		
	    			case 2:
	    				System.out.println("menu 2/3");
	    				Ejercicio2 llamada2 = new Ejercicio2();
	    				llamada2.metodo2();
	    				break;
	    			case 3:
	    				System.out.println("menu 2/3");
	    				Ejercicio2 llamada3 = new Ejercicio2();
	    				llamada3.metodo2();
	    				break;
	    						
	    			case 4:
	    				System.out.println("menu 4");
	    				Ejercicio4 llamada4 = new Ejercicio4();
	    				llamada4.metodo4();
	    				break;
	    						
	    			case 5:
	    				System.out.println("menu 5");
	    				Ejercicio5 llamada5 = new Ejercicio5();
	    				llamada5.metodo5();
	    				break;
	    				
	    			case 6:
	    				System.out.println("menu 6");
	    				Ejercicio6 llamada6 = new Ejercicio6();
	    				llamada6.metodo6();
	    				break;
	    				
	    			case 7:
	    				System.out.println("menu 7");
	    				Ejercicio7 llamada7 = new Ejercicio7();
	    				llamada7.metodo7();
	    				break;
	    				
	    			case 8:
	    				System.out.println("menu 8");
	    				Ejercicio8 llamada8 = new Ejercicio8();
	    				llamada8.metodo8();
	    				break;
	    			case 9:
	    				System.out.println("menu 9");
	    				Ejercicio9 llamada9 = new Ejercicio9();
	    				llamada9.metodo9();
	    				break;
	    			case 0:
	    				System.out.println("salio del menu");
	    				break;
	    			default:
	    				System.out.println("opcion invalida");
	    			}
	    		
	    		if (option ==10) {
	    			salir = false;
	    		}
	    			
	    		
	           
	  
	        
	    		}catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	             

	    		}
	    		
	        }
	        
	        
	        
	    }
	    	
}   
	    

