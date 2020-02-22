package poo;

public class MediosdeTransporte {

	private float velocidadMaxima;	
	private float kilometrosporLitro;
	
	private int capacidadPasajero;
	private float autonomia;
	
	public MediosdeTransporte() {
		
	}
	
	public MediosdeTransporte(float velocidadMaxima, float kilometrosporLitro, int capacidadPasajero, float autonomia) {
		super();
		this.velocidadMaxima = velocidadMaxima;
		this.kilometrosporLitro = kilometrosporLitro;
		this.capacidadPasajero = capacidadPasajero;
		this.autonomia = autonomia;
	}
	
	public void avanzar() {
		System.out.println("Estoy avanzado...");
	}
	public void frenar() {
		System.out.println("Estoy deteniendome...");
	}
	public void chocar() {
		System.out.println("crashhhhh");
	}
	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}
	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public float getKilometrosporLitro() {
		return kilometrosporLitro;
	}
	public void setKilometrosporLitro(float kilometrosporLitro) {
		this.kilometrosporLitro = kilometrosporLitro;
	}


	
}
