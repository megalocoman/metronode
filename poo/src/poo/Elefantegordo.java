package poo;

public class Elefantegordo extends MediosdeTransporte {
			
		public float poo;

		public float getPoo() {
			return poo;
		}

		public void setPoo(float poo) {
			this.poo = poo;
		}

		public Elefantegordo(float velocidadMaxima, float kilometrosporLitro, int capacidadPasajero, float autonomia,
				float poo) {
			super(velocidadMaxima, kilometrosporLitro, capacidadPasajero, autonomia);
			this.poo = poo;
		}
		
	}


