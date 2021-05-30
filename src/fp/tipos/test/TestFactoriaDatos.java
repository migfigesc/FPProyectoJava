package fp.tipos.test;

import fp.tipos.FactoriaTrayectos;
import fp.tipos.Datos;
import fp.tipos.ModeloCoche;

public class TestFactoriaDatos {

    private static final Datos DATOS = FactoriaTrayectos.leerTrayectos("Datos no leídos" +
            "correctamente", "data/dataset_EDITADO.csv");

    public static void main(String[] args) {
        testCreacionDatos();
        testExisteTrayectoDestino();
        testGetNumeroTrayectoModeloCoche();

    }

    private static void testCreacionDatos() {
        System.out.println("\nTest creación de datos:");
        try {
            System.out.println("Leídos: " + DATOS.getNumTrayectos() + " trayectos");
        } catch (Exception e) {
            System.out.println("Excepción capturada: \n " + e);
        }
    }

    private static void testExisteTrayectoDestino() {
        System.out.println("\nTest de existeTrayectoDestino");
        String trayectoDestino = "0 Rue Saint-Sauveur, Paris";
        try {
            System.out.println("Existe el trayecto con destino: " + trayectoDestino + ": " +
                    DATOS.existeTrayectoDestino(trayectoDestino));
        } catch (Exception e) {
            System.out.println("Excepción capturada:\n" + e);
        }
    }

    private static void testGetNumeroTrayectoModeloCoche() {
        System.out.println("\nTest de getNumeroTrayectoModeloCoche:");
        ModeloCoche modeloCocheTest = ModeloCoche.PEUGEOT_308;
        try {
            System.out.println("Existen " + DATOS.getNumeroTrayectoModeloCoche(modeloCocheTest)+ " trayectos" +
                    " donde el coche más usado es el " + modeloCocheTest);
        } catch (Exception e) {
            System.out.println("Excepción capturada \n" + e);
        }
    }
}

