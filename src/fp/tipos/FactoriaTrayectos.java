package fp.tipos;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Checkers;
import fp.utiles.Ficheros;

public class FactoriaTrayectos {
	
	public static Datos leerTrayectos(String mensajeError, String ruta) {
		List<String> datos = Ficheros.leeFichero(mensajeError, ruta);
		List<TrayectoUber> lista = new ArrayList<TrayectoUber>();
		for(String s : datos) {
			lista.add(parseaTrayecto(s));
		}
		Datos d = new Datos(lista);
		return d;
	}
	
	public static TrayectoUber parseaTrayecto(String s) {
		String [] trozos = s.split(";");
		Checkers.check("La cadena está mal formada", trozos.length==8);
		String origenTrayecto = trozos[0].trim();
		String destinoTrayecto = trozos[1].trim();
		LocalDate diaMayorRecaudacion = LocalDate.parse(trozos[2].trim(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Integer mediaDuracionTrayecto = Integer.valueOf(trozos[3].trim());
		Integer maximoDuracionTrayecto = Integer.valueOf(trozos[4].trim());
		Integer minimoDuracionTrayecto = Integer.valueOf(trozos[5].trim());
		ModeloCoche cocheMasUsado = ModeloCoche.valueOf(trozos[6].trim());
		Boolean pagoEfectivo = Boolean.parseBoolean(trozos[7].trim());
		return new TrayectoUber(origenTrayecto, destinoTrayecto, diaMayorRecaudacion, mediaDuracionTrayecto, maximoDuracionTrayecto, minimoDuracionTrayecto, cocheMasUsado, pagoEfectivo);

	}

}
