package dominio;

import java.util.ArrayList;

public class Mercado {
	ArrayList<Ofertas> ofertas;
	
	public Mercado(){
		ofertas = new ArrayList<Ofertas>();
	}
	public Mercado(ArrayList<Ofertas> ofertas) {
		this.ofertas = ofertas;
	}

	public ArrayList<Ofertas> getOfertas() {
		return ofertas;
	}
	public void setOfertas(ArrayList<Ofertas> ofertas) {
		this.ofertas = ofertas;
	}
	public void AddOferta(int o, int d){
		ofertas.add(new Ofertas(o, d));
	}

	
}
