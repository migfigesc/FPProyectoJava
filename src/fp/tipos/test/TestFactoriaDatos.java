package fp.tipos.test;

import fp.tipos.FactoriaTrayectos;
import fp.tipos.Datos;

public class TestFactoriaDatos {

    public static void main(String[] args) {
        testCreacionDatos();

    }

    private static void testCreacionDatos() {
        System.out.println("\nTEST CREACION DE DATOS:");
            Datos datos = FactoriaTrayectos.leerTrayectos("Datos no leídos correctamente",
                    "data/dataset_EDITADO.csv");
            System.out.println("Datos leídos" + datos);
        }
    }

