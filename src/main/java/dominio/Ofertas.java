package dominio;

/**
 * Clase que contiene el item ofertado y el demandado de una oferta que ocurre
 * en el mercado.
 *
 */
/**
 * @author Usuario
 *
 */
public class Ofertas{

    /**
     * id del usuario que realiza la oferta.
     */
    private int idUser;
    /**
     * nombre del usuario que realiza la oferta.
     */
    private String user;
    /**
     * item ofertado.
     */
    private int ofertado;
    /**
     * item demandado.
     */
    private int demandado;

    /**
     * Inidica si la oferta ya fue utilizada y ya se hizo el intercambio.
     */
    private boolean yaSeHizo = false;

    /**
     * @param ofert
     *            .
     * @param deman
     *            .
     * @param u
     *            .
     * @param id1
     *            constructor parametrizado por defecto.
     */
    public Ofertas(final int ofert, final int deman, final String u,
            final int id1) {
        this.ofertado = ofert;
        this.demandado = deman;
        this.user = u;
        this.idUser = id1;
    }

    /**
     * constructor por defecto vacio.
     */
    public Ofertas() {
    }

    /**
     * @return getter del item ofertado.
     */
    public int getOfertado() {
        return ofertado;
    }

    /**
     * @return getter del item demandado.
     */
    public int getDemandado() {
        return demandado;
    }

    /**
     * @return getter del usuario.
     */
    public String getUser() {
        return user;
    }

    /**
     * @return getter del id del usuario.
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @return si la oferta ya fue hecha.
     */
    public boolean isYaSeHizo() {
        return yaSeHizo;
    }

    /**
     * @param yaSeHizo.
     *            permite indicar cuando se haga una oferta.
     */
    public void setYaSeHizo(boolean yaSeHizo) {
        this.yaSeHizo = yaSeHizo;
    }




}
