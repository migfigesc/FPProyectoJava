package fp.tipos.test;

import fp.tipos.ModeloCoche;
import fp.tipos.TrayectoUber;

import java.time.LocalDate;

public class TestTrayectoUber {
	
	public static void main(String[] args) {
		testConstructor();

	}

		private static void testConstructor () {
			System.out.println("\nTEST DEL CONSTRUCTOR");
			try {

				TrayectoUber trayecto1 = new TrayectoUber("Puerta Jerez", "Apeadero San Bernardo",
						LocalDate.of(2021, 04, 23), 340,
				220, 600, ModeloCoche.PEUGEOT_308, true);
				System.out.println("TrayectoUber:" + trayecto1);

			} catch(Exception e) {
				System.out.println("No se ha podido cargar el trayecto" + e);
			}


		}


		
	}


