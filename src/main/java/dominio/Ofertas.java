package dominio;

/**
 * Clase que contiene el item ofertado y el demandado de una oferta que ocurre
 * en el mercado.
 *
 */
public class Ofertas {
	private String user;
	private int ofertado;
	private int demandado;

	public Ofertas(int ofertado, int demandado, String user) {
		this.ofertado = ofertado;
		this.demandado = demandado;
		this.user = user;
	}

	public Ofertas() {
		// TODO Auto-generated constructor stub
	}

	public int getOfertado() {
		return ofertado;
	}

	public int getDemandado() {
		return demandado;
	}


	public String getUser() {
		return user;
	}


	
}
