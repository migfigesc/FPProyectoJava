package fp.tipos;

import java.time.Duration;
import java.time.LocalDate;

import fp.utiles.Checkers;

public class TrayectoUber {
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
	
	


}
