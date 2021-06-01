package fp.tipos;

import java.time.LocalDate;
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

	public long getNumeroTrayectosPagoEfectivo() {
		return trayectos.stream()
				.filter(x->x.getPagoEfectivo().equals(Boolean.TRUE))
				.count();
	}

	public long getNumeroTrayectosPagoTarjeta() {
		return getNumTrayectos() - getNumeroTrayectosPagoEfectivo();
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

	public SortedSet<Trayecto> getTrayectosEnFechasPorCoche(LocalDate fecha1, LocalDate fecha2) {
		return trayectos.stream()
				.filter(x -> x.getDiaMayorRecaudacion().compareTo(fecha1) <= 0 &&
						x.getDiaMayorRecaudacion().compareTo(fecha2)>=0)
				.sorted(Comparator.comparing(Trayecto::getCocheMasUsado))
				.collect(Collectors.toCollection(TreeSet::new));
	}

	//será el que la suma de todos sus tiempos medios sea mayor
	public ModeloCoche getModeloCocheMasUtilizado() {
		Map<ModeloCoche, Long> m = modeloCochePorTrayectos();
		return m.entrySet().stream()
				.max(Comparator.comparing(x -> x.getValue()))
				.get()
				.getKey();
	}

	//método auxiliar
	private Map<ModeloCoche, Long> modeloCochePorTrayectos() {
		return trayectos.stream()
				.collect(Collectors.groupingBy(Trayecto::getCocheMasUsado,Collectors.counting()));
	}

}
