import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese largo: ");
		int largo=entrada.nextInt();
		
		int[] paraOrdenar= new int[largo];
		for (int i = 0 ; i< paraOrdenar.length; i++){
			System.out.println("ingresa numero: ");
			paraOrdenar[i] = entrada.nextInt();
		}
			
		for (int i = 0; i < paraOrdenar.length; i++) {
				System.out.println("[" + paraOrdenar[i] + "]");
			}
		
		int auxiliar = 0;
		for (int i = 0; i < paraOrdenar.length; i++) {
			for (int j = 0; j < paraOrdenar.length; j++) {
				if (paraOrdenar[i]<paraOrdenar[j]) {
				auxiliar = paraOrdenar[i];
				paraOrdenar[i] = paraOrdenar[j];
				paraOrdenar[j] = auxiliar;
				}
			}
		}
		
		System.out.println("");
		for (int i = 0; i < paraOrdenar.length; i++) {
			System.out.print("[" + paraOrdenar[i] + "]");
		}
	}

}
