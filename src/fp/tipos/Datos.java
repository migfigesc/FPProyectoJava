package fp.tipos;

import java.util.ArrayList;
import java.util.List;

public class Datos {
	private List<TrayectoUber> trayectos;

	public Datos() {
		super();
		trayectos = new ArrayList<TrayectoUber>();
	}

	public Datos(List<TrayectoUber> trayectos) {
		super();
		this.trayectos = trayectos;
	}

	public String toString() {
		return "Datos [trayectos=" + trayectos + "]";
	}
	
	public void añadeTrayecto(TrayectoUber t) {
		if(t != null) {
			trayectos.add(t);
		}
	}
	
	public void eliminaTrayecto(TrayectoUber t) {
		if(!trayectos.contains(t)) {
			throw new IllegalArgumentException("El trayecto no está registrado en los datos");
		}
		trayectos.remove(t);
	}

}
