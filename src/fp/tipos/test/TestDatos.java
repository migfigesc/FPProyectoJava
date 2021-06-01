package fp.tipos.test;

import fp.tipos.Datos;
import fp.tipos.FactoriaTrayectos;
import fp.tipos.Trayecto;
import fp.tipos.ModeloCoche;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TestDatos {

	public static void main(String[] args) {
		
		Trayecto trayecto1 = new Trayecto("Puerta Jerez", "Apeadero San Bernardo", LocalDate.of(2021, 04, 23), 340,
				220, 600, ModeloCoche.PEUGEOT_308, true);
		Trayecto trayecto2 = new Trayecto("Macarena", "Plaza de Armas", LocalDate.of(2021, 04, 23), 340,
				220, 600, ModeloCoche.FIAT_TIPO, false);

		List<Trayecto> lista = new ArrayList<Trayecto>();
		lista.add(trayecto1);
		lista.add(trayecto2);
		Datos d = new Datos(lista);

		System.out.println(d);
		System.out.println("Número de trayectos registrados: " + d.getNumTrayectos());
		}

	}


