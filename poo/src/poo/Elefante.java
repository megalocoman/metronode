package poo;

public class Elefante extends MediosdeTransporte {
			
		public float poo;

		public float getPoo() {
			return poo;
		}

		public void setPoo(float poo) {
			this.poo = poo;
		}

		public Elefante(float velocidadMaxima, float kilometrosporLitro, int capacidadPasajero, float autonomia,
				float poo) {
			super(velocidadMaxima, kilometrosporLitro, capacidadPasajero, autonomia);
			this.poo = poo;
		}
		
	}


