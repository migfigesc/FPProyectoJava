package fp.tipos.test;

import fp.tipos.FactoriaTrayectos;
import fp.tipos.Datos;

public class TestFactoriaDatos {

    private static final Datos DATOS = FactoriaTrayectos.leerTrayectos("Datos no leídos" +
            "correctamente", "/data/dataset_EDITADO.csv");

    public static void main(String[] args) {
        testCreacionDatos();
        testExisteTrayectoDestino();

    }

    private static void testCreacionDatos() {
        System.out.println("\nTEST CREACION DE DATOS:");
            Datos datos = FactoriaTrayectos.leerTrayectos("Datos no leídos correctamente",
                    "data/dataset_EDITADO.csv");
            System.out.println("Datos leídos" + datos);
        }
    }

    private static void testExisteTrayectoDestino() {
        System.out.println("\nTest de existeTrayectoDestino");
        try {
            System.out.println(DATOS.existeTrayectoDestino("0 Rue Saint-Sauveur"));
        } catch (Exception e) {
            System.out.println("Excepción capturada:\n" + e);
        }
    }
}

