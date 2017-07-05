package dominio;

/**
 * Es uno de los tipos de persona, herendando asi sus atributos y
 * funcionalidades.
 *
 */
public class Orco extends Personaje {

    /**
     * @param nombre
     *            .
     * @param casta
     *            .
     * @param id
     *            .
     */
    public Orco(final String nombre, final Casta casta, final int id) {
        super(nombre, casta, id, "Orco", "Golpe Defensa", "Mordisco de Vida");
        saludTope += 10;
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
    public Orco(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje, final Mochila mochila) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Orco", "Golpe Defensa",
                "Mordisco de Vida", mochila);

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
     *            construye el orco recibiendo parametros.
     */
    public Orco(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje, "Orco", "Golpe Defensa",
                "Mordisco de Vida");

    }

    // Golpe Defensa
    /*
     * (non-Javadoc)
     *
     * @see dominio.Personaje#habilidadRaza1(dominio.Peleable) Devuele si el
     * personaje en cuestion tiene o no la habilidad requerida
     */
    @Override
    public boolean habilidadRaza1(final Peleable atacado) {
        if (this.getEnergia() > 10) {
            this.setEnergia(this.getEnergia() - 10);
            if (atacado.serAtacado(this.getDefensa() * 2) > 0) { // Pregunta si
                                                                 // pudo
                                                                 // hacer
                                                                 // daño
                return true;
            }
        }
        return false;
    }

    // Mordisco de Vida
    /*
     * habilidad 2 del orco, el mordisco de vida.
     */
    @Override
    public boolean habilidadRaza2(final Peleable atacado) {
        if (this.getEnergia() > 10) {
            this.setEnergia(this.getEnergia() - 10);
            int danioCausado = atacado.serAtacado(this.getFuerza());
            if (danioCausado > 0) {
                this.serCurado(danioCausado);
                return true;
            }
        }
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
