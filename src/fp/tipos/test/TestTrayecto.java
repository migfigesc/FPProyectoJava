package fp.tipos.test;

import fp.tipos.ModeloCoche;
import fp.tipos.Trayecto;

import java.time.LocalDate;

public class TestTrayecto {
	
	public static void main(String[] args) {
		testConstructor();


	}

		private static void testConstructor () {
			System.out.println("\nTEST DEL CONSTRUCTOR");
			try {

				Trayecto trayecto1 = new Trayecto("Puerta Jerez", "Apeadero San Bernardo",
						LocalDate.of(2021, 04, 23), 340,
				220, 600, ModeloCoche.PEUGEOT_308, true);
				System.out.println("TrayectoUber:" + trayecto1);
				System.out.println("Destino del trayecto: " + trayecto1.getDestinoTrayecto());

			} catch(Exception e) {
				System.out.println("No se ha podido cargar el trayecto" + e);
			}


		}


		
	}


