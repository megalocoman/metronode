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
		
		sodokuarray[0][0]= 5;
		sodokuarray[0][1]= 3;
		sodokuarray[0][5]= 7;
		sodokuarray[1][0]= 6;
		sodokuarray[1][3]= 1;
		sodokuarray[1][4]= 9;
		sodokuarray[1][5]= 5;
		sodokuarray[2][1]= 9;
		sodokuarray[2][2]= 8;
		sodokuarray[2][7]= 6;
		sodokuarray[3][0]= 8;
		sodokuarray[3][4]= 6;
		sodokuarray[3][8]= 3;
		sodokuarray[4][0]= 4;
		sodokuarray[4][3]= 8;
		sodokuarray[4][5]= 3;
		sodokuarray[4][8]= 6;
		sodokuarray[5][0]= 7;
		sodokuarray[5][4]= 2;
		sodokuarray[5][8]= 6;
		sodokuarray[6][1]= 6;
		sodokuarray[6][6]= 2;
		sodokuarray[6][7]= 8;
		sodokuarray[7][3]= 4;
		sodokuarray[7][4]= 1;
		sodokuarray[7][5]= 9;
		sodokuarray[7][8]= 5;
		sodokuarray[8][4]= 8;
		sodokuarray[8][7]= 7;
		sodokuarray[8][8]= 9;
		
		
		
		
		for(int k =0;k<9; k++) {
			for( int l=0; l<9; l++) {
				if (!(sodokuarray[k][l]<1
						)&&!(sodokuarray[k][l]>9) ) {
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
						vertical  = obj1.revisaVertical(sodokuarray, k, numerosodoku);
						System.out.println(vertical);
						cuadrado = obj1.revisaCuadrado(sodokuarray, k, l, numerosodoku);
						System.out.println(cuadrado);
					}while(!(vertical && horizontal && cuadrado));	
				}
			
				System.out.println(k);
				sodokuarray[l][k] = numerosodoku;
				
				for(int m =0;m<9; m++) {
					for(int n=0; n<9; n++) {
						System.out.print(sodokuarray[n][m]);
						System.out.print(" ");
					}
					System.out.println("");
				}
		
			}
			
		}
	}	
}		
	


