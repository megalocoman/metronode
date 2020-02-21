package battlegame;
// crea barcos, sus atributos y metodos
 class Barcos {
	// tamaño
	public int largobarco;
	
	public Barcos(int largo) {
		this.largobarco = largo;
	} 
	// setter
	public void setLargo(int nuevolargo) {
		this.largobarco = nuevolargo;
	}
	public int getLargo() {
		return largobarco;
	}	
}
 
 class ParteBarco extends Barcos{
	 int horizontal;
	 int vertical;
	public ParteBarco(int largo, int i, int j ) {
		super(largo);	
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
		
	public void setLargopropio(int nuevolargo) {
		super.largobarco = nuevolargo;
	}	
}
