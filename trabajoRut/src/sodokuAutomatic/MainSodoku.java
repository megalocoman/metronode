package sodokuAutomatic;

import java.util.Scanner;

public class MainSodoku {
	// busca horizontal
	public  boolean revisaHorizontal(int array[][], int hori,  int numero ) {
		boolean existe = true;
		for(int i = 0; i<array.length; i++) {
			if (numero == array[hori][i]) {
				existe = false; 
				break;
			}	
		}
		return existe;
	}
	// busca vertical
	public  boolean revisaVertical(int array[][], int vert,  int numero) {
		boolean existe = true;
		for(int i = 0; i<array.length; i++) {
			if(numero==array[i][vert]) {
				existe = false;
				break;
			}
		}
		return existe ;
	}
	// buscar cuadrado
	public  boolean revisaCuadrado(int array[][], int vert, int hori, int numero) {
		boolean existe = true;
		// determina rangos de cuadrado para vertical
		if (vert>=0 && vert<3) {
			vert= 0;
		}
		else if(vert>=3 && vert<6) {
			vert= 3;
		}
		else {
			vert= 6;
		}
		// determina rangos de cuadrado para vertical
		if (hori>=0 && hori<3) {
			hori= 0;
		}
		else if(hori>=3 && hori<6) {
			hori= 3;
		}
		else {
			hori= 6;
		}
		for(int i = hori; i<(hori+3); i++) {
//			System.out.print(i);
			for(int j =vert; j<(vert+3); j++ ) {	
				System.out.print(j);
				if(numero==array[i][j]) {
					existe = false;
					break;
				}
			}
		}
		return existe;
	}

	public static void main(String[] args) {
		
		int[][] sodokuarray= new int[9][9];
		Scanner keyboard = new Scanner(System.in);
		int numerosodoku;
		boolean vertical;
		boolean horizontal;
		boolean cuadrado;
		
	
		
		//hvjhvjh
		
		for(int k =0;k<9; k++) {
			for( int l=0; l<9; l++) {
				if (sodokuarray[k][l]!=0) {
					break;
				}else {
					
					do {
						System.out.println("coordenadas numero vertical"+(k+1)+" horizontal  "+(l+1) );
						System.out.println("ingrese un numero entre el uno y nueve: ");
						numerosodoku = keyboard.nextInt();
							
						while(!(numerosodoku> 0 && numerosodoku<=9)) {
							System.out.println("ingrese un numero en el rango indicado.");
							numerosodoku = keyboard.nextInt();						
						}
						
						MainSodoku obj1 = new MainSodoku();
						horizontal = obj1.revisaHorizontal(sodokuarray, l,numerosodoku );
						System.out.println(horizontal);
						MainSodoku obj2 = new MainSodoku();
						vertical  = obj2.revisaVertical(sodokuarray, k, numerosodoku);
						System.out.println(vertical);
						MainSodoku obj3 = new MainSodoku();
						cuadrado = obj3.revisaCuadrado(sodokuarray, l, k, numerosodoku);
						System.out.println(cuadrado);
					}while(!(vertical && horizontal && cuadrado));	
				}
			
				System.out.println(k);
				sodokuarray[k][l] = numerosodoku;
				
				for(int m =0;m<9; m++) {
					for(int n=0; n<9; n++) {
						System.out.print(sodokuarray[m][n ]);
						System.out.print(" ");
					}
					System.out.println("");
				}
		
			}
			
		}
	}	
}		
	


