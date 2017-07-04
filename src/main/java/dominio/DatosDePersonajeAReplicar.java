package dominio;

/**
 *
 * clase para replicar los datos de un personaje.
 */
/**
 * @author Usuario
 *
 */
/**
 * @author Usuario
 *
 */
public class DatosDePersonajeAReplicar {

    /**
     * atributo que hace referencia a la salud del personaje a replicar.
     */
    private int saludTope; // *
    /**
     * atributo que hace referencia a la energia del personaje a replicar.
     */
    private int energiaTope; // *
    /**
     * atributo que hace referencia a la fuerza del personaje a replicar.
     */
    private int fuerza; // *
    /**
     * atributo que hace referencia a la destreza del personaje a replicar.
     */
    private int destreza; // *
    /**
     * atributo que hace referencia a la inteligencia a replicar.
     */
    private int inteligencia; // *
    /**
     * atributo que hace referencia a la experiencia a replicar.
     */
    private int experiencia; // *
    /**
     * atributo que hace referencia al nivel del personaje a replicar.
     */
    private int nivel;

    /**
     * @param saludTope
     *            .
     * @param energiaTope
     *            .
     * @param fuerza
     *            .
     * @param destreza
     *            .
     * @param inteligencia
     *            .
     * @param experiencia
     *            .
     * @param nivel
     *            .
     * @param defensa
     *            .
     */
    public DatosDePersonajeAReplicar(final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final int experiencia, final int nivel) {
        this.saludTope = salud;
        this.energiaTope = energia;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    /**
     * Constructor por defecto.
     */
    public DatosDePersonajeAReplicar() {

    }

    /**
     * @param p
     *            metodo para empaquetar los datos del personaje p.
     */
    /*
     * public void empaquetarDatos(final Personaje p) { this.saludTope =
     * p.getSalud(); this.energiaTope = p.getEnergia(); this.fuerza =
     * p.getFuerza(); this.destreza = p.getDestreza(); this.inteligencia =
     * p.getInteligencia(); this.experiencia = p.getExperiencia(); this.nivel =
     * p.getNivel(); }
     */
    // ----------------------------
    // Getters Setters.
    // ----------------------------
    /**
     * @return getter de saludTope.
     */
    public int getSaludTope() {
        return saludTope;
    }

    /**
     * @param salud
     *            setter de saludTope.
     */
    public void setSaludTope(final int saludTope) {
        this.saludTope = saludTope;
    }

    /**
     * @return getter de energiaTope.
     */
    public int getEnergiaTope() {
        return energiaTope;
    }

    /**
     * @param energia
     *            setter de energiaTope.
     */
    public void setEnergiaTope(final int energiaTope) {
        this.energiaTope = energiaTope;
    }

    /**
     * @return getter de fuerza.
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza
     *            setter de fuerza.
     */
    public void setFuerza(final int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return getter de destreza.
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza
     *            setter de destreza.
     */
    public void setDestreza(final int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return getter de inteligencia.
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia
     *            setter de inteligencia.
     */
    public void setInteligencia(final int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return getter de experiencia.
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia
     *            setter de experiencia.
     */
    public void setExperiencia(final int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return getter de nievl.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel
     *            setter de nivel.
     */
    public void setNivel(final int nivel) {
        this.nivel = nivel;
    }
}
