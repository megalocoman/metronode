package trabajoRut;
import java.util.Scanner; 

public class TrabajoRut {

	public  static void main(String args[]) {
		// without verificator 
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese rut, sin punto ni guiones:");
		String rut_completo = input.next();
		System.out.println(rut_completo);
		System.out.println("________________________");
		
		String RUTsinver = rut_completo.substring(0, rut_completo.length()-1);
		System.out.println(RUTsinver);
		System.out.println("verify number");
		String RUTver = rut_completo.substring(rut_completo.length()-1, rut_completo.length());
		System.out.println(RUTver);
		
		
		
		
		int rut = 15891102;
		
		// sum RUT
		int acum =0;
		int multiplicador=2;
		while (rut > 0) {
			int rest_rut = rut %10;
			rut = rut/10;
			System.out.println(multiplicador);
			
			acum = acum +rest_rut*multiplicador;
			++multiplicador;
			if (multiplicador>7) {
				multiplicador= 2;
			}
			
			System.out.println(rut);
			System.out.println(rest_rut);
			
			System.out.println("********");
		}
		
		System.out.println("total");
		System.out.println(acum);
		
//		// verification number step by step
//		int veri_one = acum / 11;
//		System.out.println("div by 11");
//		System.out.println(veri_one);
//		int veri_two = veri_one*11;
//		
//		System.out.println("multi by 11");
//		System.out.println(veri_two);
//		
//		int dif = acum - veri_two;
//		System.out.println("difference between both numers");
//		System.out.println(dif);
//		
//		int veri_num= 11-dif;
//		System.out.println("verificator number");
//		System.out.println(veri_num);
		
//		int veri_one = acum / 11;
//		System.out.println("div by 11");
//		System.out.println(veri_one);
//		int veri_two =( acum / 11)*11;
//		
//		System.out.println("multi by 11");
//		System.out.println(veri_two);
//		
//		int dif = acum - (( acum / 11)*11) ;
//		System.out.println("difference between both numers");
//		System.out.println(dif);
		
		//verification one step
		int veri_num= 11-(acum - (( acum / 11)*11)) ;
		System.out.println("verificator number");
		System.out.println(veri_num);
	}
	
		
	
}
