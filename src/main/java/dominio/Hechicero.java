package dominio;

/**
 * Un tipo de raza que hereda las caracteristicas de Casta.
 *
 */
public class Hechicero extends Casta {
    /**
     * Constante para liitar la energia o salud a 10.
     */
    private static final int LIMITEENERGIA = 10;
    /**
     * @param prob_crit
     *            .
     * @param evasion
     *            .
     * @param daño_crit
     *            .
     */
    public Hechicero(final double prob_crit, final double evasion,
            final double daño_crit) {
        super(prob_crit, evasion, daño_crit);
        this.nombreCasta = "Hechicero";
    }

    /**
     * Constructor por defecto de Hechicero.
     */
    public Hechicero() {
        super();
        this.nombreCasta = "Hechicero";
        habilidadesCasta = new String[3];
        habilidadesCasta[0] = "Bola de Fuego";
        habilidadesCasta[1] = "Curar Aliado";
        habilidadesCasta[2] = "Robar Energia y Salud";
    }

    // Bola de Fuego
    /*
     * (non-Javadoc)
     *
     * @see dominio.Casta#habilidad1(dominio.Personaje, dominio.Peleable)
     * Devuelve si el personaje que le pasamos tiene la habilidad pedida
     */
    @Override
    public boolean habilidad1(final Personaje caster, final Peleable atacado) {
        if (caster.getEnergia() > LIMITEENERGIA) {
            caster.setEnergia(caster.getEnergia() - 10);
            if (atacado.serAtacado(
                    (int) (caster.calcularPuntosDeMagia() * 1.5)) > 0) {
                return true;
            }
        }
        return false;
    }

    // Curar Aliado
    /*
     * habilidad 2 del hechicero donde cura al aliado.
     */
    @Override
    public boolean habilidad2(final Personaje caster, final Peleable aliado) {
        if (caster.getEnergia() > LIMITEENERGIA) {
            caster.setEnergia(caster.getEnergia() - LIMITEENERGIA);
            // es personaje esta sobreescrito en Personaje y NPC. cada uno
            // devolvera V
            // & F respectivamente
            if (aliado.esPersonaje()) {
                ((Personaje) aliado).serCurado(caster.calcularPuntosDeMagia());
                return true;
            }
        }
        return false;
    }

    // Robar Energia y Salud
    /*
     * habilidad 3 del hechicero donde roba la energia y la salud del atacado.
     */
    @Override
    public boolean habilidad3(final Personaje caster, final Peleable atacado) {
        if (caster.getEnergia() > LIMITEENERGIA) {
            caster.setEnergia(caster.getEnergia() - LIMITEENERGIA);

            if (atacado.esAfectadoPorHechizo()) {
                int energia_robada = ((Personaje) atacado)
                        .serDesernegizado(caster.calcularPuntosDeMagia());
                int salud_robada = ((Personaje) atacado)
                        .serRobadoSalud(caster.calcularPuntosDeMagia() / 2);
                caster.serEnergizado(energia_robada);
                caster.serCurado(salud_robada);
                return true;
            }
        }
        return false;
    }

    @Override
    /**
     * addInteligenciaInicial().
     *
     * @return Devuelve el numero a sumar al valor base
     */
    public int addInteligenciaInicial() {
        return 5;
    }

}
