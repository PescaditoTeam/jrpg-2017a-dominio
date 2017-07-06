package dominio;

/**
 * Es uno de los tipos de persona, herendando asi sus atributos y
 * funcionalidades.
 *
 */
public class Elfo extends Personaje {
    /**
     * Constante para liitar la energia o salud a 10.
     */
    private static final int LIMITEENERGIA = 10;
    /**
     * constructor parametrizado.
     *
     * @param nombre
     *            nombre del elfo.
     * @param casta
     *            casta del elfo.
     * @param id
     *            id del elfo.
     */
    public Elfo(final String nombre, final Casta casta, final int id) {
        super(nombre, casta, id, "Elfo", "Golpe Level", "Ataque Bosque");
        energiaTope += LIMITEENERGIA;
        salud = saludTope;
        energia = energiaTope;

    }

    /**
     * @param nombre
     *            .
     * @param salud
     *            .
     * @param energia
     *            .
     * @param fuerza
     *            .
     * @param destreza
     *            .
     * @param inteligencia
     *            .
     * @param casta
     *            .
     * @param experiencia
     *            .
     * @param nivel
     *            .
     * @param idPersonaje
     *            .
     * @param mochila
     *            .
     */
    public Elfo(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje, final Mochila mochila) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Elfo", "Golpe Level",
                "Ataque Bosque", mochila);
    }

    /**
     * @param nombre
     *            .
     * @param salud
     *            .
     * @param energia
     *            .
     * @param fuerza
     *            .
     * @param destreza
     *            .
     * @param inteligencia
     *            .
     * @param casta
     *            .
     * @param experiencia
     *            .
     * @param nivel
     *            .
     * @param idPersonaje
     *            .
     */
    public Elfo(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Elfo", "Golpe Level",
                "Ataque Bosque");
    }

    // Golpe Level
    /*
     * (non-Javadoc)
     *
     * @see dominio.Personaje#habilidadRaza1(dominio.Peleable) Devuele si el
     * personaje en cuestion tiene o no la habilidad requerida
     */
    @Override
    public boolean habilidadRaza1(final Peleable atacado) {
        if (this.getEnergia() > LIMITEENERGIA) {
            this.setEnergia(this.getEnergia() - LIMITEENERGIA);
            if (atacado.serAtacado(
                    this.getFuerza() + (this.getNivel() * LIMITEENERGIA)) > 0) {
                return true;
            }
        }
        return false;
    }

    // Ataque Bosque
    /*
     * realiza la habilidad 2 de la raza.
     */
    @Override
    public boolean habilidadRaza2(final Peleable atacado) {
        if (this.getEnergia() > LIMITEENERGIA) {
            this.setEnergia(this.getEnergia() - LIMITEENERGIA);
            if (atacado.serAtacado((this.magia)) > 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * avisa si fue afectado el hecizo aplicaod en el.
     */
    @Override
    public boolean esAfectadoPorHechizo() {
        return true;
    }
}
