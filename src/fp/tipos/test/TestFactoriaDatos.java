package fp.tipos.test;

import fp.tipos.FactoriaTrayectos;
import fp.tipos.Datos;
import fp.tipos.ModeloCoche;

public class TestFactoriaDatos {

    private static final Datos DATOS = FactoriaTrayectos.leerTrayectos("Datos no leídos" +
            "correctamente", "data/dataset_EDITADO.csv");

    public static void main(String[] args) {
        //testCreacionDatos();
        //testExisteTrayectoDestino();
        //testGetNumeroTrayectoModeloCoche();
        //testGetModeloCochesTrayectos();
        //testGetTrayectoMayorDuracionMedia();
        testGetTrayectosPorModeloCoche();

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

    private static void testGetModeloCochesTrayectos() {
        System.out.println("\nTest de getModeloCochesTrayectos");
        try {
            System.out.println("Los diferentes modelos disponibles de coches en la flota de " +
                    "Uber son: " + DATOS.getModeloCochesTrayectos());
        } catch (Exception e) {
            System.out.println("Excepción capturada \n" + e);
        }
    }

    //test map y sus variantes mapToInt, mapToLong y mapToDouble. (Function) + distinct, limit

    private static void testGetTrayectoMayorDuracionMedia() {
        System.out.println("\nTest de getTrayectoMayorDuracionMedia");
        try {
            System.out.println("El trayecto con mayor duración media es: " + DATOS.getTrayectoMayorDuracionMedia());
        } catch (Exception e) {
            System.out.println("Excepción capturada \n" + e);
        }
    }

    private static void testCambiaOrigenTrayectoSegunModeloCoche() {
        ModeloCoche modelo = ModeloCoche.MAZDA_3;
        String origen = "Arc de triomphe du Carrousel, Paris";
        String nuevoOrigen = " Plaza de Armas, Sevilla";

        System.out.println("Test de cambiaOrigenTrayectoSegunModeloCoche");
        try {
            System.out.println("Número de trayectos de " + modelo + " desde " + origen +" : " +
                    DATOS.getNumeroTrayectoModeloCoche(modelo));

        } catch (Exception e){
            System.out.println("Excepción capturada:\n" + e);
        }

    }

    private static void testGetTrayectosPorModeloCoche() {
        System.out.println("\nTest de getTrayectosPorModeloCoche");
        try {
            System.out.print(DATOS.getTrayectosPorModeloCoche());
        } catch (Exception e) {
            System.out.println("Excepción capturada\n" + e);
        }

    }
}

