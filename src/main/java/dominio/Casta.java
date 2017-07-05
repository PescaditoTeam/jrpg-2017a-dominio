package dominio;

import java.io.Serializable;

/**
 * Es la clase que une a los tipos de razas (asesino, guerrero, hechicero), con
 * sus metodos correspondientes a utilizar.
 *
 */
public abstract class Casta implements Serializable {
    /**
     * atributo que representa la probabilidad del golpe critico.
     */
    private double probabilidadGolpeCritico;
    /**
     * atributo que representa la probabilidad de evitar daño.
     */
    protected double probabilidadEvitarDaño;
    /**
     * atributo que representa el daño critico.
     */
    private double dañoCritico;
    /**
     * atributo que represenra el nombre de la casta.
     */
    protected String nombreCasta;

    /**
     * atributo que representa las habilidades de la casta.
     */
    protected String[] habilidadesCasta;

    /**
     * Constructor por defecto.
     */
    public Casta() {
        this.probabilidadGolpeCritico = 0.2;
        this.probabilidadEvitarDaño = 0.2;
        this.dañoCritico = 1.5;

    }

    /**
     * @param prob_crit
     *            .
     * @param evasion
     *            .
     * @param daño_crit
     *            .
     */
    public Casta(final double prob_crit, final double evasion,
            final double daño_crit) {
        this.probabilidadGolpeCritico = prob_crit;
        this.probabilidadEvitarDaño = evasion;
        this.dañoCritico = daño_crit;
    }

    /**
     * @param caster
     *            .
     * @param atacado
     *            .
     * @return .
     */
    public abstract boolean habilidad1(Personaje caster, Peleable atacado);

    /**
     * @param caster
     *            .
     * @param atacado
     *            .
     * @return .
     */
    public abstract boolean habilidad2(Personaje caster, Peleable atacado);

    /**
     * @param caster
     *            .
     * @param atacado
     *            .
     * @return .
     */
    public abstract boolean habilidad3(Personaje caster, Peleable atacado);

    /**
     * @return Devuelve el nombre de la Casta pedido
     */
    public String getNombreCasta() {
        return this.nombreCasta;
    }

    /**
     * @return Devuelve las habilidades que posee dicha casta, en formato
     *         String[]
     */
    /**
     * @return devuelve todas las habilidades de la casta
     */
    public String[] getHabilidadesCasta() {
        return habilidadesCasta;
    }

    /**
     * @return devuelve la probabilidad de golpe critico.
     */
    public double getProbabilidadGolpeCritico() {
        return probabilidadGolpeCritico;
    }

    /**
     * @param probabilidadGolpeCritico
     *            .
     */
    public void setProbabilidadGolpeCritico(
            final double probabilidadGolpeCritico) {
        this.probabilidadGolpeCritico = probabilidadGolpeCritico;
    }

    /**
     * @return devuelve la probabilidad de Evitar Daño.
     */
    public double getProbabilidadEvitarDaño() {
        return probabilidadEvitarDaño;
    }

    /**
     * @param probabilidadEvitarDaño
     *            .
     */
    public void setProbabilidadEvitarDaño(final double probabilidadEvitarDaño) {
        this.probabilidadEvitarDaño = probabilidadEvitarDaño;
    }

    /**
     * @return devuelve el daño critico.
     */
    public double getDañoCritico() {
        return dañoCritico;
    }

    /**
     * @param dañoCritico
     *            .
     */
    public void setDañoCritico(final double dañoCritico) {
        this.dañoCritico = dañoCritico;
    }

    /**
     * addFuerzaInicial().
     *
     * @return el numero a sumarle a la fuerza inicial.
     */
    protected int addFuerzaInicial() {
        return 0;
    }

    /**
     * addInteligenciaInicial().
     *
     * @return el numero a sumarle a la Inteligencia inicial
     */
    public int addInteligenciaInicial() {
        return 0;
    }

    /**
     * addDestrezaInicial().
     *
     * @return el numero a sumarle a la destreza inicial
     */
    public int addDestrezaInicial() {
        return 0;
    }
}
