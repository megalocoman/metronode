package metroNodes;

import java.util.ArrayList;

public class Combination {
	ArrayList<ArrayList<String>> network = new ArrayList<ArrayList<String>>();
	public ArrayList<ArrayList<String>> network () {
		
		ArrayList<String> line1 = new ArrayList<String>();
		line1.add("san pablo");
		line1.add("neptuno");
		line1.add("pajaritos");
		line1.add("las rejas");
		line1.add("ecuador");
		line1.add("san alberto hurtado");
		line1.add("universidad de santiago");
		line1.add("estacion central");
		line1.add("union latinoamericana");
		line1.add("republica");
		line1.add("la moneda");
		line1.add("universidad de chile");
		line1.add("santa lucia");
		line1.add("universidad catolica");
		line1.add("baquedano");
		line1.add("salvador");
		line1.add("manuel montt");
		line1.add("pedro de valdivia");
		line1.add("los leones");
		line1.add("tobalaba");
		line1.add("el golf");
		line1.add("alcantara");
		line1.add("escuela militar");
		line1.add("manquehue");
		line1.add("hernando de magallanes");
		line1.add("los dominicos");
		
		ArrayList<String> line2 = new ArrayList<String>();
		line2.add("la cisterna");
		line2.add("el parron");
		line2.add("lo ovalle");
		line2.add("ciudad del niño");
		line2.add("departamental");
		line2.add("lo vial");
		line2.add("san miguel");
		line2.add("el llano");
		line2.add("franklin");
		line2.add("rondizzoni");
		line2.add("parque ohiggins");
		line2.add("toesca");
		line2.add("los heroes");
		line2.add("puente cal y canto");
		line2.add("patronato");
		line2.add("cerro blanco");
		line2.add("cementerios");
		line2.add("einstein");
		line2.add("dorsal");
		line2.add("zapadores");
		line2.add("vespicio norte");
		
		ArrayList<String> line3 = new ArrayList<String>();
		line3.add("los libertadores");
		line3.add("cardenal caro");
		line3.add("vivaceta");
		line3.add("vivaceta");
		line3.add("plaza chacabuco");
		line3.add("hospitales");
		line3.add("puente cal y canto");
		line3.add("plaza de armas");
		line3.add("universidad de chile");
		line3.add("parque almagro");
		line3.add("matta");
		line3.add("irarrazaval");
		line3.add("ñuñoa");
		line3.add("chile españa");
		line3.add("villa frei");
		line3.add("plaza egaña");
		line3.add("fernando castillo velasco");
		
		ArrayList<String> line4 = new ArrayList<String>();
		line4.add("tobalaba");
		line4.add("cristobal colon");
		line4.add("francisco bilbao");
		line4.add("principe de gales");
		line4.add("simon bolivar");
		line4.add("plaza egaña");
		line4.add("los orientales");
		line4.add("grecia");
		line4.add("los presidentes");
		line4.add("quilin");
		line4.add("las torres");
		line4.add("macul");
		line4.add("vicuña mackenna");
		line4.add("rojas magallanes");
		line4.add("trinidad");
		line4.add("san jose de la estrella");
		line4.add("los quillayes");
		line4.add("elisa correa");
		line4.add("hospital sotero del rio");
		line4.add("protectora de la infancia");
		line4.add("las mercedes");
		line4.add("plaza de puente alto");
		
		ArrayList<String> line5 = new ArrayList<String>();
		line5.add("plaza de maipu");
		line5.add("santiago bueras");
		line5.add("del sol");
		line5.add("monte tabor");
		line5.add("las parcelas");
		line5.add("laguna sur");
		line5.add("barrancas");
		line5.add("pudahuel");
		line5.add("lo prado");
		line5.add("blanqueado");
		line5.add("gruta de lourdes");
		line5.add("quinta normal");
		line5.add("cumming");
		line5.add("santa ana");
		line5.add("bellas artes");
		line5.add("baquedano");
		line5.add("parque bustamante");
		line5.add("santa isabel");
		line5.add("irarrazaval");
		line5.add("ñuble");
		line5.add("rodrigo de araya");
		line5.add("carlos valdovinos");
		line5.add("san joaquin");
		line5.add("pedrero");
		line5.add("mirador");
		line5.add("bellavista de la florida");
		line5.add("vicente valdes");
	
		ArrayList<String> line6 = new ArrayList<String>();
		line6.add("cerrillos");
		line6.add("lo valledor");
		line6.add("presidente pedro aguirre cerda");
		line6.add("franklin");
		line6.add("bio bio");
		line6.add("ñuble");
		line6.add("estadio nacional");
		line6.add("ñuñoa");
		line6.add("ines de suarez");
		line6.add("los leones");
		
		ArrayList<String> line4a = new ArrayList<String>();
		line4a.add("vicuña mackenna");
		line4a.add("santa julia");
		line4a.add("la granja");
		line4a.add("santa rosa");
		line4a.add("san ramon");
		line4a.add("la cisterna");
		
		// add line to the network
		
		network.add(line1);
		network.add(line2);
		network.add(line3);
		network.add(line4);
		network.add(line5);
		network.add(line6);
		network.add(line4a);
		
		return network; 
	}
	ArrayList<ArrayList<String>> comb = new ArrayList<ArrayList<String>>();
	public ArrayList<ArrayList<String>> CombNetwork(){
		ArrayList<String> comb1 = new ArrayList<String>();
		comb1.add("2");
		comb1.add("1");
		comb1.add("puente cal y canto");
		
		ArrayList<String> comb2 = new ArrayList<String>();
		comb2.add("1");
		comb2.add("2");
		comb2.add("puente cal y canto");
		
		ArrayList<String> comb3= new ArrayList<String>();
		comb3.add("0");
		comb3.add("4");
		comb3.add("san pablo");
		
		ArrayList<String> comb4= new ArrayList<String>();
		comb4.add("4");
		comb4.add("0");
		comb4.add("san pablo");
		
		ArrayList<String> comb5= new ArrayList<String>();
		comb5.add("4");
		comb5.add("1");
		comb5.add("santa ana");
		
		ArrayList<String> comb6= new ArrayList<String>();
		comb6.add("1");
		comb6.add("4");
		comb6.add("santa ana");
		
		ArrayList<String> comb7= new ArrayList<String>();
		comb7.add("4");
		comb7.add("2");
		comb7.add("plaza de armas");
		
		ArrayList<String> comb8= new ArrayList<String>();
		comb8.add("2");
		comb8.add("4");
		comb8.add("plaza de armas");
		
		ArrayList<String> comb9= new ArrayList<String>();
		comb9.add("0");
		comb9.add("1");
		comb9.add("los heroes");
		
		ArrayList<String> comb10= new ArrayList<String>();
		comb10.add("1");
		comb10.add("0");
		comb10.add("los heroes");
		
		ArrayList<String> comb11= new ArrayList<String>();
		comb11.add("2");
		comb11.add("0");
		comb11.add("universidad de chile");
		
		ArrayList<String> comb12= new ArrayList<String>();
		comb12.add("0");
		comb12.add("2");
		comb12.add("universidad de chile");
		
		ArrayList<String> comb13= new ArrayList<String>();
		comb13.add("4");
		comb13.add("0");
		comb13.add("baquedano");
		
		ArrayList<String> comb14= new ArrayList<String>();
		comb14.add("0");
		comb14.add("4");
		comb14.add("baquedano");

		ArrayList<String> comb15= new ArrayList<String>();
		comb15.add("0");
		comb15.add("5");
		comb15.add("los leones");
		
		ArrayList<String> comb16= new ArrayList<String>();
		comb16.add("5");
		comb16.add("0");
		comb16.add("los leones");
		
		ArrayList<String> comb17= new ArrayList<String>();
		comb17.add("3");
		comb17.add("0");
		comb17.add("tobalaba");
		
		ArrayList<String> comb18= new ArrayList<String>();
		comb18.add("0");
		comb18.add("3");
		comb18.add("tobalaba");
		
		ArrayList<String> comb19= new ArrayList<String>();
		comb19.add("2");
		comb19.add("4");
		comb19.add("irarazabal");
		
		ArrayList<String> comb20= new ArrayList<String>();
		comb20.add("4");
		comb20.add("2");
		comb20.add("irarazabal");
		
		ArrayList<String> comb21= new ArrayList<String>();
		comb21.add("5");
		comb21.add("2");
		comb21.add("ñuñoa");
		
		ArrayList<String> comb22= new ArrayList<String>();
		comb22.add("2");
		comb22.add("5");
		comb22.add("ñuñoa");
		
		ArrayList<String> comb23= new ArrayList<String>();
		comb23.add("3");
		comb23.add("2");
		comb23.add("plaza egaña");
		
		ArrayList<String> comb24= new ArrayList<String>();
		comb24.add("2");
		comb24.add("3");
		comb24.add("plaza egaña");
		
		ArrayList<String> comb25= new ArrayList<String>();
		comb25.add("1");
		comb25.add("5");
		comb25.add("franklin");
		
		ArrayList<String> comb26= new ArrayList<String>();
		comb26.add("5");
		comb26.add("1");
		comb26.add("franklin");
		
		ArrayList<String> comb27= new ArrayList<String>();
		comb27.add("5");
		comb27.add("4");
		comb27.add("ñuble");
		
		ArrayList<String> comb28= new ArrayList<String>();
		comb28.add("4");
		comb28.add("5");
		comb28.add("ñuble");
		
		ArrayList<String> comb29= new ArrayList<String>();
		comb29.add("1");
		comb29.add("6");
		comb29.add("la cisterna");
		
		ArrayList<String> comb30= new ArrayList<String>();
		comb30.add("6");
		comb30.add("1");
		comb30.add("la cisterna");
		
		ArrayList<String> comb31= new ArrayList<String>();
		comb31.add("6");
		comb31.add("3");
		comb31.add("vicuña mackenna");
		
		ArrayList<String> comb32= new ArrayList<String>();
		comb32.add("3");
		comb32.add("6");
		comb32.add("vicuña mackenna");
		
		ArrayList<String> comb33= new ArrayList<String>();
		comb33.add("4");
		comb33.add("3");
		comb33.add("vicente valdez");
		
		ArrayList<String> comb34= new ArrayList<String>();
		comb34.add("3");
		comb34.add("4");
		comb34.add("vicente valdez");
		
		comb.add(comb1);
		comb.add(comb2);
		comb.add(comb3);
		comb.add(comb4);
		comb.add(comb5);
		comb.add(comb6);
		comb.add(comb7);
		comb.add(comb8);
		comb.add(comb9);
		comb.add(comb10);
		comb.add(comb11);
		comb.add(comb12);
		comb.add(comb13);
		comb.add(comb14);
		comb.add(comb15);
		comb.add(comb16);
		comb.add(comb17);
		comb.add(comb18);
		comb.add(comb19);
		comb.add(comb20);
		comb.add(comb21);
		comb.add(comb22);
		comb.add(comb23);
		comb.add(comb24);
		comb.add(comb25);
		comb.add(comb26);
		comb.add(comb27);
		comb.add(comb28);
		comb.add(comb29);
		comb.add(comb30);
		comb.add(comb31);
		comb.add(comb32);
		comb.add(comb33);
		comb.add(comb34);
		
		return comb;
	}
}
