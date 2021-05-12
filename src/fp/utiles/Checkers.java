package fp.utiles;

//TEST GIT

public class Checkers {
	public static void check(String texto, Boolean condicion) {
		if(!condicion) {
			throw new IllegalArgumentException(texto);
		}
	}
	
	public static void checkNoNull(Object o) {
		if(o==null) {
			throw new IllegalArgumentException("El valor no puede ser nulo");
		}
	}

}
