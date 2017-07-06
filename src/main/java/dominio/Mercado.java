package dominio;

import java.util.ArrayList;

/**
 * @author Usuario clase mercado, donde se va a guardar las ofertas que existan
 *         dentro del juego
 *
 */
public class Mercado {
    /**
     * ofertas presentes en el mercado.
     */
    protected ArrayList<Ofertas> ofertas;

    /**
     * constructor por defecto de la clase mercado donde se instancia el vector
     * oferta.
     */
    public Mercado() {
        ofertas = new ArrayList<Ofertas>();
    }

    /**
     * @param ofertas
     *            constructor parametrizado.
     */
    public Mercado(final ArrayList<Ofertas> ofertas) {
        this.ofertas = ofertas;
    }

    /**
     * @return getter de las ofertas.
     */
    public ArrayList<Ofertas> getOfertas() {
        return ofertas;
    }

    /**
     * @param o
     *            .
     * @param d
     *            .
     * @param user
     *            .
     * @param id
     *            . metodo que permite agregar una oferta al mercado.
     */
    public void AddOferta(final int o, final int d, final String user,
            final int id) {
        ofertas.add(new Ofertas(o, d, user, id));
    }

    /**
     * @param o
     *            agregar oferta.
     */
    public void AddOferta(final Ofertas o) {
        ofertas.add(o);
    }

}
