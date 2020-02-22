package execute;
import poo.*;
public class MainExecute {
public float caca;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediosdeTransporte m1 = new MediosdeTransporte(200, 25, 5, 250);
		System.out.println(m1.getCapacidadPasajero());
		MediosdeTransporte m2 = new MediosdeTransporte();
		m2.setKilometrosporLitro(200);
		System.out.println(m2.getKilometrosporLitro());
		
		Elefante dumbo = new Elefante(10, 10, 10, 10, 10);
		System.out.print(dumbo.getVelocidadMaxima());
		
	
		
		
		
		
		
		
		

	}

}
