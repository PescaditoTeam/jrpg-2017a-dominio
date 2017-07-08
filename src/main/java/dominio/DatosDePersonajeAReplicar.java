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
     * @param s
     *            .
     * @param f
     *            .
     * @param e
     *            .
     * @param dest
     *            .
     * @param intel
     *            .
     * @param exp
     *            .
     * @param n
     *            .
     */
    public DatosDePersonajeAReplicar(final int s, final int e,
            final int f, final int dest, final int intel,
            final int exp, final int n) {
        this.saludTope = s;
        this.energiaTope = e;
        this.fuerza = f;
        this.destreza = dest;
        this.inteligencia = intel;
        this.experiencia = exp;
        this.nivel = n;
    }

    /**
     * Constructor por defecto.
     */
    public DatosDePersonajeAReplicar() {

    }

    /**
     * @return getter de saludTope.
     */
    public int getSaludTope() {
        return saludTope;
    }

    /**
     * @param saludTope
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
     * @param eTope
     *            setter de energiaTope.
     */
    public void setEnergiaTope(final int eTope) {
        this.energiaTope = eTope;
    }

    /**
     * @return getter de fuerza.
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param f
     *            setter de fuerza.
     */
    public void setFuerza(final int f) {
        this.fuerza = f;
    }

    /**
     * @return getter de destreza.
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param dest
     *            setter de destreza.
     */
    public void setDestreza(final int dest) {
        this.destreza = dest;
    }

    /**
     * @return getter de inteligencia.
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param intel
     *            setter de inteligencia.
     */
    public void setInteligencia(final int intel) {
        this.inteligencia = intel;
    }

    /**
     * @return getter de experiencia.
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param exp
     *            setter de experiencia.
     */
    public void setExperiencia(final int exp) {
        this.experiencia = exp;
    }

    /**
     * @return getter de nievl.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param n
     *            setter de nivel.
     */
    public void setNivel(final int n) {
        this.nivel = n;
    }
}
