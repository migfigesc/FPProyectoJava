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

import static fp.tipos.ModeloCoche.FIAT_TIPO;

public class TestTrayectoUber {
	
	public static void main(String[] args) {
		testConstructor();

	}

		private static void testConstructor () {
			System.out.println("\nTEST DEL CONSTRUCTOR");
			try {

				TrayectoUber trayecto1 = new TrayectoUber("Puerta Jerez", "Apeadero San Bernardo", LocalDate.of(2021, 04, 23), 340,
				220, 600, ModeloCoche.PEUGEOT_308, true);
				System.out.println("TrayectoUber:" + trayecto1);

			} catch(Exception e) {
				System.out.println("No se ha podido cargar el trayecto" + e);
			}


		}


		
	}


