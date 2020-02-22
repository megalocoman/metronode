package battlegame;
// crea barcos, sus atributos y metodos
 class Barcos {
	// tamaño
	public static int largobarco;
	public static char tipo; // w for water or s for ship
	
	public Barcos(int largo, char tipo ) {
		this.largobarco = largo;
		this.tipo =tipo;
	} 
	// setter
	public void setLargo(int nuevolargo) {
		this.largobarco = nuevolargo;
	}
	public static int getLargo() {
		return largobarco;
	}	
}
 
 class ParteBarco extends Barcos{
	 int horizontal;
	 int vertical;
	public ParteBarco( int i, int j ) {
		super(getLargo());	
		this.horizontal= i;
		this.vertical = j;
	}
	public void setHorizontal(int nuevoHorizontal) {
		this.horizontal = nuevoHorizontal;
	}
	
	public int getHorizontal() {
		return horizontal;
	}
	public void setVertical(int nuevoVertical) {
		this.vertical = nuevoVertical;
	}
	
	public int getVertical() {
		return vertical;
	}
	// method which count how many sahipo part left
		
	public void setLargopropio(int nuevolargo) {
		super.largobarco = nuevolargo;
	}	
}
