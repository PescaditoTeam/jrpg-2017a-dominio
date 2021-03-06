package dominio;

/**
 * Es uno de los tipos de persona, herendando asi sus atributos y
 * funcionalidades.
 *
 */
public class Humano extends Personaje {

    /**
     * Constante para liitar la energia o salud a 10.
     */
    private static final int LIMITEENERGIA = 10;
    /**
     * constructor parametrizado.
     *
     * @param nombre
     *            .
     * @param casta
     *            .
     * @param id
     *            .
     */
    public Humano(final String nombre, final Casta casta, final int id) {
        super(nombre, casta, id, "Humano", "Incentivar", "Golpe Fatal");
        saludTope += 5;
        energiaTope += 5;
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
     */
    public Humano(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Humano", "Incentivar",
                "Golpe Fatal");

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
    public Humano(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje, final Mochila mochila) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Humano", "Incentivar",
                "Golpe Fatal", mochila);

    }

    // Incentivar
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
            atacado.setAtaque(atacado.getAtaque() + this.getMagia());
            return true;
        }
        return false;
    }

    // Golpe Fatal
    /*
     * habilidad 3 del humano, el golpe fatal.
     */
    @Override
    public boolean habilidadRaza2(final Peleable atacado) {
        if (this.getEnergia() > LIMITEENERGIA) {
            if (atacado.serAtacado(atacado.getSalud() / 2) > 0) {
                this.setEnergia(this.getEnergia() / 2);
                return true;
            }
        }
        this.setEnergia(this.getEnergia() - LIMITEENERGIA);
        return false;
    }

    /*
     * avisa que fue afectado por el hechizo.
     */
    @Override
    public boolean esAfectadoPorHechizo() {
        return true;
    }
}
