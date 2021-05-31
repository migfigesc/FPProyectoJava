package fp.tipos;

import java.util.*;
import java.util.stream.Collectors;

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

	public Boolean existeTrayectoDestino(String destino){
		return trayectos.stream()
				.anyMatch(x -> x.getDestinoTrayecto().equals(destino));
	}

	public Long getNumeroTrayectoModeloCoche(ModeloCoche modelo) {
		return trayectos.stream()
				.filter(x -> x.getCocheMasUsado().equals(modelo)).count();
	}

	public Set<ModeloCoche> getModeloCochesTrayectos() {
		return trayectos.stream()
				.map(Trayecto::getCocheMasUsado)
				.collect(Collectors.toSet());
	}

	//map y sus variantes mapToInt, mapToLong y mapToDouble. (Function) + distinct, limit

	public Trayecto getTrayectoMayorDuracionMedia() {
		Comparator<Trayecto> cmp = Comparator.comparing(Trayecto::getMediaDuracionTrayecto);
		return trayectos.stream()
				.max(cmp)
				.get();
	}

	public void cambiaPagoEfectivoDestino(String destino, Boolean pagoEfectivo, Boolean nuevoPagoEfectivo) {
		trayectos.stream()
				.filter(x -> x.getPagoEfectivo().equals(pagoEfectivo)&&
						x.getDestinoTrayecto().equals(destino))
				.forEach(x->x.setPagoEfectivo(nuevoPagoEfectivo));
	}

	public Map<ModeloCoche, List<Trayecto>> getTrayectosPorModeloCoche() {
		return trayectos.stream()
				.collect(Collectors.groupingBy(Trayecto::getCocheMasUsado));
	}

}
