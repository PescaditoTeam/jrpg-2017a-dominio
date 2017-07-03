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
	
	public void AddOferta(int o, int d, String user){
		ofertas.add(new Ofertas(o, d, user));
	}
	public void AddOferta(Ofertas o){
		ofertas.add(o);
	}

	
}
