package dominio;

import java.util.ArrayList;

public class Mercado {
    ArrayList<Ofertas> ofertas;

    public Mercado() {
        ofertas = new ArrayList<Ofertas>();
    }

    public Mercado(ArrayList<Ofertas> ofertas) {
        this.ofertas = ofertas;
    }

    public ArrayList<Ofertas> getOfertas() {
        return ofertas;
    }

    public void AddOferta(int o, int d, String user, int id) {
        ofertas.add(new Ofertas(o, d, user, id));
    }

    public void AddOferta(Ofertas o) {
        ofertas.add(o);
    }

    public void sacar(Ofertas o1) {
        ofertas.remove(o1);
        
    }

}
