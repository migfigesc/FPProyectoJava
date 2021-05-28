package fp.tipos;

import java.util.ArrayList;
import java.util.List;

public class Datos {
	private List<Trayecto> trayectos;

	public Datos() {
		super();
		trayectos = new ArrayList<Trayecto>();
	}

	public Datos(List<Trayecto> trayectos) {
		super();
		this.trayectos = trayectos;
	}

	public String toString() {
		return "Datos [trayectos=" + trayectos + "]";
	}
	
	public void añadeTrayecto(Trayecto t) {
		if(t != null) {
			trayectos.add(t);
		}
	}
	
	public void eliminaTrayecto(Trayecto t) {
		if(!trayectos.contains(t)) {
			throw new IllegalArgumentException("El trayecto no está registrado en los datos");
		}
		trayectos.remove(t);
	}

	public Integer getNumTrayectos() {
		return trayectos.size();
	}

}
