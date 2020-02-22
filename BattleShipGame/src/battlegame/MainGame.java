package battlegame;

public class MainGame {
int largo;
	public static void main(String[] args) {
		Barcos veleta = new Barcos(3); 
		System.out.println(veleta.getLargo());
//		veleta.setLargo(2);
//		System.out.println(veleta.getLargo());
		Barcos proa = new ParteBarco( 0, 0);
		Barcos medio = new ParteBarco( 1, 0);
		Barcos popa = new ParteBarco( 2, 0);
		
		System.out.println("numero original");
		System.out.println(proa.getLargo());
		System.out.println(medio.getLargo());
		System.out.println(popa.getLargo());
		
		System.out.println("saco uno superclase.");
		
		proa.setLargo(2);
		System.out.println(proa.getLargo());
		System.out.println(medio.getLargo());
		System.out.println(popa.getLargo());
		System.out.println(veleta.getLargo());
	}

}
