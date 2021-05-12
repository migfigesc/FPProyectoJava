package fp.tipos.test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fp.tipos.Datos;
import fp.tipos.FactoriaTrayectos;
import fp.tipos.ModeloCoche;
import fp.tipos.TrayectoUber;
import fp.utiles.Ficheros;

public class TestDatos {

	public static void main(String[] args) {
		
//		Datos d = new Datos();
//		System.out.println(d);
//		TrayectoUber trayecto1 = new TrayectoUber("Puerta Jerez", "Apeadero San Bernardo", LocalDate.of(2021, 04, 23), Duration.ofSeconds(340), 
//				Duration.ofSeconds(220), Duration.ofSeconds(600), ModeloCoche.PEUGEOT_308, true);
//		List<TrayectoUber> lista = new ArrayList<TrayectoUber>();
//		lista.add(trayecto1);
//		Datos d1 = new Datos(lista);
//		System.out.println(d1);
//		
//		TrayectoUber trayecto2 = new TrayectoUber("Macarena", "Plaza de Armas", LocalDate.of(2021, 04, 23), Duration.ofSeconds(340), 
//				Duration.ofSeconds(220), Duration.ofSeconds(600), ModeloCoche.FIAT_TIPO, false);
//		lista.add(trayecto2);
//		Datos d2 = new Datos(lista);
//		System.out.println(d2);
		

//		List<TrayectoUber> listaDatos = new ArrayList<TrayectoUber>();
//		for(String s : datos) {
//			listaDatos.add(new TrayectoUber(s));
//		}
		
		Datos d = FactoriaTrayectos.leerTrayectos("Archivo no leído correctamente", "data/dataset_EDITADO.csv");
		System.out.println(d);
	}

}
