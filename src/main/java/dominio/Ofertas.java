package dominio;

/**
 * Clase que contiene el item ofertado y el demandado de una oferta que ocurre
 * en el mercado.
 *
 */
public class Ofertas {
	private int ofertado;
	private int demandado;

	public Ofertas(int ofertado, int demandado) {
		this.ofertado = ofertado;
		this.demandado = demandado;
	}

	public int getOfertado() {
		return ofertado;
	}

	public void setOfertado(int ofertado) {
		this.ofertado = ofertado;
	}

	public int getDemandado() {
		return demandado;
	}

	public void setDemandado(int demandado) {
		this.demandado = demandado;
	}

}
