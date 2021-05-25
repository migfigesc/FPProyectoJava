package fp.tipos;

import java.time.Duration;
import java.time.LocalDate;

import fp.utiles.Checkers;

public class TrayectoUber implements Comparable<TrayectoUber>{
	private String origenTrayecto, destinoTrayecto;
	private LocalDate diaMayorRecaudacion;
	private Integer mediaDuracionTrayecto, maximoDuracionTrayecto, minimoDuracionTrayecto;
	private ModeloCoche cocheMasUsado;
	private Boolean pagoEfectivo;

	public TrayectoUber(String origenTrayecto, String destinoTrayecto, LocalDate diaMayorRecaudacion,
			Integer mediaDuracionTrayecto, Integer maximoDuracionTrayecto, Integer minimoDuracionTrayecto,
			ModeloCoche cocheMasUsado, Boolean pagoEfectivo) {
		super();
		this.origenTrayecto = origenTrayecto;
		this.destinoTrayecto = destinoTrayecto;
		this.diaMayorRecaudacion = diaMayorRecaudacion;
		this.mediaDuracionTrayecto = mediaDuracionTrayecto;
		this.maximoDuracionTrayecto = maximoDuracionTrayecto;
		this.minimoDuracionTrayecto = minimoDuracionTrayecto;
		this.cocheMasUsado = cocheMasUsado;
		this.pagoEfectivo = pagoEfectivo;
		Checkers.checkNoNull(minimoDuracionTrayecto);
		Checkers.checkNoNull(mediaDuracionTrayecto);
		Checkers.checkNoNull(maximoDuracionTrayecto);
		Checkers.check("La duración mínima del trayecto debe ser menor a la mayor", minimoDuracionTrayecto < minimoDuracionTrayecto);
	}

	public String getOrigenTrayecto() {
		return origenTrayecto;
	}

	public void setOrigenTrayecto(String origenTrayecto) {
		this.origenTrayecto = origenTrayecto;
	}

	public String getDestinoTrayecto() {
		return destinoTrayecto;
	}

	public void setDestinoTrayecto(String destinoTrayecto) {
		this.destinoTrayecto = destinoTrayecto;
	}

	public LocalDate getDiaMayorRecaudacion() {
		return diaMayorRecaudacion;
	}

	public void setDiaMayorRecaudacion(LocalDate diaMayorRecaudacion) {
		this.diaMayorRecaudacion = diaMayorRecaudacion;
	}

	public Integer getMediaDuracionTrayecto() {
		return mediaDuracionTrayecto;
	}

	public void setMediaDuracionTrayecto(Integer mediaDuracionTrayecto) {
		this.mediaDuracionTrayecto = mediaDuracionTrayecto;
		Checkers.checkNoNull(mediaDuracionTrayecto);

	}

	public Integer getMaximoDuracionTrayecto() {
		return maximoDuracionTrayecto;
	}

	public void setMaximoDuracionTrayecto(Integer maximoDuracionTrayecto) {
		this.maximoDuracionTrayecto = maximoDuracionTrayecto;
		Checkers.checkNoNull(maximoDuracionTrayecto);

	}

	public Integer getMinimoDuracionTrayecto() {
		return minimoDuracionTrayecto;
	}

	public void setMinimoDuracionTrayecto(Integer minimoDuracionTrayecto) {
		this.minimoDuracionTrayecto = minimoDuracionTrayecto;
		Checkers.checkNoNull(minimoDuracionTrayecto);
		Checkers.check("La duración mínima del trayecto debe ser menor a la mayor", minimoDuracionTrayecto < minimoDuracionTrayecto);

	}

	public ModeloCoche getCocheMasUsado() {
		return cocheMasUsado;
	}

	public void setCocheMasUsado(ModeloCoche cocheMasUsado) {
		this.cocheMasUsado = cocheMasUsado;
	}

	public Boolean getPagoEfectivo() {
		return pagoEfectivo;
	}

	public void setPagoEfectivo(Boolean pagoEfectivo) {
		this.pagoEfectivo = pagoEfectivo;
	}

	@Override
	public String toString() {
		return "TrayectoUber [origenTrayecto=" + origenTrayecto + ", destinoTrayecto=" + destinoTrayecto
				+ ", diaMayorRecaudacion=" + diaMayorRecaudacion + ", mediaDuracionTrayecto=" + mediaDuracionTrayecto
				+ ", maximoDuracionTrayecto=" + maximoDuracionTrayecto + ", minimoDuracionTrayecto="
				+ minimoDuracionTrayecto + ", cocheMasUsado=" + cocheMasUsado + ", pagoEfectivo=" + pagoEfectivo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinoTrayecto == null) ? 0 : destinoTrayecto.hashCode());
		result = prime * result + ((origenTrayecto == null) ? 0 : origenTrayecto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrayectoUber other = (TrayectoUber) obj;
		if (destinoTrayecto == null) {
			if (other.destinoTrayecto != null)
				return false;
		} else if (!destinoTrayecto.equals(other.destinoTrayecto))
			return false;
		if (origenTrayecto == null) {
			if (other.origenTrayecto != null)
				return false;
		} else if (!origenTrayecto.equals(other.origenTrayecto))
			return false;
		return true;
	}

	@Override
	public int compareTo(TrayectoUber o) {
		int res = this.getOrigenTrayecto().compareTo(o.getOrigenTrayecto());
		if (res == 0) {
			res = this.getDestinoTrayecto().compareTo(o.getDestinoTrayecto());
		}
		return res;
	}
	
	


}
