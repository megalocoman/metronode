package more_excersice;
import java.util.Scanner;
public class Ejercicio9 {
	
//	public static void main(String[] args) {
	public static void metodo9() {
		Scanner keyboard = new Scanner(System.in);
		String[] label = {"nombre", "apellido", "telefono", "email"};
		String[][] student= new String[5][4];
		String item;
		for(int i =0; i<5; ++i) {
			for(int j=0; j<4; ++j) {
				System.out.println(" ingrese "+ label[j]);
				item =keyboard.nextLine();
				student[i][j]= item;
			}
		}
		for(int i =0; i<5; ++i) {
			System.out.print("alumno "+ (i+1)+": ");
			for(int j=0; j<4; ++j) {
				System.out.print(label[j]+": ");
				System.out.print(student[i][j]);
				if( j<3) {
					System.out.print(" - ");
					
				}
			}
			System.out.println(' ');
	}
	

}}
