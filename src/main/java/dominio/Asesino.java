package dominio;

/**
 * Un tipo de raza que hereda las caracteristicas de Casta.
 *
 */
public class Asesino extends Casta {

    /**
     * Constante para limitar la energia o salud a 10.
     */
    private static final int LIMITEENERGIA = 10;
    /**
     * Constante para definir la prob. de evitar daño.
     */
    private static final double PROBEVITARDAÑO1 = 0.15;
    /**
     * Constante para definir la prob. de evitar daño.
     */
    private static final double PROBEVITARDAÑO2 = 0.5;
    /**
     * @param prob_crit
     *            .
     * @param evasion
     *            .
     * @param daño_crit
     *            . Constructor parametrizado.
     */
    public Asesino(final double prob_crit, final double evasion,
            final double daño_crit) {
        super(prob_crit, evasion, daño_crit);
        this.nombreCasta = "Asesino";
    }

    /**
     * Constructor por defecto.
     */
    public Asesino() {
        super();
        this.nombreCasta = "Asesino";
        habilidadesCasta = new String[3];
        habilidadesCasta[0] = "Golpe Critico";
        habilidadesCasta[1] = "Aumentar Evasion";
        habilidadesCasta[2] = "Robar";
    }

    // Golpe Crítico
    /*
     * (non-Javadoc)
     *
     * @see dominio.Casta#habilidad1(dominio.Personaje, dominio.Peleable)
     * Devuelve si el personaje que le pasamos tiene la habilidad pedida
     */
    @Override
    public boolean habilidad1(final Personaje caster, final Peleable atacado) {
        if (caster.getEnergia() > LIMITEENERGIA) {
            caster.setEnergia(caster.getEnergia() - LIMITEENERGIA);
            if (atacado.serAtacado((int) (caster.ataque
                    * caster.getCasta().getDañoCritico())) > 0) {
                return true;
            }
        }
        return false;
    }

    // Aumentar Evasion

    /*
     * (non-Javadoc)
     *
     * @see dominio.Casta#habilidad2(dominio.Personaje, dominio.Peleable)
     * habilidad2 para Aumentar la evasion y evitar mas daño
     */
    @Override
    public boolean habilidad2(final Personaje caster, final Peleable atacado) {
        if (caster.getEnergia() > LIMITEENERGIA) {
            caster.setEnergia(caster.getEnergia() - LIMITEENERGIA);
            if ((this.getProbabilidadEvitarDaño() + PROBEVITARDAÑO1) < 0.5) {
                this.probabilidadEvitarDaño += PROBEVITARDAÑO1;
            } else {
                this.probabilidadEvitarDaño = 0.5;
            }
            return true;
        }
        return false;
    }

    // Robar
    /*
     * (non-Javadoc)
     *
     * @see dominio.Casta#habilidad3(dominio.Personaje, dominio.Peleable)
     * habilidad3 para robar, donde recibe un Personaje y un Peleable
     */
    @Override
    public boolean habilidad3(final Personaje caster, final Peleable atacado) {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Casta#addDestrezaInicial() metodos que agrega la destreza
     * inicial
     */
    @Override
    public int addDestrezaInicial() {
        return 5;
    }
}
