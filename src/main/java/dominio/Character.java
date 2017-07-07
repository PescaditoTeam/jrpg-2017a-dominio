package dominio;

/**
 * @author Usuario clase character que implementa peleable.
 */
public class Character implements Peleable {
    /**
     * atributo que representa la fuerza del character.
     */
    protected int fuerza;
    /**
     * atributo que representa el nombre del character.
     */
    protected String nombre;
    /**
     * atributo que representa el nivel del character.
     */
    protected int nivel;

    /**
     * @return atributo que representa la mochila del character.
     */
    public Mochila getMochila() {
        return mochila;
    }

    /**
     * atributo que representa la defensa del character.
     */
    protected int defensa;
    /**
     * atributo que representa la salud del character.
     */
    protected int salud;

    /**
     * construdcto por defecto.
     */
    protected Mochila mochila;

    /**
     * constructor de la clase, instancia la mochila, es decir, la crea.
     */
    public Character() {
        mochila = new Mochila();

    }

    /**
     * metodo ganar experiencia.
     *
     * @param exp
     *            .
     * @return .
     */
    public boolean ganarExperiencia(final int exp) {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#despuesDeTurno()
     */
    @Override
    public void despuesDeTurno() {
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#estaVivo() metodo que devuelve si el character esta
     * vivo o esta muerto.
     */
    @Override
    public boolean estaVivo() {
        return salud > 0;
    }

    /**
     * @return devuelve la fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param f
     *            .
     */
    public void setFuerza(final int f) {
        this.fuerza = f;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#getNombre() Devuelve el nombre del personaje
     * solicitado
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para setear el nombre.
     *
     * @param nom
     *            .
     */
    public void setNombre(final String nom) {
        this.nombre = nom;
    }

    /**
     * @return devuelve el nivel del personaje
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param n
     *            .
     */
    public void setNivel(final int n) {
        this.nivel = n;
    }

    /**
     * @return devuelve la defensa del personaje
     */
    @Override
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param def
     *            .
     */
    @Override
    public void setDefensa(final int def) {
        this.defensa = def;
    }

    /*
     * metodo que devuelve 0 si es atacado.
     */
    @Override
    public int serAtacado(final int daño) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * getter de salud.
     */
    @Override
    public int getSalud() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * metodo para atacar.
     */
    @Override
    public int atacar(final Peleable atacado) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * metodo que otorga la experiencia.
     */
    @Override
    public int otorgarExp() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * getter de ataque.
     */
    @Override
    public int getAtaque() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setAtaque(final int ataque) {
        // TODO Auto-generated method stub

    }

    /*
     * devuelve si es un personaje o no.
     */
    @Override
    public boolean esPersonaje() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * es un metodo que avisa si fue afectado por el hechizo o no.
     */
    @Override
    public boolean esAfectadoPorHechizo() {
        // TODO Auto-generated method stub
        return false;
    }

}
