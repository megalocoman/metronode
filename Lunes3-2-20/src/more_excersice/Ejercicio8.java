package more_excersice;

import java.util.Scanner;

public class Ejercicio8 {
//	public static void main(String[] args) {
	public static void metodo8() {
		String[] names = new String[100];
		Scanner keyboard = new Scanner(System.in);
//		int number=7;
		System.out.println("ingrese el numero de alumnos: ");
		int number = keyboard.nextInt();
		
		
		for( int i=0; i<number; ++i) {
			System.out.println("ingrese nombre alumno ");
			names[i] = keyboard.next();	
		}

		for (int j=0; j<number; ++j) {
			System.out.print(names[j]);
			if((j+1)%5!=0  && j<(number-1)) {
				System.out.print(" - ");
			}
			
			if((j+1)%5==0) {
				System.out.println(" ");
			}
			
		}


	}
}
