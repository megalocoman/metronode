package sodokuAutomatic;

public class MainSodoku {
	// busca horizontal
	public boolean revisaHorizontal(int array[][], int hori,  int numero ) {
		boolean existe = true;
		for(int i = 0; i<=9; i++) {
			if (numero == array[hori][i]) {
				existe = false; 
				break;
			}	
		}
		return existe;
	}
	// busca vertical
	public boolean revisaVertical(int array[][], int vert,  int numero) {
		boolean existe = true;
		for(int i = 0; i<=9; i++) {
			if(numero==array[i][vert]) {
				existe = false;
				break;
			}
		}
		return existe ;
	}
	// buscar cuadrado
	public boolean revisaCuadrado(int array[][], int vert, int hori, int numero) {
		boolean existe = true;
		// determina rangos de cuadrado para vertical
		if (vert>=0 && vert<=2) {
			vert= 0;
		}
		else if(vert>=3 && vert<=5) {
			vert= 3;
		}
		else if(vert>=6 && vert<=8) {
			vert= 6;
		}
		// determina rangos de cuadrado para vertical
		if (hori>=0 && hori<=2) {
			hori= 0;
		}
		else if(hori>=3 && hori<=5) {
			hori= 3;
		}
		else if(hori>=6 && hori<=8) {
			hori= 6;
		}
		for(int i = hori; i<=(hori+3); i++) {
			for(int j =vert; j<=(vert+3); j++ ) {
				if(numero==array[i][j]) {
					existe = false;
					break;
				}
			}
		}
		return existe;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sodokuarray[][]= new int[8][8];
		
		// suma las horizontales
		
		
		//suma las verticales
		
		//suma las el cuadradito
		
		
		
	}

}
